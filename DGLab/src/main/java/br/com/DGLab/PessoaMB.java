package br.com.DGLab;
/*
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Locale;
import java.util.Map;
import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.InputSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
*/
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class PessoaMB implements Serializable {
	private String pagina = "login.xhtml";
	private String pdf = "blank.xhtml";
	private String icone = new String();
	private Login login = new Login();
	private boolean logado = false;
	private String confirmaSenhaConta;
	private Pessoa pessoa = new Pessoa();
	private Validador validador = new Validador();
	private static String id = "AAA000";
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private HtmlCommandButton cmdBtnLogin;
	private HtmlCommandButton cmdBtnEntrarLayout;
	private HtmlCommandButton cmdBtnCadastro;
	private HtmlCommandButton cmdBtnEntrarCadastro;
	private HtmlCommandButton cmdBtnEditar;
	private HtmlCommandButton cmdBtnLog;
	private HtmlCommandButton cmdBtnEntrarPdf;
	private HtmlCommandButton cmdBtnGerarPdf;
	
	@EJB
	private PessoaEJB pessoaEJB;
	
	public PessoaMB() {
		
	}
	
	public PessoaMB(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@PostConstruct
	void init() {
		/*try {
			List<PessoaJPA> pessoasJPA = pessoaEJB.getListPessoaJPA();
			
			for (PessoaJPA p : pessoasJPA) {
				pessoa.setIdBanco(p.getIdBanco());
				pessoa.setId(generateId());
				pessoa.setNome(p.getNome());
				
				String cpf = generateCPF();
				cpf = cpf.substring(0, 3).concat(".").concat(cpf.substring(3, 6)).concat(".").concat(cpf.substring(6, 9)).concat("-").concat(cpf.substring(9, 11));
				
				pessoa.setCpf(cpf);
				pessoa.setEmail(id.concat("@email.com"));
				pessoa.setDataNascimento("03/12/1998");
				pessoa.setTelefone("(16) 3964-3577");
				pessoa.setTelefone2("(16) 98850-5989");
				pessoa.setEstado("São Paulo");
				pessoa.setCidade("Ribeirão Preto");
				pessoa.setRua("Rua 1");
				pessoa.setNumero("1");
				pessoa.setCep("12345-678");
				pessoa.setBairro("Bairro 1");
				
				pessoas.add(pessoa.copy());
				pessoa = new Pessoa();
			}
		} catch(Exception e) {
			validador.mostraMensagemERROR("NÃO FOI POSSÍVEL REALIZAR A QUERY NO BANCO DE DADOS", "Contact admin.");
		}*/
	}
	
	public String getIcone() {
		icone = (pagina.equals("layout.xhtml")) ? "img/icone_chapeuzinho.png" : (pagina.equals("login.xhtml") ? "img/icone_login.png" : (pagina.equals("cadastro.xhtml") ? "img/icone_cadastro.png" : (pagina.equals("editar.xhtml") ? "img/icone_editar.png" : "img/icone_chapeuzinho.png")));
		
		return icone;
	}
	
	public void initPessoa() {
		pessoa = new Pessoa();
	}
	
	public void initEdicao(String id) {
		pessoa = getIndexOfPessoas(pessoas, id).copy();
	}
	
	public void initExclusao(String id) {
		pessoa = getIndexOfPessoas(pessoas, id).copy();
	}
	
	private static String calcDigVerif(String num) {
		Integer primDig, segDig;
		int soma = 0, peso = 10;
		for (int i = 0; i < num.length(); i++)
		soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
		
		if (soma % 11 == 0 | soma % 11 == 1)
	        primDig = new Integer(0);
	    else
	        primDig = new Integer(11 - (soma % 11));
		
	    soma = 0;
	    peso = 11;
	    for (int i = 0; i < num.length(); i++)
	            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
	    
	    soma += primDig.intValue() * 2;
	    if (soma % 11 == 0 | soma % 11 == 1)
	        segDig = new Integer(0);
	    else
	        segDig = new Integer(11 - (soma % 11));
	    
	    return primDig.toString() + segDig.toString();
	}
	
	private String generateCPF() {
		String iniciais = "";
	    Integer numero;
	    for (int i = 0; i < 9; i++) {
	        numero = new Integer((int) (Math.random() * 10));
	        iniciais += numero.toString();
	    }
	    return iniciais + calcDigVerif(iniciais);
	}
	
	public String getIconLogin() {
		return logado == true ? "ui-icon-unlocked" : "ui-icon-locked";
	}
	
	public void entrarLogin() {
		pagina = "login.xhtml";
	}
	
	public void entrarLayout() {
		pdf = "blank.xhtml";
		pagina = "layout.xhtml";
	}
	
	public void entrarCadastro() {
		initPessoa();
		pagina = "cadastro.xhtml";
	}
	
	public void entrarEditar(String id) {
		initEdicao(id);
		pagina = "editar.xhtml";
	}
	
	public void entrarExcluir(String id) {
		initExclusao(id);
		pagina = "excluir.xhtml";
	}
	
	public void entrarPdf() {
		pagina = "gerarPdf.xhtml";
	}
	
	public String getPagina() {
		return pagina;
	}
	
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	public String getWelcome() {
		return login.getWelcome();
	}
	
	public String getUsuario() {
		return login.getUsuario() == null ? "" : login.getUsuario();
	}
	
	public void setUsuario(String usuario) {
		login.setUsuario(usuario.toLowerCase().trim());
	}
	
	public String getSenha() {
		return login.getSenha() == null ? "" : login.getSenha();
	}
	
	public void setSenha(String senha) {
		login.setSenha(senha);
	}
	
	public String getConfirmaSenha() {
		return login.getConfirmaSenha() == null ? "" : login.getConfirmaSenha();
	}
	
	public void setConfirmaSenha(String confirmaSenha) {
		login.setConfirmaSenha(confirmaSenha);
	}
	
	public Login getLogin() {
		return login;
	}
	
	public String loginMB() {
		if (login.login().equals("#")) {
			entrarLogin(); 
		} else{
			entrarLayout();
		}
		return (pagina.equals("layout")) ? "index" : null;
	}
	
	private String generateId() {
		int idNumber = Integer.parseInt(id.substring(3, id.length()));
		id = id.substring(0, 3).concat(padString(Integer.toString(idNumber+1), '0', 3));
		
		if (idNumber > 999) {
			char[] charLetters = id.substring(0, 3).toCharArray();
			
			if (charLetters[2] == 'Z') {
				charLetters[2] = 'A';
				
				if (charLetters[1] == 'Z') {
					charLetters[1] = 'A';
					charLetters[0] += 1;
				} else {
					charLetters[1] += 1;
				}
			} else {
				charLetters[2] += 1;
			}
			
			idNumber = 0;

			StringBuilder strBuildLetterId = new StringBuilder();
			for (char content : charLetters) {
				strBuildLetterId.append(content);
			}
			id = strBuildLetterId.toString().concat("001");
		}
		
		return id.substring(0, 3).concat(padString(Integer.toString(idNumber), '0', 3));
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getId() {
		return pessoa.getId();
	}
	
	public void setId(String id) {
		pessoa.setId(id);
	}
	
	public String getUsuarioConta() {
		return pessoa.getUsuario();
	}
	
	public void setUsuarioConta(String usuarioConta) {
		pessoa.setUsuario(usuarioConta);
	}
	
	public String getSenhaConta() {
		return pessoa.getSenha();
	}
	
	public void setSenhaConta(String senhaConta) {
		pessoa.setSenha(senhaConta);
	}
	
	public String getConfirmaSenhaConta() {
		return confirmaSenhaConta;
	}
	
	public void setConfirmaSenhaConta(String confirmaSenhaConta) {
		this.confirmaSenhaConta = confirmaSenhaConta;
	}
	
	public String getNome() {
		return pessoa.getNome();
	}
	
	public void setNome(String nome) {
		String[] nomeSplit = nome.trim().toUpperCase().split(" ");
		StringBuilder strBuildNome = new StringBuilder();
		
		for (String content : nomeSplit) {
			if (!content.equals(" ") && !content.equals("")) {
				strBuildNome.append(content + " ");
			}
		}
		this.pessoa.setNome(strBuildNome.toString().trim());
	}
	
	public String getEmail() {
		return pessoa.getEmail();
	}
	
	public void setEmail(String email) {
		this.pessoa.setEmail(email.trim().toLowerCase());
	}
	
	public String getCpf() {
		return pessoa.getCpf();
	}
	
	public void setCpf(String cpf) {
		this.pessoa.setCpf(cpf.trim());
	}
	
	public String getDataNascimento() {
		return pessoa.getDataNascimento();
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.pessoa.setDataNascimento(dataNascimento.trim());
	}
	
	public String getTelefone() {
		return pessoa.getTelefone();
	}
	
	public void setTelefone(String telefone) {
		this.pessoa.setTelefone(telefone.trim());
	}
	
	public String getTelefone2() {
		return pessoa.getTelefone2();
	}
	
	public void setTelefone2(String telefone2) {
		this.pessoa.setTelefone2(telefone2.trim());
	}
	
	public String getRua() {
		return pessoa.getRua();
	}
	
	public void setRua(String rua) {
		String[] ruaSplit = rua.trim().toLowerCase().split(" ");
		StringBuilder strBuildRua = new StringBuilder();
		
		for (String content : ruaSplit) {
			if (!content.equals(" ") && !content.equals("")) {
				strBuildRua.append(content + " ");
			}
		}
		this.pessoa.setRua(strBuildRua.toString().trim());
	}
	
	public String getNumero() {
		return pessoa.getNumero();
	}
	
	public void setNumero(String numero) {
		String[] numeroSplit = numero.trim().toUpperCase().split(" ");
		StringBuilder strBuildNumero = new StringBuilder();
		
		for (String content : numeroSplit) {
			if (!content.equals(" ") && !content.equals("")) {
				strBuildNumero.append(content);
			}
		}
		this.pessoa.setNumero(strBuildNumero.toString());
	}
	
	public String getBairro() {
		return pessoa.getBairro();
	}
	
	public void setBairro(String bairro) {
		String[] bairroSplit = bairro.trim().toLowerCase().split(" ");
		StringBuilder strBuildBairro = new StringBuilder();
		
		for (String content : bairroSplit) {
			if (!content.equals(" ") && !content.equals("")) {
				strBuildBairro.append(content + " ");
			}
		}
		this.pessoa.setBairro(strBuildBairro.toString().trim());
	}
	
	public String getCep() {
		return pessoa.getCep();
	}
	
	public void setCep(String cep) {
		this.pessoa.setCep(cep.trim());
	}
	
	public String getComplemento() {
		return pessoa.getComplemento();
	}
	
	public void setComplemento(String complemento) {
		String[] complementoSplit = complemento.trim().split(" ");
		StringBuilder strBuildComplemento = new StringBuilder();
		
		for (String content : complementoSplit) {
			if (!content.equals(" ") && !content.equals("")) {
				strBuildComplemento.append(content + " ");
			}
		}
		this.pessoa.setComplemento(strBuildComplemento.toString().trim());
	}
	
	public String getCidade() {
		return pessoa.getCidade();
	}
	
	public void setCidade(String cidade) {
		this.pessoa.setCidade(cidade.trim());
	}
	
	public String getEstado() {
		return pessoa.getEstado();
	}
	
	public void setEstado(String estado) {
		this.pessoa.setEstado(estado.trim());
	}
	
	public List<Pessoa> getPessoas(){
		return pessoas;
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void entrarPdfView () {
		setPdf(validador.login(login.getUsuario(), login.getConfirmaUsuario(), login.getConfirmaSenha(), login.getDefaultPass()) ? "pdfView.xhtml" : "blank.xhtml");
	}
	
	public String getPdf() {
		return pdf;
	}
	
	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	/*
	private Connection getConexao() throws SQLException, ClassNotFoundException {
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.57:1521:DESENV", "leoferreira", "1234-leo");
		return conexao;
	}
	
	private ByteArrayOutputStream gerarPDF(String diretorio) {
//		System.out.println("PRIMEIRO ERRO AQUI?");
		ByteArrayOutputStream retorno = new ByteArrayOutputStream();
//		System.out.println("Cria o ByteArrayOutputStream()");
		
		String relatorio = diretorio + "Pessoas.jasper";
//		System.out.println("Cria a string do diretorio: " + relatorio);
//		String imagem = diretorio + "wood.jpg";
		try {
			// Faz a compilação do relatório
//			JasperReport jasperReport = JasperCompileManager.compileReport(relatorio);
//			System.out.println("Cria o jasperreport");
			
			// Cria o mapa de parâmetros que será enviado ao relatório
			HashMap<String, Object> parametros = new HashMap<String, Object>();
//			System.out.println("Cira o HashMap de parametros");
			
			// Faz o apontamento para a imagem que fce no top do relatório
			// paramatros.put("logo", imagem);
			
			// Preenche os dados do relatório
			JasperPrint jasperPrint = JasperFillManager.fillReport(relatorio, parametros, getConexao());
//			System.out.println("Cria o jasperprint");
			
			// Gera o arquivo PDF no caminho especificado
			JasperExportManager.exportReportToPdfStream(jasperPrint, retorno);
//			System.out.println("Esporta o PDF");
			
		} catch (Exception e) {
//			System.out.println("ERRO AO CRIAR PDF");
			e.printStackTrace();
		}
		return retorno;
	}
	
	public void getFile() throws IOException {
		ByteArrayOutputStream baos;
		
		try {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
			
//			System.out.println("Inicio");
			PessoaMB geraRelatorio = new PessoaMB();
			
			String realPath = request.getServletContext().getRealPath("/WEB-INF");
			String path = realPath + "\\classes\\report\\";
			baos = geraRelatorio.gerarPDF(path);
//			System.out.println("Gera o Baos");
			response.setContentType("application/pdf");
			response.setContentLength(baos.size());
			response.setHeader("Content-disposition", "inline; filename=ListagemAlunos.pdf");
			
//			System.out.println("Seta o Header");
			
			response.getOutputStream().write(baos.toByteArray());
			
//			System.out.println("Faz o write");
			
			response.getOutputStream().flush();
			
//			System.out.println("Da o flush");
			
			response.getOutputStream().close();
			
//			System.out.println("Da o close");
		} catch(Exception e) {
			System.out.println(e.getMessage());
//			System.out.println("KKKKKK");
			validador.mostraMensagemERROR("NÃO FOI POSSÍVEL GERAR O PDF!", "Contact admin.");
//			return null;
		}
		
//		String caminhoWebInf = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/WEB-INF");
//		InputStream stream = new FileInputStream(caminhoWebInf+"/classes/report/ListagemAlunos.pdf");
//		file = new DefaultStreamedContent(stream, "application/pdf", "ListagemAlunos.pdf");
		
//		System.out.println(stream.available());
//		return file;
	}
	*/
	public void addPessoa() {
		if (validador.login(login.getUsuario(), login.getConfirmaUsuario(), login.getConfirmaSenha(), login.getDefaultPass())) {
			int erros = 0;
			
			if (validador.usuario(pessoa.getUsuario())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho do nome do usuario inválido! Digite algo entre 3 e 20 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			if (validador.senha(pessoa.getSenha())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho da senha inválida! Digite algo entre 8 e 24 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			if (validador.confirmaSenha(confirmaSenhaConta, pessoa.getSenha())) {
				validador.mostraMensagemERROR(">>>Erro! Senhas não compatíveis!",
						"Contact admin.");
				erros += 1;
			}
			if (!validador.nome(pessoa.getNome())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho do nome do aluno inválido! Digite algo entre 3 e 500 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			if (!validador.cpf(pessoa.getCpf())) {
				validador.mostraMensagemERROR(">>>Erro! CPF inválido!", "Contact admin.");
				erros += 1;
			}
			if (validador.cpfJaCadastrado(pessoa.getCpf(), pessoas)) {
				validador.mostraMensagemERROR(">>>Erro! CPF já cadastrado!", "Contact admin.");
				erros += 1;
			}
			if (!validador.email(pessoa.getEmail())) {
				validador.mostraMensagemERROR(">>>Erro! E-mail inválido!", "Contact admin.");
				erros += 1;
			}
			if (validador.emailJaCadastrado(pessoa.getEmail(), pessoas)) {
				validador.mostraMensagemERROR(">>>Erro! E-mail já cadastrado!", "Contact admin.");
				erros += 1;
			}
			if (!validador.data(pessoa.getDataNascimento())) {
				validador.mostraMensagemERROR(">>>Erro! Data inválida!", "Contact admin.");
				erros += 1;
			}
			if (!validador.rua(pessoa.getRua())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho do nome da rua inválido! Digite algo entre 3 e 100 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			if (!validador.numero(pessoa.getNumero())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho do número inválido! Digite algo entre 1 e 10 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			if (!validador.complemento(pessoa.getComplemento())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho do complemento inválido! Digite algo menor que 50 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			if (!validador.cep(pessoa.getCep())) {
				validador.mostraMensagemERROR(">>>Erro! CEP inválido!", "Contact admin.");
				erros += 1;
			}
			if (!validador.bairro(pessoa.getBairro())) {
				validador.mostraMensagemERROR(">>>Erro! Tamanho do nome do bairro inválido! Digite algo entre 3 e 100 caracteres!",
						"Contact admin.");
				erros += 1;
			}
			
			if (erros == 0) {
				try {
					/*PessoaJPA pJPA = new PessoaJPA();
					
					pJPA.setNome(pessoa.getNome());
					pJPA.setTpPessoa("F");
					pJPA.setTpDoc("F");
					
					pJPA = pessoaEJB.insertPessoa(pJPA);*/
					
					pessoa.setId(generateId());
//					pessoa.setIdBanco(pJPA.getIdBanco());
					
					pessoas.add(pessoa.copy());
				} catch(Exception e) {
					validador.mostraMensagemERROR("SQL EXCEPTION! NÃO FOI POSSÍVEL ADICIONAR O CADASTRO AO BANCO!", "Contact admin.");
				}
				
				FacesContext context = FacesContext.getCurrentInstance();
		
				context.addMessage(null, new FacesMessage("SUCESSO", pessoa.getNome() + " cadastrado com sucesso"));
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro realizado com sucesso!", "Contact admin."));
				
				pessoa = new Pessoa();
				
//				entrarLayout();
//				return "index";
			}
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, ">>>Você precisa estar logado para realizar um cadastro!", "Contact admin."));
		}
//		return null;
	}
	
	public void editarPessoa() {
		if (validador.login(login.getUsuario(), login.getConfirmaUsuario(), login.getConfirmaSenha(), login.getDefaultPass())) {
			if (!getIndexOfPessoas(pessoas, pessoa.getId()).getId().equals("id")) {
				int erros = 0;
				
				if (!validador.nome(pessoa.getNome())) {
					validador.mostraMensagemERROR(">>>Erro! Tamanho do nome do aluno inválido! Digite algo entre 3 e 500 caracteres!",
							"Contact admin.");
					erros += 1;
				}
				if (!validador.cpf(pessoa.getCpf())) {
					validador.mostraMensagemERROR(">>>Erro! CPF inválido!", "Contact admin.");
					erros += 1;
				}
				if (validador.cpfJaCadastrado(pessoa.getCpf(), pessoas) && !pessoa.getCpf().equals(getIndexOfPessoas(pessoas, pessoa.getId()).getCpf())) {
					validador.mostraMensagemERROR(">>>Erro! CPF já cadastrado!", "Contact admin.");
					erros += 1;
				}
				if (!validador.email(pessoa.getEmail())) {
					validador.mostraMensagemERROR(">>>Erro! E-mail inválido!", "Contact admin.");
					erros += 1;
				}
				if (validador.emailJaCadastrado(pessoa.getEmail(), pessoas) && !pessoa.getEmail().equals(getIndexOfPessoas(pessoas, pessoa.getId()).getEmail())) {
					validador.mostraMensagemERROR(">>>Erro! E-mail já cadastrado!", "Contact admin.");
					erros += 1;
				}
				if (!validador.data(pessoa.getDataNascimento())) {
					validador.mostraMensagemERROR(">>>Erro! Data inválida!", "Contact admin.");
					erros += 1;
				}
				if (!validador.rua(pessoa.getRua())) {
					validador.mostraMensagemERROR(">>>Erro! Tamanho do nome da rua inválido! Digite algo entre 3 e 100 caracteres!",
							"Contact admin.");
					erros += 1;
				}
				if (!validador.numero(pessoa.getNumero())) {
					validador.mostraMensagemERROR(">>>Erro! Tamanho do número inválido! Digite algo entre 1 e 10 caracteres!",
							"Contact admin.");
					erros += 1;
				}
				if (!validador.complemento(pessoa.getComplemento())) {
					validador.mostraMensagemERROR(">>>Erro! Tamanho do complemento inválido! Digite algo menor que 50 caracteres!",
							"Contact admin.");
					erros += 1;
				}
				if (!validador.cep(pessoa.getCep())) {
					validador.mostraMensagemERROR(">>>Erro! CEP inválido!", "Contact admin.");
					erros += 1;
				}
				if (!validador.bairro(pessoa.getBairro())) {
					validador.mostraMensagemERROR(">>>Erro! Tamanho do nome do bairro inválido! Digite algo entre 3 e 100 caracteres!",
							"Contact admin.");
					erros += 1;
				}
				if (erros == 0) {
					try {
						PessoaJPA pJPA = new PessoaJPA();
						
						int p = pessoas.indexOf(getIndexOfPessoas(pessoas, pessoa.getId()));
						
						pJPA.setNome(pessoa.getNome());
						pJPA.setIdBanco(pessoa.getIdBanco());
						pJPA = pessoaEJB.updatePessoa(pJPA);
						
						if (pJPA != null) {
							pessoas.get(p).setNome(pessoa.getNome());
							pessoas.get(p).setCpf(pessoa.getCpf());
							pessoas.get(p).setEmail(pessoa.getEmail());
							pessoas.get(p).setDataNascimento(pessoa.getDataNascimento());
							pessoas.get(p).setTelefone(pessoa.getTelefone());
							pessoas.get(p).setTelefone2(pessoa.getTelefone2());
							pessoas.get(p).setEstado(pessoa.getEstado());
							pessoas.get(p).setCidade(pessoa.getCidade());
							pessoas.get(p).setRua(pessoa.getRua());
							pessoas.get(p).setNumero(pessoa.getNumero());
							pessoas.get(p).setComplemento(pessoa.getComplemento());
							pessoas.get(p).setCep(pessoa.getCep());
							pessoas.get(p).setBairro(pessoa.getBairro());
						}
					} catch(Exception e) {
						validador.mostraMensagemERROR("SQL EXCEPTION! NÃO FOI POSSÍVEL EDITAR O CADASTRO NO BANCO!", "Contact admin.");
					}
					
					FacesContext context = FacesContext.getCurrentInstance();
					
					context.addMessage(null, new FacesMessage("SUCESSO", "Aluno " + pessoa.getNome() + " editado com sucesso"));
					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_INFO, "Aluno editado com sucesso!", "Contact admin."));
					
//					entrarLayout();
//					return "index";
				}
			} else {
				validador.mostraMensagemWARN("Cadastro não encontrado!", "Contact admin.");
			}
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, ">>>Você precisa estar logado para realizar um cadastro!", "Contact admin."));
		}
//		return null;
	}
	
	public String excluirPessoa() {
		if (validador.login(login.getUsuario(), login.getConfirmaUsuario(), login.getConfirmaSenha(), login.getDefaultPass())) {
			if (!getIndexOfPessoas(pessoas, pessoa.getId()).getId().equals("id")) {
				try {
					PessoaJPA pJPA = new PessoaJPA();
					pJPA.setNome(pessoa.getNome());
					pJPA.setIdBanco(pessoa.getIdBanco());
					pJPA.setTpPessoa("F");
					pJPA.setTpDoc("F");
					
					pJPA = pessoaEJB.deletePessoa(pJPA);
					
					if (pJPA == null) {
						pessoas.remove(getIndexOfPessoas(pessoas, pessoa.getId()));
						
						entrarLayout();
						return "index";
					} else {
						validador.mostraMensagemERROR("SQL EXCEPTION! NÃO FOI POSSÍVEL EXCLUIR O CADASTRO DO BANCO!", "Contact admin.");
						
						return null;
					}
				} catch(Exception e) {
					validador.mostraMensagemERROR("SQL EXCEPTION! NÃO FOI POSSÍVEL EXCLUIR O CADASTRO DO BANCO!", "Contact admin.");
					
					return null;
				}
			}
			entrarLayout();
			return "index";
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, ">>>Você precisa estar logado para excluir um cadastro!", "Contact admin."));
			return null;
		}
	}
	
	public String naoRealizarAcao() {
		entrarLayout();
		return "index";
	}
	
	private Pessoa getIndexOfPessoas(List<Pessoa> pessoas, String searchId) {
		for (Pessoa content : pessoas) {
			if (content.getId().equals(searchId)) {
				return content;
			}
		}
		return new Pessoa("id", "usuario", "senha", 0, "Nome", "email@email.com", "000.000.000-00", "00/00/0000",
				"(00) 0000-0000", "(00) 00000-0000", "Rua", "Número", "Bairro",
				"00000-000", "Complemento", "Acrelândia", "Acre");
	}
	
	private String padString(String string, char charComplement, int stringSize) {
		while (string.length() < stringSize) {
			string = (charComplement + "").concat(string);
		}

		return string;
	}
	
	public String botaoLog() {
		logado = (validador.login(login.getUsuario(), login.getConfirmaUsuario(), login.getConfirmaSenha(), login.getDefaultPass()) == true) ? true : false;
		return (logado == true) ? "LOGOUT" : "LOGIN";
	}
	
	public String realizarLogin() {
		if (logado == true) {
			login.setSenha("");
			login.setConfirmaSenha("");
			logado = false;
			
			entrarLayout();
			
			return "index";
		} else {
			entrarLogin();
			
			return null;
		}
	}
	
	public HtmlCommandButton getCmdBtnEntrarLayout() {
		return cmdBtnEntrarLayout;
	}
	
	public void setCmdBtnEntrarLayout(HtmlCommandButton cmdBtnEntrarLayout) {
		this.cmdBtnEntrarLayout = cmdBtnEntrarLayout;
	}
	
	public HtmlCommandButton getCmdBtnCadastro() {
		return cmdBtnCadastro;
	}
	
	public void setCmdBtnCadastro(HtmlCommandButton cmdBtnCadastro) {
		this.cmdBtnCadastro = cmdBtnCadastro;
	}
	
	public HtmlCommandButton getCmdBtnEntrarCadastro() {
		return cmdBtnEntrarCadastro;
	}
	
	public void setCmdBtnEntrarCadastro(HtmlCommandButton cmdBtnEntrarCadastro) {
		this.cmdBtnEntrarCadastro = cmdBtnEntrarCadastro;
	}
	
	public HtmlCommandButton getCmdBtnEditar() {
		return cmdBtnEditar;
	}
	
	public void setCmdBtnEditar(HtmlCommandButton cmdBtnEditar) {
		this.cmdBtnEditar = cmdBtnEditar;
	}
	
	public HtmlCommandButton getCmdBtnLog() {
		return cmdBtnLog;
	}
	
	public void setCmdBtnLog(HtmlCommandButton cmdBtnLog) {
		this.cmdBtnLog = cmdBtnLog;
	}
	
	public HtmlCommandButton getCmdBtnEntrarPdf() {
		return cmdBtnEntrarPdf;
	}
	
	public void setCmdBtnEntrarPdf(HtmlCommandButton cmdBtnEntrarPdf) {
		this.cmdBtnEntrarPdf = cmdBtnEntrarPdf;
	}
	
	public HtmlCommandButton getCmdBtnGerarPdf() {
		return cmdBtnGerarPdf;
	}
	
	public void setCmdBtnGerarPdf(HtmlCommandButton cmdBtnGerarPdf) {
		this.cmdBtnGerarPdf = cmdBtnGerarPdf;
	}
	
	public HtmlCommandButton getCmdBtnLogin() {
		return cmdBtnLogin;
	}
	
	public void setCmdBtnLogin(HtmlCommandButton cmdBtnLogin) {
		this.cmdBtnLogin = cmdBtnLogin;
	}
}
