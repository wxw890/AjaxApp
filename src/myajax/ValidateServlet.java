package myajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {

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
		PrintWriter out = resp.getWriter();
		
		String param = req.getParameter("birthDate");
		boolean passed = isValidateDate(param);
		
		String msg = "당신이 입력한 날짜는 잘못되었다.";
		if(passed==true){
			msg="잘 입력되었다.";
		}
		
		out.println("<response>");
		out.println("<passed>" + Boolean.toString(passed) + "</passed>");
		out.println("<message>" + msg + "</message>");
		out.println("</response>");
		out.close();
		
	}
	private boolean	isValidateDate(String param){
		boolean isValid = true;
		if(param != null){
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			try{
				formatter.parse(param);
			}
			catch(ParseException e){
				isValid = false;
			}
		}
		else{
			isValid = false;
		}
		return isValid;
	}
	
}
