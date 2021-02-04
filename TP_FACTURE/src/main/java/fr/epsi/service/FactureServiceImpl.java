package fr.epsi.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Article;
import fr.epsi.entite.Facture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImpl implements FactureService {

	@PersistenceContext
	private EntityManager em;
	
	
	public void createFacture(Facture p) {
		em.persist(p.getPrix());
		em.persist(p.getDate());
		em.persist(p.getNom());
	}

}
