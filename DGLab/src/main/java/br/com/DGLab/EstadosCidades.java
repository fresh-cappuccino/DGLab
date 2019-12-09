package br.com.DGLab;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class EstadosCidades {
	JSONReadEstadosCidades jsonRead = new JSONReadEstadosCidades();
	private List<String> estados = jsonRead.getEstados();
	private List<String> cidades;
	
	@Inject private PessoaMB pessoaMB;
	
	public EstadosCidades() {
	}
	
	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public List<String> getCidades() {
		cidades = (jsonRead.getCidades(pessoaMB.getEstado() == null ? "Acre" : pessoaMB.getEstado()));
		return cidades;
	}

	public void setCidades(List<String> cidades) {
		cidades = jsonRead.getCidades(pessoaMB.getEstado() == null ? "Acre" : pessoaMB.getEstado());
		this.cidades = cidades;
	}
}
