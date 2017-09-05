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
    <input type="submit" value="add contact Person">
</form>

<%@include file="fragments/footer.jsp" %>