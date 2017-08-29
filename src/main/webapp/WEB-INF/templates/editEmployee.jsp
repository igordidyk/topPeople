<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="fragments/header_link.jsp"%>

<form action="/coordinator/employee/update" method="post">
    <input type="text" name="name" placeholder="name" value="${employee.name}">
    <input type="text" name="surname" placeholder="surname" value="${employee.surname}">
    <input type="text" name="gender" placeholder="gender" value="${employee.gender}">
    <input type="text" name="nationality" placeholder="nationality" value="${employee.nationality}">
    <input type="text" name="born" placeholder="born" value="${employee.born}">
    <input type="text" name="birthPlace" placeholder="birthPlace" value="${employee.birthPlace}">
    <input type="text" name="country" placeholder="Address country" value="${employee.address.country}">
    <input type="text" name="region" placeholder="Address region" value="${employee.address.region}">
    <input type="text" name="city" placeholder="Address city" value="${employee.address.city}">
    <input type="text" name="postIndex" placeholder="Address postIndex" value="${employee.address.postIndex}">
    <input type="text" name="street" placeholder="Address street" value="${employee.address.street}">
    <input type="text" name="numberOfHouse" placeholder="Address numberOfHouse" value="${employee.address.numberOfHouse}">
    <input type="text" name="passportNomer" placeholder="passportNomer" value="${employee.passportNomer}">
    <input type="text" name="passportValidUntil" placeholder="passportValidUntil" value="${employee.passportValidUntil}">
    <input type="text" name="issuedByAuthority" placeholder="issuedByAuthority" value="${employee.issuedByAuthority}">
    <input type="text" name="telephone" placeholder="telephone" value="${employee.telephone}">
    <input type="text" name="email" placeholder="email"value="${employee.email}" >
    <input type="text" name="education" placeholder="education" value="${employee.education}">
    <input type="text" name="language" placeholder="language" value="${employee.language}">
    <input type="text" name="cz_isco" placeholder="cz_isco" value="${employee.cz_isco}">
    <input type="text" name="position" placeholder="position" value="${employee.position}">
    <input type="text" name="numberOfVacancy" placeholder="numberOfVacancy" value="${employee.numberOfVacancy}">
    <input type="number" name="phase" placeholder="phase" value="${employee.phase}">
    <input type="number" name="status" placeholder="status" value="${employee.status}">
    <input type="text" name="receivedOrder" placeholder="receivedOrder" value="${employee.receivedOrder}">
    <input type="text" name="schengen" placeholder="schengen" value="${employee.schengen}">
    <input type="text" name="workingAgreement" placeholder="workingAgreement" value="${employee.workingAgreement}">
    <input type="text" name="workingAgree" placeholder="workingAgree" value="${employee.workingAgree}">
    <input type="text" name="confirmationOfLivingPlace" placeholder="confirmationOfLivingPlace" value="${employee.confirmationOfLivingPlace}">
    <input type="text" name="beginWorkingContract" placeholder="beginWorkingContract" value="${employee.beginWorkingContract}">
    <input type="text" name="endWorkingContract" placeholder="endWorkingContract" value="${employee.endWorkingContract}">
    <input type="text" name="schengenTrialPeriod" placeholder="schengenTrialPeriod" value="${employee.schengenTrialPeriod}">
    <input type="text" name="realStartingOfSchengen" placeholder="realStartingOfSchengen" value="${employee.realStartingOfSchengen}">
    <input type="text" name="multiVisa" placeholder="multiVisa" value="${employee.multiVisa}">
    <input type="text" name="ECBegin" placeholder="ECBegin" value="${employee.ECBegin}">
    <input type="text" name="ECEnd" placeholder="ECEnd" ${employee.ECEnd}>
    <input type="text" name="ECTrialPeriod" placeholder="ECTrialPeriod" value="${employee.ECTrialPeriod}">
    <input type="text" name="expectedStartingAtCompany" placeholder="expectedStartingAtCompany" value="${employee.expectedStartingAtCompany}">
    <input type="text" name="duration" placeholder="duration" value="${employee.duration}">
    <input type="text" name="presentedToCompany" placeholder="presentedToCompany" value="${employee.presentedToCompany}">
    <input type="text" name="ministryOfForeignAffairs" placeholder="ministryOfForeignAffairs" value="${employee.ministryOfForeignAffairs}">
    <input type="text" name="interviewAtConsulate" placeholder="interviewAtConsulate" value="${employee.interviewAtConsulate}">
    <input type="text" name="pickingUpTheVISA" placeholder="pickingUpTheVISA" value="${employee.pickingUpTheVISA}">
    <input type="text" name="registrationAtLocalOffice" placeholder="registrationAtLocalOffice" value="${employee.registrationAtLocalOffice}">
    <input type="text" name="startingToWork" placeholder="startingToWork" value="${employee.startingToWork}">
    <input type="text" name="receivingEmploymentCard" placeholder="receivingEmploymentCard" value="${employee.receivingEmploymentCard}">
    <br/>
    <textarea name="comments" placeholder="comments"  value="${employee.comments}"></textarea>
    <input type="hidden" name="employee" value="${employee.id}">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <br/>
    <input type="submit" value="save Changes">


</form>




<%@include file="fragments/footer.jsp"%>
