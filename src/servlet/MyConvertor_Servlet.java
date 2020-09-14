package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clientWS_NC.NumberConvertor;

/**
 * Servlet implementation class MyConvertor_Servlet
 */
@WebServlet("/MyConvertor_Servlet")
public class MyConvertor_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyConvertor_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		NumberConvertor client = new NumberConvertor();

		String value = request.getParameter("value1").toString();
		String value2 = request.getParameter("value2").toString();

		String type = request.getParameter("type").toString();
		String answer = "";

		PrintWriter out = response.getWriter();
		if(value.equals("")){
			out.write("error: Please, provide a value!");  
		}else{
			String result = "";
			switch(type) {
				case "add":
					answer = client.add(value, value2);
					break;
				case "divide":
					answer = client.divide(value, value2);
					break;
				case "subtract":
					answer = client.substract(value, value2);
					break;
				case "multiply":
					answer = client.multiply(value, value2);
					break;
			}
			
			result = client.convert2word(answer);

			out.write(result); 			
		}
					 
		out.flush();
	    out.close();

	}

}
