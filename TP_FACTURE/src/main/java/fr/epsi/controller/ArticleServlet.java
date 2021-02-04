package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Article;
import fr.epsi.service.ArticleService;

public class ArticleServlet extends HttpServlet{
	
	@EJB
	private ArticleService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/articleList.jsp").forward(req, resp);
	    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   Article p=new Article();
		   p.setLibelle(req.getParameter("libelleArticle"));
		   p.setPrix(req.getParameter("prixArticle"));
		   
		   
		   service.createArticle(p);
	    }

}
