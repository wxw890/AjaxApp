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
		System.out.println("���� ����");
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
				message = "�ƴ� ���� ���̴�."; break;
			case 2:
				message = "�ƴ� ���� ���̴�."; break;
			case 3:
				message = "�ƴ� ���� �汸�̴�."; break;
			case 4:
				message = "�ƴ� ���� ���̴�."; break;
			case 5:
				message = "�ƴ� ���� �ƹ��͵� �ƴϴ�."; break;
			
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
