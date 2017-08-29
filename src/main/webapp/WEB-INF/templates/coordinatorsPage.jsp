<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp"%>

<form action="/admin/coordinators/createCoordinator" method="post">
    <input type="text" name="firstName" placeholder="firstName">
    <input type="text" name="lastName" placeholder="lastName">
    <input type="text" name="email" placeholder="email">
    <input type="text" name="telephone" placeholder="telephone">
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <input type="submit" value="registration">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>

</form>



<hr>
<br/>
<table id="coordinators">
    <thead>
    <tr>
        <th class="disable-sorting">#</th>
        <th>firstName</th>
        <th>lastName</th>
        <th>email</th>
        <th>telephone</th>
        <th>Options</th>
        <%--<th>username</th>--%>
        <%--<th>password</th>--%>

    </tr>
    </thead>

    <tbody>
    <c:forEach items="${coordinators}" var="coordinator">
        <tr>

            <td>${coordinator.id}</td>
            <td>${coordinator.firstName}</td>
            <td>${coordinator.lastName}</td>
            <td>${coordinator.email}</td>
            <td>${coordinator.telephone}</td>
            <td><a href="/admin/coordinators/remove-${coordinator.id}">delete Coordinator</a></td>
        </tr>


    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" charset="utf-8">
    $('#coordinators').dataTable();
</script>

<%@include file="fragments/footer.jsp"%>
