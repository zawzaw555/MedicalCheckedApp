package servlet;

import bean.Health;
import dao.HealthDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;
import tool.HealthLogic;

public class HealthDetailAction extends Action {
	public String execute(
		HttpServletRequest request,HttpServletResponse response
	) throws Exception {
		HttpSession session=request.getSession(false);

		if (session == null || session.getAttribute("user") == null) {
			return "/WEB-INF/jsp/health-login.jsp";
		}

		String idParam=request.getParameter("id");
		if (idParam == null || idParam.isEmpty()) {
			return "/servlet/HealthList.action";
		}

		int id;
		try {
			id=Integer.parseInt(idParam);
		} catch (NumberFormatException e) {
			return "/servlet/HealthList.action";
		}

		HealthDAO dao=new HealthDAO();
		Health health=dao.search(id);

		if (health != null) {
			HealthLogic logic=new HealthLogic();
			logic.calc(health);
		}

		request.setAttribute("health", health);

		return "/WEB-INF/jsp/health-result.jsp";
	}
}
