<%@include file="fragments/header_link.jsp" %>


<h2>Add contact persons to company : <strong>${company.nameCompany}</strong></h2>
<form action="/admin/company/addContactPerson" method="post">
    <input type="text" name="firstName" placeholder="firstName">
    <input type="text" name="lastName" placeholder="lastName">
    <input type="text" name="position" placeholder="position">
    <input type="text" name="email" placeholder="email">
    <input type="text" name="telephone" placeholder="telephone">
    <input type="hidden" name="idCompany" value="${company.id}">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <br/>
    ${key}
    <br/>
    <input type="submit"  value="add contact Person">
</form>


<br/>
<br/>
<br/>
<br/>


<table id="contactPerson">
    <thead>
    <tr>
        <th class="disable-sorting">#</th>
        <th>Name</th>
        <th>Last Name</th>
        <th>Position</th>
        <th>Email</th>
        <th>Telephone</th>
        <th>Options</th>




    </tr>
    </thead>

    <tbody>
    <c:forEach items="${company.persons}" var="person">
        <tr>
            <td>${person.id}</td>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.position}</td>
            <td>${person.email}</td>
            <td>${person.telephone}</td>
            <td>
                <a href="/admin/company/delete-${person.id}">delete Person</a>
                <a href="/admin/company/edit-${person.id}" >edit Person</a>
            </td>

        </tr>


    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" charset="utf-8">
    $('#contactPerson').dataTable();
</script>





<%@include file="fragments/footer.jsp" %>