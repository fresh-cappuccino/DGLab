package br.com.DGLab;

import java.io.Serializable;

public class Login implements Serializable{
	private String welcome = "Bem vindo(a), ";
	private String usuario;
	private String confirmaUsuario = "leo_andrade";
	private String senha;
	private String confirmaSenha;
	private Validador validador = new Validador();
	
	public Login() {
		
	}
	
	public Login(String welcome, String usuario, String senha) {
		this.welcome = welcome;
		this.usuario = usuario;
		this.senha = senha;
		this.confirmaSenha = senha;
	}
	
	public String getWelcome() {
		return welcome.concat(validador.login(usuario, confirmaUsuario, confirmaSenha, defaultPass()) ? (usuario + "!") : "USER_?! *Realize o Login para fazer qualquer alteração*");
	}
	
	public String getUsuario() {
		return usuario == null ? "" : usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario.toLowerCase().trim();
	}
	
	public String getConfirmaUsuario() {
		return confirmaUsuario;
	}
	
	private String hashSenha(String senha) {
		char[] senhaSplit = senha.trim().toCharArray();
		StringBuilder strBuildSenha = new StringBuilder();
		int lastNum = 42;
		int signal = -1;
		
		for (int index = 0; index < senhaSplit.length; index++) {
			if (senhaSplit[index] >= '0' && senhaSplit[index] <= '9') {
				double senhaSplitNumber = Double.parseDouble(senhaSplit[index]+"");
				
				double aux = Math.pow(Math.abs(senhaSplitNumber - index), 2);
				double div1 = (senhaSplit.length + index) - Math.pow(42, 1/(index == 0 ? 1 : index)) - 42 * signal;
				
				lastNum = (int)(Math.tanh(Math.sqrt((senhaSplitNumber * aux) / ((div1) == 0 ? 1 : div1))));
				senhaSplit[index] += lastNum;
			} else {
				senhaSplit[index] += Math.pow(index, 3) - lastNum * signal;
				signal *= -1;
			}
			if (senhaSplit[index] < 0) {
				senhaSplit[index] *= -1;
			}
			
			while (senhaSplit[index] > 255) {
				senhaSplit[index] /= 2;
			}
			
			strBuildSenha.append(senhaSplit[index]);
		}
		
		while (strBuildSenha.toString().length() <= 42) {
			int acumulador = 0;
			
			String strSenha = strBuildSenha.toString();
			char[] charSenha = strSenha.toCharArray();
			
			for (int index = 0; index < strSenha.length(); index++) {
				acumulador += index * (int)charSenha[index] * signal;
				signal *= -1;
			}
			
			if (acumulador < 0) {
				acumulador *= -1;
			}
			
			while (acumulador > 255) {
				acumulador /= 2;
			}
			
			strBuildSenha.append((char)acumulador);
		}
		
		return strBuildSenha.toString();
	}
	
	public String getSenha() {
		String copySenha = (this.senha == null || this.senha.equals("")) ? "" : this.senha;
		return copySenha.length() <= 42 ? hashSenha(copySenha) : "";
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
		
		if (this.senha.length() <= 42 && !this.senha.equals("")) {
			this.senha = hashSenha(senha);
		}
	}
	
	private String defaultPass() {
		StringBuilder strBuildDefaultPass = new StringBuilder();
		
		strBuildDefaultPass.append((char)147);
		strBuildDefaultPass.append((char)78);
		strBuildDefaultPass.append((char)147);
		strBuildDefaultPass.append((char)100);
		strBuildDefaultPass.append((char)203);
		strBuildDefaultPass.append((char)202);
		strBuildDefaultPass.append((char)177);
		strBuildDefaultPass.append((char)198);
		strBuildDefaultPass.append((char)166);
		strBuildDefaultPass.append((char)197);
		strBuildDefaultPass.append((char)144);
		strBuildDefaultPass.append((char)173);
		strBuildDefaultPass.append((char)233);
		strBuildDefaultPass.append((char)141);
		strBuildDefaultPass.append((char)181);
		strBuildDefaultPass.append((char)214);
		strBuildDefaultPass.append((char)153);
		strBuildDefaultPass.append((char)152);
		strBuildDefaultPass.append((char)170);
		strBuildDefaultPass.append((char)212);
		strBuildDefaultPass.append((char)145);
		strBuildDefaultPass.append((char)142);
		strBuildDefaultPass.append((char)150);
		strBuildDefaultPass.append((char)221);
		strBuildDefaultPass.append((char)131);
		strBuildDefaultPass.append((char)131);
		strBuildDefaultPass.append((char)135);
		strBuildDefaultPass.append((char)204);
		strBuildDefaultPass.append((char)197);
		strBuildDefaultPass.append((char)202);
		strBuildDefaultPass.append((char)208);
		strBuildDefaultPass.append((char)213);
		strBuildDefaultPass.append((char)219);
		strBuildDefaultPass.append((char)22);
		strBuildDefaultPass.append((char)187);
		strBuildDefaultPass.append((char)175);
		strBuildDefaultPass.append((char)128);
		strBuildDefaultPass.append((char)255);
		strBuildDefaultPass.append((char)166);
		strBuildDefaultPass.append((char)241);
		strBuildDefaultPass.append((char)131);
		strBuildDefaultPass.append((char)199);
		strBuildDefaultPass.append((char)177);
		
		return strBuildDefaultPass.toString();
	}
	
	public String getDefaultPass() {
		return defaultPass();
	}
	
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	public String login() {
		setConfirmaSenha(senha);
		
		if (!usuario.equals(confirmaUsuario)) {
			validador.mostraMensagemERROR(">>>Erro! Usuário inválido!", "Contact admin.");
			return "#";
		} else if (!senha.equals(defaultPass())) {
			validador.mostraMensagemERROR(">>>Erro! Senha inválida!", "Contact admin.");
			return "#";
		}
		senha = "";
		
		return "index";
	}
}
