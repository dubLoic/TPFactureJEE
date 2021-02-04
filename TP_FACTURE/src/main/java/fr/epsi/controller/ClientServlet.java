package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Client;
import fr.epsi.service.ClientService;

public class ClientServlet extends HttpServlet{
	
	@EJB
	private ClientService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/clientList.jsp").forward(req, resp);
	    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   Client p=new Client();
		   p.setNom(req.getParameter("nomClient"));
		   p.setAdresse(req.getParameter("adresseClient"));
		   
		   
		   service.createClient(p);
	    }

}
