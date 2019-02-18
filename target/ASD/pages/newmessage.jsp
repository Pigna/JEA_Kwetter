<%--
  Created by IntelliJ IDEA.
  User: myron
  Date: 2/12/2019
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>New Message send</title>
</head>
<body>
    <h1>New Message send</h1>
    <p>The new message send is: ${newMessage}</p>
    <a href="${pageContext.request.contextPath}/message">Return to messages</a>
</body>
</html>
