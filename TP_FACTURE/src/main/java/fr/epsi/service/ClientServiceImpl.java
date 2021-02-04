package fr.epsi.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientServiceImpl implements ClientService {

	@PersistenceContext
	private EntityManager em;
	
	
	public void createClient(Client p) {
		em.persist(p.getNom());
		em.persist(p.getAdresse());
		
	}

}
