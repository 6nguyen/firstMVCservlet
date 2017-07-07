package com.nguyen92.servlet.firstMVCservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCservlet
 */
@WebServlet("/MVCservlet")
public class MVCservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MVCservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1:  get the Student data from the Model (studentDataUtil helper class)
		List<Student> students = studentDataUtil.getStudents();
		
		// Step 2:  add students to the request object
		request.setAttribute("studentList", students);
		
		// Step 3:  get the request dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewStudent.jsp");
		
		// Step 4:  forward request to JSP page		
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
