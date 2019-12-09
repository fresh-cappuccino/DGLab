package br.com.DGLab;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@LocalBean
@TransactionAttribute(value = TransactionAttributeType.NOT_SUPPORTED)
public class PessoaEJB {
	@PersistenceContext(unitName = "ALUNOSJSF_JTA_PU")
	private EntityManager em;
//	private List rl;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public PessoaJPA getPessoaJPA(long id) {
		try {
			return em.find(PessoaJPA.class, id);
		} catch(Exception e) {
			return null;
		}
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public PessoaJPA insertPessoa(PessoaJPA pJPA) {
		try {
			em.persist(pJPA);
			return pJPA;
		} catch(Exception e) {
			Validador validador = new Validador();
			validador.mostraMensagemERROR("NÃO FOI POSSÍVEL INSERIR A PESSOA NO BANCO DE DADOS", "Contact admin.");
			return null;
		}
	}
	
//	private long getLastId() {
//		Query query = em.createNativeQuery("SELECT s_idpessoa.currval FROM DUAL");
//		
//		return (Long) query.getParameterValue(0);
//	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public PessoaJPA updatePessoa(PessoaJPA pJPA) {
		try {
			em.merge(pJPA);
			return pJPA;
		} catch(Exception e) {
			Validador validador = new Validador();
			validador.mostraMensagemERROR("NÃO FOI POSSÍVEL ATUALIZAR A PESSOA NO BANCO DE DADOS", "Contact admin.");
			return null;
		}
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public PessoaJPA deletePessoa(PessoaJPA pJPA) {
		try {
			long xid = pJPA.getIdBanco();
			
			if (!em.contains(pJPA)) {
			    pJPA = em.merge(pJPA);
			}
			em.remove(pJPA);
			return getPessoaJPA(xid);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			Validador validador = new Validador();
			validador.mostraMensagemERROR("NÃO FOI POSSÍVEL EXCLUIR A PESSOA DO BANCO DE DADOS", "Contact admin.");
			
			pJPA.setNome("NOME");
			pJPA.setIdBanco(0);
			pJPA.setTpPessoa("F");
			pJPA.setTpDoc("F");
			
			return pJPA;
		}
	}
	
	public List<PessoaJPA> getListPessoaJPA() {
		Query query = em.createNativeQuery("SELECT * FROM pessoa WHERE idpessoa > 516000", PessoaJPA.class);
		List<PessoaJPA> qpJPA = query.getResultList();
		return qpJPA;
	}
}
