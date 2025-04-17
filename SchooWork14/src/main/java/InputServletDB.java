

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class InputServletDB
 */
@WebServlet("/InputServletDB")
public class InputServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServletDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String name ="test";
		request.setAttribute("name", name);
		SelectHuman human = new SelectHuman(request);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("Output2HumanDB.jsp");
		rd1.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		Human human = InputHumanDB.getHuman(name, age);
		request.setAttribute("human", human);
		RequestDispatcher rd = request.getRequestDispatcher("OutputHumanDB.jsp");
		rd.forward(request,response);
	
	}

}
