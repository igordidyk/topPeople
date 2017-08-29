<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="fragments/header_link.jsp"%>
${principal}
<br/>
<br/>
<a href="/admin/company">company</a>
<br/>
<a href="/admin/coordinators">coordinator</a>
<br/>

<%--<a href="<c:url value="/logout" />">Logout</a>--%>

<%@include file="fragments/footer.jsp"%>
