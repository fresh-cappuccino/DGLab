package br.com.DGLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Named(value = "pdfControlerView")
@SessionScoped
public class PDFControllerView implements Serializable {
	private String typePDF = "Simples";
	private List<String> typesPDF = new ArrayList<String>();
	private HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//	private String nmArqJrxml = "Pessoas.jrxml";
	private String nmArqPDF = "relatorio-dglab.pdf";
	private String caminho = request.getServletContext().getRealPath("/WEB-INF") + "/classes/br/com/report/";
	private StreamedContent streamedContent;
	
	@PostConstruct
	void init() {
		typesPDF.add("Simples");
		typesPDF.add("Tabelado");
	}

	public String getTypePDF() {
		return typePDF;
	}
	
	public void setTypePDF(String typePDF) {
		this.typePDF = typePDF;
	}
	
	public List<String> getTypesPDF() {
		return typesPDF;
	}
	
	public void setTypesPDF(List<String> typePDF) {
		this.typesPDF = typePDF;
	}
	
	/*private Connection getConexao() throws SQLException {
		//---------------URL------------------//
		String oracleDir = "jdbc:oracle:thin:@";
		String host = "192.168.20.57";
		String porta = "1521";
		String dataBase = "DESENV";
		//---------------USUARIO--------------//
		String usuario = "leoferreira";
		//---------------SENHA----------------//
		String senha = "1234-leo";
		
		return DriverManager.getConnection(oracleDir + host + ":" + porta + ":" + dataBase, usuario, senha);
	}*/
	
	private void geraPDF(String nmArqJasper) {
		File file = new File(caminho+nmArqPDF);
		
		if (file.exists()) {
			file.delete();
		}
		
		String diretorio = caminho + nmArqJasper;
		try {
			
			// Cria o mapa de parâmetros que será enviado ao relatório
			HashMap<String, Object> parametros = new HashMap<String, Object>();
			
			// Preenche os dados do relatório
			JasperPrint jasperPrint = JasperFillManager.fillReport(diretorio, parametros, /*getConexao()*/ new JRBeanCollectionDataSource(new ArrayList<>()));
			
			// Gera o arquivo PDF no caminho especificado
			JasperExportManager.exportReportToPdfFile(jasperPrint, caminho+nmArqPDF);
			
		} catch (Exception e) {
//			System.out.println("ERRO AO CRIAR PDF");
			e.printStackTrace();
		}
	}
	
	public StreamedContent getStreamedContent() {
		if (typePDF.equals("Simples")) {
			geraPDF("report-sm.jasper");
		} else {
			geraPDF("report.jasper");
		}
		
		try {
			FileInputStream fis = new FileInputStream(new File(caminho+nmArqPDF));
			streamedContent = new DefaultStreamedContent(fis, "application/pdf");
		} catch(Exception e) {
			Validador validador = new Validador();
			validador.mostraMensagemERROR("NÃO FOI POSSÍVEL GERAR O PDF", "Contact admin.");
			System.out.println(e.getMessage());
		}
		
		if (FacesContext.getCurrentInstance().getRenderResponse()) {
            return new DefaultStreamedContent();
        } else {
        	return streamedContent;
        }
	}
	
	public void setStreamedContent(StreamedContent streamedContent) {
		this.streamedContent = streamedContent;
	}
}
