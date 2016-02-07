package myajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DynamicUpdateArea extends HttpServlet {
	private int counter=1;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("연결 성공");
		resp.setContentType("text/xml");
		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Cache-Control", "no-cache");
		PrintWriter out = resp.getWriter();
		
		String res="";
		String message="";
		String task	= req.getParameter("task");
		
		if(task.equals("reset")){
			counter=1;
		}
		else{
			switch(counter){
			case 1:
				message = "아는 것이 힘이다."; break;
			case 2:
				message = "아는 것이 똥이다."; break;
			case 3:
				message = "아는 것이 방구이다."; break;
			case 4:
				message = "아는 것이 약이다."; break;
			case 5:
				message = "아는 것이 아무것도 아니다."; break;
			
			}
			counter++;
		}
		res = "<message>" + message + "</message>";
		out.println("<response>");
		out.println(res);
		out.println("</response>");
		out.close();
		
	}

}
