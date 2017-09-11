<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp" %>
<h2>Profile details</h2>
* Here you can change your personal data
<form action="/coordinator/myAccount/editProfile" method="post">
    <input type="text" name="firstName" placeholder="firstName" value="${coordinator.firstName}">
    <input type="text" name="lastName" placeholder="lastName" value="${coordinator.lastName}">
    <input type="text" name="email" placeholder="email" value="${coordinator.email}">
    <input type="text" name="telephone" placeholder="telephone" value="${coordinator.telephone}">
    <input type="text" name="username" placeholder="username" value="${coordinator.username}">
    <input type="text" name="password" placeholder="password">
    <input type="hidden" name="id" value="${coordinator.id}">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <input type="submit" value="save changes">
</form>

<%@include file="fragments/footer.jsp" %>
