<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    <form:form method="POST" action="/hradmin/employee"
      modelAttribute="employee">
        <form:label path="empName">Name</form:label>
        <form:input path="empName" />
        <form:label path="address">Address</form:label>
        <form:input path="address" />
        <form:label path="empId">Id</form:label>
        <form:input path="empId" />
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>