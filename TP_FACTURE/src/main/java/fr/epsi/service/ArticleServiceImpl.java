package fr.epsi.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Article;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService {

	@PersistenceContext
	private EntityManager em;
	
	
	public void createArticle(Article p) {
		em.persist(p.getLibelle());
		em.persist(p.getPrix());

	}

}
