<%@page import="javax.swing.text.Document"%>
<%@ page import="java.io.PrintWriter" %>

<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	String userNum = request.getParameter("userNum");
	//DB���� ó��
	//PrintWriter ggg = response.getWriter();
	String name ="", gender="", addr="", tel="";
	if(userNum.equals("1")){
		name="ȫ�浿";
		gender="����";
		addr="������ ���";
		tel="111-1111";
	}else if(userNum.equals("2")){
		name="����";
		gender="����";
		addr="������ ���α�";
		tel="221-2111";
	}else if(userNum.equals("3")){
		name="�Ӳ���";
		gender="����";
		addr="��⵵ �����ν�";
		tel="333-3333";
	}
	String [] arr={name, gender, addr, tel};
	

	
	//ggg.print(name + ", " + gender + ", " + addr + ", " + tel + ",");

%>
<employees>
	<employee name="<%=name %>" gender="<%=gender %>" addr="<%=addr %>" tel="<%=tel %>"></employee>
</employees>
