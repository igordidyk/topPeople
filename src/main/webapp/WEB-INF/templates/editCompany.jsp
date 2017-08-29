<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp"%>

<form action="/admin/company/save" method="post">
    <input type="text" name="nameCompany" value="${company.nameCompany}" placeholder="nameCompany">
    <%--<input type="number" name="numberOfCanditates" value="${company.numberOfCanditates}" placeholder="numberOfCanditates">--%>
    <input type="hidden" name="company" value="${company.id}">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>

    <input type="submit" value="save Changes">

</form>

<%@include file="fragments/footer.jsp"%>
