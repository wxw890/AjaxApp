package myajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AsciiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/plain");//???
		resp.setHeader("Cache-Control", "no-cache");//�̰� �����ָ� �׻� ĳ�ø� ����ϰԵ�
		
		PrintWriter out = resp.getWriter();
		try{
			String key = req.getParameter("key");
			if(key != null){
				int keyChar = key.charAt(0);
				String strDecimal = Integer.toString(keyChar);
				out.println(strDecimal);
			}
		}catch(Exception err){
			System.out.println(err);
			out.println("I don't know!!!");
		}
	}
	
}
