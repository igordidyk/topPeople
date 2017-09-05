<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp" %>

<form action="/admin/addCompany" method="post">
    <input type="text" name="nameCompany" placeholder="Name Company">
    <input type="text" name="IC" placeholder="IC">
    <input type="text" name="contactAddress" placeholder="Contact Address">
    <input type="text" name="telephone" placeholder="telephone">
    <input type="text" name="email" placeholder="email">
    <input type="text" name="CZ_NACE" placeholder="CZ_NACE">
    <%--<input type="number" name="numberOfCanditates" placeholder="numberOfCanditates">--%>
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>



    <input type="submit" value="create Company">

</form>
<br/>
<br/>
<br/>

<table id="company">
    <thead>
    <tr>
        <th class="disable-sorting">#</th>
        <th>Company</th>
        <th>Telephone</th>
        <th>Email</th>
        <th>IC</th>
        <th>Contact Address</th>
        <th>Options</th>

    </tr>
    </thead>

    <tbody>
    <c:forEach items="${companies}" var="company">
        <tr>



            <td>${company.id}</td>
            <td>${company.nameCompany}</td>
            <td>${company.telephone}</td>
            <td>${company.email}</td>
            <td>${company.IC}</td>
            <td>${company.contactAddress}</td>
            <td>

                    <a href="/admin/company/remove-${company.id}">delete Company</a>
                    <a href="/admin/company/edit-${company.id}" >edit Company</a>
                    <a href="/admin/company/addContactPersonToCompany-${company.id}" >Add Contact Person</a>
                    <a href="/admin/company/createProject-${company.id}" >Create Project</a>


            </td>

        </tr>


    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" charset="utf-8">
    $('#company').dataTable();
</script>






<%@include file="fragments/footer.jsp" %>
