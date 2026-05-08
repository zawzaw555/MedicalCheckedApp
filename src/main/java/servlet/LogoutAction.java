package servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LogoutAction extends Action {
	public String execute (
		HttpServletRequest request,HttpServletResponse response
	) throws Exception {
		
		HttpSession session = request.getSession(false);

	    if (session != null) {
	        session.invalidate();
	    }

	    response.sendRedirect(request.getContextPath() + "/jsp/health-logout.jsp");
	    
		return null; //"/jsp/logout-error.jsp";
	}
}
