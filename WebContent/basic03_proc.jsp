<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	String[] titles = {"���� IS �׷��� ���� ������ ���� ���Ǻ� �߷�!<br/>", "<�Ӻ�>�������� õ�� �ڼ��� �뺧�� ����<br/>", "<�Ӻ�>�ڼ��� ������ ����<br/>"};

%>
<%
	for(int i=0; i<titles.length; i++){
%>
		<%=titles[i] %>

<%
	}
%>