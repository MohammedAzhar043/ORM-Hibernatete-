package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entitiies.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.http.HttpServlet; // New import
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


		try {
			String title= request.getParameter("title");
			String content= request.getParameter("content");
			Note note = new Note();
			note.setTitle(title);
			note.setContent(content);
			note.setAddedDate(new Date());
			
			//save by using hiberenate
			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(note);
			tx.commit();
			session.close();
			
			PrintWriter out= response.getWriter();
			out.println("<h1 style='text-align-center'>Note is added successfuly</h1>");
			out.println("<h1 style='text-align-center'><a href='all_notes.jsp'> View All notes</h1>");
		}catch (Exception e) {

			e.printStackTrace();
		}
	
		
	}

}
