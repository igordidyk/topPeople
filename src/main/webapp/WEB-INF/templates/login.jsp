<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="fragments/header_link.jsp"%>


<div class="container">

    <form action="/login" method="post" class="login">
        <c:if test="${param.error != null}">
            <p>Invalid username and password.</p>
        </c:if>
        <c:if test="${param.logout != null}">
            <p>You have been logged out successfully.</p>
        </c:if>


        <input type="text" name="username" placeholder="username">
        <input type="password" name="password" placeholder="password">
            <input type="submit" value="Увійти">
            <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </form>
</div>



<%@include file="fragments/footer.jsp"%>