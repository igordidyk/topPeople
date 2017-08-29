<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp" %>

<form action="/addCompany" method="post">
    <input type="text" name="nameCompany" placeholder="nameCompany">
    <%--<input type="number" name="numberOfCanditates" placeholder="numberOfCanditates">--%>
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>

    <input type="submit" value="create Company">

</form>


<table id="company">
    <thead>
    <tr>
        <th class="disable-sorting">#</th>
        <th>Company</th>
        <th>Number of Canditates</th>
        <th>Options</th>

    </tr>
    </thead>

    <tbody>
    <c:forEach items="${companies}" var="company">
        <tr>

            <td>${company.id}</td>
            <td>${company.nameCompany}</td>
            <td>${company.numberOfCanditates}</td>
            <td>

                    <a href="/admin/company/remove-${company.id}">delete Company</a>
                    <a href="/admin/company/edit-${company.id}" >edit Company</a>


            </td>

        </tr>


    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" charset="utf-8">
    $('#company').dataTable();
</script>

<%@include file="fragments/footer.jsp" %>
