package servlet;

import java.util.List;

import bean.Health;
import dao.HealthDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;
import tool.HealthLogic;

public  class HealthListAction extends Action {
	public String execute(
		HttpServletRequest request,HttpServletResponse response
	) throws Exception {
		HttpSession session=request.getSession(false);
		
		if (session == null || session.getAttribute("user") == null) {
			return "/WEB-INF/jsp/health-login.jsp";
		}
		
		String idParam=request.getParameter("id");
		HealthDAO dao=new HealthDAO();
		HealthLogic logic=new HealthLogic();
		
		List<Health> healthList=dao.list();
		for (Health health:healthList) {
			logic.calc(health);
		}
		request.setAttribute("healthList", healthList);
		
		if (idParam != null && !idParam.isEmpty()) {
			int id = Integer.parseInt(idParam);
			Health health=dao.search(id);
			if (health != null) {
				logic.calc(health);
			}
			request.setAttribute("health", health);
		}
		
		return "/WEB-INF/jsp/health-history.jsp";
	}
}
