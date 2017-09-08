<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp" %>
<h2>Add Company </h2>
<form action="/admin/addCompany" method="post">
    <input type="text" name="nameCompany" placeholder="Name Company">
    <input type="text" name="IC" placeholder="IC">
    <input type="text" name="contactAddress" placeholder="Contact Address">
    <input type="text" name="telephone" placeholder="telephone">
    <input type="text" name="email" placeholder="email">
    <input type="text" name="CZ_NACE" placeholder="CZ_NACE">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <br/>
    <br/>
    <input type="submit" value="create Company">

</form>
<br/>
<br/>
<h2>All added companies</h2>
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
                <div style="list-style-type: none; text-decoration: none">
                    <li><a href="/admin/company/remove-${company.id}">delete Company</a></li>
                    <li><a href="/admin/company/edit-${company.id}" >edit Company</a></li>
                    <li><a href="/admin/company/contactPersonFromCompany-${company.id}" >Contact Person</a></li>
                    <li><a href="/admin/company/createProject-${company.id}" >Create Project</a></li>
                </div>

            </td>

        </tr>


    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" charset="utf-8">
    $('#company').dataTable();
</script>






<%@include file="fragments/footer.jsp" %>
