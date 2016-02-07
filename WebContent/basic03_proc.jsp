<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	String[] titles = {"현재 IS 테러로 인해 프랑스 여행 주의보 발령!<br/>", "<속보>세계적인 천재 박세연 노벨상 수상<br/>", "<속보>박세연 연예계 진출<br/>"};

%>
<%
	for(int i=0; i<titles.length; i++){
%>
		<%=titles[i] %>

<%
	}
%>