

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HumanServlet
 */
@WebServlet("/HumanServlet")
public class HumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HumanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Human.htmlに入力されたnameとageを取得
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		Human human = HumanManager.getHuman(name,age);
		request.setAttribute("human", human);
		
		//取得した値をOutputHuman.jspに引き渡し
//sd		request.setAttribute("name" ,h.getName());
//		request.setAttribute("age", h.getAge());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("OutputHuman.jsp");	
		rd.forward(request,response);
		
	
	}

}
