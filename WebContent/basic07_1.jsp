<%@page import="javax.swing.text.Document"%>
<%@ page import="java.io.PrintWriter" %>

<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	String userNum = request.getParameter("userNum");
	//DB연동 처리
	//PrintWriter ggg = response.getWriter();
	String name ="", gender="", addr="", tel="";
	if(userNum.equals("1")){
		name="홍길동";
		gender="남자";
		addr="강원도 산골";
		tel="111-1111";
	}else if(userNum.equals("2")){
		name="설현";
		gender="여자";
		addr="강원도 종로구";
		tel="221-2111";
	}else if(userNum.equals("3")){
		name="임꺽정";
		gender="남자";
		addr="경기도 의정부시";
		tel="333-3333";
	}
	String [] arr={name, gender, addr, tel};
	

	
	//ggg.print(name + ", " + gender + ", " + addr + ", " + tel + ",");

%>
<employees>
	<employee name="<%=name %>" gender="<%=gender %>" addr="<%=addr %>" tel="<%=tel %>"></employee>
</employees>
