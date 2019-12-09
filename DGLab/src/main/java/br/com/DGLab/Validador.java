package br.com.DGLab;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Validador implements Serializable {
	public boolean login(String usuario, String compareUsuario, String senha, String compareSenha) {
		if (usuario == null || senha == null) {
			return false;
		}
		return (usuario.equals(compareUsuario) && senha.equals(compareSenha)) ? true : false;
	}
	
	public boolean usuario(String usuario) {
		return (usuario.length() < 3 || usuario.length() > 20) ? false : true;
	}
	
	public boolean senha(String senha) {
		return (senha.length() < 8 || senha.length() > 24) ? false : true;
	}
	
	public boolean confirmaSenha(String confirmaSenha, String senha) {
		return (confirmaSenha.length() < 3 || confirmaSenha.length() > 20 || !confirmaSenha.equals(senha)) ? false : true;
	}
	
	public boolean nome(String nome) {
		return (nome.length() < 3 || nome.length() > 500) ? false : true;
	}
	
	public boolean rua(String rua) {
		return (rua.length() < 3 || rua.length() > 100) ? false : true;
	}
	
	public boolean numero(String numero) {
		return (numero.length() > 10 || numero.length() == 0) ? false : true;
	}
	
	public boolean complemento(String complemento) {
		return (complemento.length() > 50) ? false : true;
	}
	
	public boolean cep(String cep) {
		return (cep.length() < 9) ? false : true;
	}
	
	public boolean bairro(String bairro) {
		return (bairro.length() < 3 || bairro.length() > 100) ? false : true;
	}

	public boolean cpfJaCadastrado(String cpf, List<Pessoa> pessoa) {
		for (Pessoa index : pessoa) {
			if (index.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public boolean cpf(String cpf) {
		if (cpf.length() < 11) {
			return false;
		}
		
		char[] aux = cpf.toCharArray();
		StringBuilder strBuildCpfNum = new StringBuilder();
		char[] cpfNum;
		int sum = 0;
		int mult = 2;
		int digitoVerificador;

		for (char index : aux) {
			if (Pattern.compile("[0-9]{1}").matcher(index + "").matches()) {
				strBuildCpfNum.append(index);
			}
		}
		cpfNum = strBuildCpfNum.toString().toCharArray();

		for (int i = cpfNum.length - 3; i >= 0; i--, mult++) {
			sum += Integer.parseInt(cpfNum[i] + "") * mult;
		}
		digitoVerificador = (sum % 11 < 2) ? 0 : (11 - sum % 11);

		if (!Integer.toString(digitoVerificador).equals(cpfNum[cpfNum.length - 2] + "")) {
			return false;
		}

		sum = 0;
		mult = 2;
		for (int i = cpfNum.length - 2; i >= 0; i--, mult++) {
			sum += Integer.parseInt(cpfNum[i] + "") * mult;
		}
		digitoVerificador = (sum % 11 < 2) ? 0 : (11 - sum % 11);

		if (!Integer.toString(digitoVerificador).equals(cpfNum[cpfNum.length - 1] + "")) {
			return false;
		}

		return true;
	}

	public boolean emailJaCadastrado(String email, List<Pessoa> pessoa) {
		for (Pessoa index : pessoa) {
			if (index.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	public boolean email(String email) {
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				return true;
			}
		}
		return false;
	}
	
	private String getStrNumberFromData(String data) {
		char[] charData = data.toCharArray();
		StringBuilder strBuildDataNumbers = new StringBuilder();
		
		for (char content : charData) {
			if (content >= '0' && content <= '9') {
				strBuildDataNumbers.append(content);
			}
		}
		return strBuildDataNumbers.toString();
	}
	
	private int getDiaFromData(String data) {
		char[] charData = getStrNumberFromData(data).toCharArray();
		StringBuilder strBuildDia = new StringBuilder();
		
		for (int index = 0; index <= 1; index++) {
			strBuildDia.append(charData[index]);
		}
		
		return Integer.parseInt(strBuildDia.toString());
	}
	
	private int getMesFromData(String data) {
		char[] charData = getStrNumberFromData(data).toCharArray();
		StringBuilder strBuildMes = new StringBuilder();
		
		for (int index = 2; index <= 3; index++) {
			strBuildMes.append(charData[index]);
		}
		
		return Integer.parseInt(strBuildMes.toString());
	}
	
	private int getAnoFromData(String data) {
		char[] charData = getStrNumberFromData(data).toCharArray();
		StringBuilder strBuildAno = new StringBuilder();
		
		for (int index = 4; index <= 7; index++) {
			strBuildAno.append(charData[index]);
		}
		
		return Integer.parseInt(strBuildAno.toString());
	}
	
	private boolean mesCom31Dias(int mes) {
		if (mes < 8) {
			if (mes % 2 == 0) {
				return false;
			}
		} else {
			if (mes % 2 == 1) {
				return false;
			}
		}
		return true;
	}
	
	private boolean anoBissexto(int ano) {
		return ((ano%4 == 0 && ano%100 != 0) || ano%400 == 0) ? true : false;
	}
	
	public boolean data(String data) {
		if (data.length() < 10) {
			return false;
		}
		
		int dia = getDiaFromData(data);
		int mes = getMesFromData(data);
		int ano = getAnoFromData(data);
		
//		return (dia < 1) ? false : ((mes < 1 || mes > 12) ? false : ((ano < 1800 || ano > GregorianCalendar.getInstance().get(Calendar.YEAR)) ? false : ((mesCom31Dias(mes)) ? (dia > 31 ? false : true) : ((mes != 2) ? (dia > 30 ? false : true) : ((anoBissexto(ano) ? (dia > 29 ? false : true) : (dia > 28 ? false : true)))))));
		
		if (dia < 1) {
			return false;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (ano < 1800 || ano > GregorianCalendar.getInstance().get(Calendar.YEAR)) {
			return false;
		}
		
		if (mesCom31Dias(mes)) {
			if (dia > 31) {
				return false;
			}
		} else {
			if (mes != 2) {
				if (dia > 30) {
					return false;
				}
			} else {
				if (anoBissexto(ano)) {
					if (dia > 29) {
						return false;
					}
				} else {
					if (dia > 28) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	public void mostraMensagemINFO(String mensagem, String complemento) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, complemento));
	}
	
	public void mostraMensagemWARN(String mensagem, String complemento) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, mensagem, complemento));
	}
	
	public void mostraMensagemERROR(String mensagem, String complemento) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, complemento));
	}
	
	public void mostraMensagemFATAL(String mensagem, String complemento) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_FATAL, mensagem, complemento));
	}
}
