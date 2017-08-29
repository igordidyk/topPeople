<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>


<br/>
<br/>
<br/>
<br/>
<br/>
<sec:authorize access="isAuthenticated()">
| Authorize user : <sec:authentication property="name"></sec:authentication>
| User roles : <sec:authentication property="principal.authorities"></sec:authentication></br>
<a href="/logout" class="link exit">logout</a>
</sec:authorize>

</body>
</html>