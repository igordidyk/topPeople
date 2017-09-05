<%@include file="fragments/header_link.jsp"%>

<h2>Create project</h2>
<form action="/admin/company/createProject" method="post">
    <input type="text" name="" >
    <input type="text" name="" id="">
    <input type="text" name="" id="">
    <input type="text" name="" id="">
    <input type="text" name="" id="">
    <input type="submit" value="create Project">

    <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
</form>

<%@include file="fragments/footer.jsp"%>