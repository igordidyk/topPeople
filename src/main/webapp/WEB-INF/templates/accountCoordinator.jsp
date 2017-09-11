<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp"%>
<p>Hello,<h2>${coordinatorName}</h2></p>
<p>Welcome to your private office</p>
<p>You currently have access to a block of your personal data and employees</p>
<br/>
<a href="/coordinator/employee">Employee</a>
<br/>
<a href="/coordinator/myAccount">Personal Details</a>




<%@include file="fragments/footer.jsp"%>
