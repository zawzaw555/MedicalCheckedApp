package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.HealthLogic;
import java.io.IOException;
import java.time.LocalDate;

import bean.Health;
import dao.HealthDAO;

@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/health-input.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		LocalDate checkDate = LocalDate.parse(request.getParameter("date"));
		String memo = request.getParameter("memo");
		
		Health health=new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));
		health.setCheckDate(checkDate);
		health.setMemo(memo);
		HealthLogic healthLogic=new HealthLogic();
		healthLogic.execute(health);
		
		try {
			HealthDAO dao=new HealthDAO();
			dao.insert(
					health.getHeight(), 
					health.getWeight(), 
					health.getCheckDate(), 
					health.getMemo()
				);
		} catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		request.setAttribute("health", health);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/jsp/health-result.jsp");
		dispatcher.forward(request, response);
	}

}
