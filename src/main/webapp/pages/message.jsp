<%--
  Created by IntelliJ IDEA.
  User: myron
  Date: 2/11/2019
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Message page</title>
</head>
<body>
    <h1>List of messages</h1>
    <ol>
        <c:forEach items="${messageList}" var="message">
            <li>${message.getMessage()}</li>
        </c:forEach>
    </ol>
    <form action="${pageContext.request.contextPath}/newmessage" method="post">
        <label for="new_message">Message:</label>
        <input type="text" id="new_message" name="new_message" />
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>
