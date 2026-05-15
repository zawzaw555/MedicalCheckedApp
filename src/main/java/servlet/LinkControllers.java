package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LinkControllers
 */
@WebServlet("/LinkControllers")
public class LinkControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	
	// HttpServlet for doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if (action == null) {
			action = "login";
		}
		
		switch (action) {
		case "login"-> forword(request,response,"/WEB-INF/jsp/health-login.jsp");
		case "home"	-> forword(request,response,"/WEB-INF/jsp/heslth-home.jsp");
		case "input"-> forword(request,response,"/WEB-INF/jsp/health-input.jsp");
		case "signup"->forword(request,response,"/WEB-INF/jsp/health-signup.jsp");
		}
	}
	
	// HttpServlet for doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	// common method(forword) for page links
	@SuppressWarnings("unused")
	private void forword(
		HttpServletRequest request,HttpServletResponse response,String path
	) throws ServletException,IOException {
		request.getRequestDispatcher(path).forward(request, response);
	}
	
}
