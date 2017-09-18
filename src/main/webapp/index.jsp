<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    <form:form method="POST" action="/hradmin/login" modelAttribute="user">
        <form:label path="userName">User Name</form:label>
        <form:input path="userName" />
        <form:label path="password">Password</form:label>
        <form:password path="password" />
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>