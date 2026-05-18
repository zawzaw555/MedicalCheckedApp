package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

import java.io.IOException;

import bean.User;
import dao.UserDAO;

@SuppressWarnings("unused")
public class SignUpAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String name=request.getParameter("new_name");
		String password=request.getParameter("new_password");
		UserDAO dao=new UserDAO();

		if (dao.existsName(name)) {
			request.setAttribute("error", "このログイン名はすでに使われています。");
			return "/WEB-INF/jsp/health-signup.jsp";
		}

		boolean result=dao.insert(name, password);
		if (result) {
			return "/health-home.jsp";
		}
		
		return "/WEB-INF/jsp/login-error.jsp";
	}

}
