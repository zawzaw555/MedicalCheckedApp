package tool;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FrontController
 */
@WebServlet(name = "*.action", urlPatterns = { "*.action" })
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			String path=request.getServletPath().substring(1);
			String name=path.replace(".a", "A").replace("/", ".");
			@SuppressWarnings("unused")
			Action action=(Action)Class.forName(name).getDeclaredConstructor().newInstance();
		} catch(Exception e){
			e.printStackTrace(out);
		}
	}
	
	public void doGet(
		HttpServletRequest request,HttpServletResponse response
	)throws ServletException,IOException {
		doPost(request,response);
	}

}
