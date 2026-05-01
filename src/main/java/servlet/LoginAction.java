package servlet;

import bean.User;
import dao.UserDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginAction extends Action{
	public String execute (
			HttpServletRequest request,HttpServletResponse response
		) throws Exception {
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		UserDAO dao=new UserDAO();
		User user=dao.search(login, password);
		
		if(user!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			return "/jsp/login-out.jsp";
		}
		
		return "/jsp/login-error.jsp";
	}
}
