<%@ page import="ru.ivmiit.Table" %><%--
  Created by IntelliJ IDEA.
  User: s1nd1
  Date: 24.05.2019
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    <title>Table</title>
</head>
<body>
<link href="CSS/styles.css" rel="stylesheet" type="text/css">
<div class="form-style-6">
<%
    Table table = (Table) request.getAttribute("infoTable");
%>
    <table width="100%" border="1" cellpadding="4" cellspacing="0" bgcolor="<%=table.getFon()%>">
        <caption><%=table.getZagolovok()%></caption>
        <%
            for (int i = 0; i < table.getStroki(); i++) {
        %><tr>
        <%
            for (int j = 0; j <table.getStolbci() ; j++) {
        %><th>&nbsp;</th><%
            }%>
    </tr><%
            }
        %>
    </table>
<form method="get" action="/home">
    <input type="submit" value="Exit">
</form>
</div>
</body>
</html>
