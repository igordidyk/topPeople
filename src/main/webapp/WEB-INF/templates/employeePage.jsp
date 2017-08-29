<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp" %>


<br/>
<br/>

<form action="createEmployeer" method="post">
    <input type="text" name="name" placeholder="name" required>
    <input type="text" name="surname" placeholder="surname">
    <input type="text" name="gender" placeholder="gender">
    <input type="text" name="nationality" placeholder="nationality">
    <input type="date" name="born" placeholder="born">
    <input type="text" name="birthPlace" placeholder="birthPlace">
    <input type="text" name="country" placeholder="Address country">
    <input type="text" name="region" placeholder="Address region">
    <input type="text" name="city" placeholder="Address city">
    <input type="text" name="postIndex" placeholder="Address postIndex">
    <input type="text" name="street" placeholder="Address street">
    <input type="text" name="numberOfHouse" placeholder="Address numberOfHouse">
    <input type="text" name="passportNomer" placeholder="passportNomer">
    <input type="text" name="passportValidUntil" placeholder="passportValidUntil">
    <input type="text" name="issuedByAuthority" placeholder="issuedByAuthority">
    <input type="text" name="telephone" placeholder="telephone">
    <input type="text" name="email" placeholder="email">
    <input type="text" name="education" placeholder="education">
    <input type="text" name="language" placeholder="language">
    <input type="text" name="cz_isco" placeholder="cz_isco">
    <input type="text" name="position" placeholder="position">
    <input type="text" name="numberOfVacancy" placeholder="numberOfVacancy">
    <input type="number" name="phase" placeholder="phase">
    <input type="number" name="status" placeholder="status">
    <input type="text" name="receivedOrder" placeholder="receivedOrder">
    <input type="text" name="schengen" placeholder="schengen">
    <input type="text" name="workingAgreement" placeholder="workingAgreement">
    <input type="text" name="workingAgree" placeholder="workingAgree">
    <input type="text" name="confirmationOfLivingPlace" placeholder="confirmationOfLivingPlace">
    <input type="text" name="beginWorkingContract" placeholder="beginWorkingContract">
    <input type="text" name="endWorkingContract" placeholder="endWorkingContract">
    <input type="text" name="schengenTrialPeriod" placeholder="schengenTrialPeriod">
    <input type="text" name="realStartingOfSchengen" placeholder="realStartingOfSchengen">
    <input type="text" name="multiVisa" placeholder="multiVisa">
    <input type="text" name="ECBegin" placeholder="ECBegin">
    <input type="text" name="ECEnd" placeholder="ECEnd">
    <input type="text" name="ECTrialPeriod" placeholder="ECTrialPeriod">
    <input type="text" name="expectedStartingAtCompany" placeholder="expectedStartingAtCompany">
    <input type="text" name="duration" placeholder="duration">
    <input type="text" name="presentedToCompany" placeholder="presentedToCompany">
    <input type="text" name="ministryOfForeignAffairs" placeholder="ministryOfForeignAffairs">
    <input type="text" name="interviewAtConsulate" placeholder="interviewAtConsulate">
    <input type="text" name="pickingUpTheVISA" placeholder="pickingUpTheVISA">
    <input type="text" name="registrationAtLocalOffice" placeholder="registrationAtLocalOffice">
    <input type="text" name="startingToWork" placeholder="startingToWork">
    <input type="text" name="receivingEmploymentCard" placeholder="receivingEmploymentCard">
    <textarea name="comments" placeholder="comments"></textarea>
    <input type="hidden" name="coordinator" value="${key}">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <input type="submit" value="add Employee">


</form>


<hr>
<br/>


<table id="employeer">
    <thead>
    <tr>
        <th class="disable-sorting">#</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Gender</th>
        <th>Nationality</th>
        <th>Born</th>
        <th>Birth Place</th>
        <th>Address country</th>
        <th>Address region</th>
        <th>Address city</th>
        <th>Address postIndex</th>
        <th>Address street</th>
        <th>Address numberOfHouse</th>
        <th>Passport Nomer</th>
        <th>Passport Valid Until</th>
        <th>Issued By Authority</th>
        <th>Telephone</th>
        <th>Email</th>
        <th>Education</th>
        <th>Language</th>
        <th>CZ ISCO</th>
        <th>Position</th>
        <th>Number of Vacancy</th>
        <th>Phase</th>
        <th>Status</th>
        <th>Received Order</th>
        <th>Schengen</th>
        <th>Working Agreement</th>
        <th>Working Agree</th>
        <th>Confirmation Of Living Place</th>
        <th>Begin Working Contract</th>
        <th>End Working Contract</th>
        <th>Schengen Trial Period</th>
        <th>Real Starting of Schengen</th>
        <th>Multi Visa</th>
        <th>EC Begin</th>
        <th>EC End</th>
        <th>EC Trial Period</th>
        <th>Expected Starting at Company</th>
        <th>Duration</th>
        <th>Presented to Company</th>
        <th>Ministry of Foreign Affairs</th>
        <th>Interview at Consulate</th>
        <th>Picking up the VISA</th>
        <th>Registration at local office</th>
        <th>Starting to Work</th>
        <th>Receiving Employment Card</th>
        <th>Comments</th>
        <th>Options</th>


    </tr>
    </thead>

    <tbody>
    <c:forEach items="${employees}" var="employee">
        <tr>

            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.gender}</td>
            <td>${employee.nationality}</td>
            <td>${employee.born}</td>
            <td>${employee.birthPlace}</td>

            <td>${employee.address.country}</td>
            <td>${employee.address.region}</td>
            <td>${employee.address.city}</td>
            <td>${employee.address.postIndex}</td>
            <td>${employee.address.street}</td>
            <td>${employee.address.numberOfHouse}</td>
            <td>${employee.passportNomer}</td>
            <td>${employee.passportValidUntil}</td>
            <td>${employee.issuedByAuthority}</td>
            <td>${employee.telephone}</td>
            <td>${employee.email}</td>
            <td>${employee.education}</td>
            <td>${employee.language}</td>
            <td>${employee.cz_isco}</td>
            <td>${employee.position}</td>
            <td>${employee.numberOfVacancy}</td>
            <td>${employee.phase}</td>
            <td>${employee.status}</td>
            <td>${employee.receivedOrder}</td>
            <td>${employee.schengen}</td>
            <td>${employee.workingAgreement}</td>
            <td>${employee.workingAgree}</td>
            <td>${employee.confirmationOfLivingPlace}</td>
            <td>${employee.beginWorkingContract}</td>
            <td>${employee.endWorkingContract}</td>
            <td>${employee.schengenTrialPeriod}</td>
            <td>${employee.realStartingOfSchengen}</td>
            <td>${employee.multiVisa}</td>
            <td>${employee.ECBegin}</td>
            <td>${employee.ECEnd}</td>
            <td>${employee.ECTrialPeriod}</td>
            <td>${employee.expectedStartingAtCompany}</td>
            <td>${employee.duration}</td>
            <td>${employee.presentedToCompany}</td>
            <td>${employee.ministryOfForeignAffairs}</td>
            <td>${employee.interviewAtConsulate}</td>
            <td>${employee.pickingUpTheVISA}</td>
            <td>${employee.registrationAtLocalOffice}</td>
            <td>${employee.startingToWork}</td>
            <td>${employee.receivingEmploymentCard}</td>
            <td>${employee.comments}</td>

            <td>
                <a href="/coordinator/employee/remove-${employee.id}">remove</a><br/>

                <a href="/coordinator/employee/edit-${employee.id}">edit</a>
            </td>


        </tr>


    </c:forEach>
    </tbody>
</table>

<script type="text/javascript" charset="utf-8">
    $('#employeer').dataTable();
</script>
<%@include file="fragments/footer.jsp" %>
