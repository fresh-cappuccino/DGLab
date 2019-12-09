package br.com.DGLab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = "s_idpessoa", schema = "ADGERAL", allocationSize = 1, initialValue = 1)
public class PessoaJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idpessoa")
	@Column(name = "IDPESSOA", nullable = false)
	private long idBanco;
	
	@Column(name = "NMPESSOA", nullable = false)
	private String nome;
	
	@Column(name = "TPPESSOA", nullable = false)
	private String tpPessoa = "F";
	
	@Column(name = "TPDOC", nullable = false)
	private String tpDoc = "F";
	
	public PessoaJPA() {
		
	}
	
	public PessoaJPA(long idBanco, String tpPessoa, String nome, String tpDoc) {
		this.idBanco = idBanco;
		this.tpPessoa = tpPessoa;
		this.nome = nome;
		this.tpDoc = tpDoc;
	}
	public long getIdBanco() {
		return idBanco;
	}
	
	public void setIdBanco(long idBanco) {
		this.idBanco = idBanco;
	}

	public String getTpPessoa() {
		return tpPessoa;
	}
	
	public void setTpPessoa(String tpPessoa) {
		this.tpPessoa = tpPessoa;
	}
	
	public String getTpDoc() {
		return tpDoc;
	}
	
	public void setTpDoc(String tpDoc) {
		this.tpDoc = tpDoc;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
