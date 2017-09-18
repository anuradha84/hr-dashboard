<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>KPI Indices</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link>

</head>
<body>
    <form:form method="POST" action="/hradmin/kpicategory" modelAttribute="kpiCategory">
        <form:label path="categNo">Category No:</form:label>
        <form:input path="categNo" />
        <form:label path="category">Category</form:label>
        <form:input path="category" />
        <input type="submit" value="Submit" />
    </form:form>
    <table>
    <th>
    <td>Category ID</td><td>Category No</td><td>Category Name</td>
    </th>
    <c:forEach items="${kpiCategory}" var="category" varStatus="status">
    <tr>
        <td>${category.categId}</td>
        <td>${category.categNo}</td>
        <td>${category.category}</td>
    </tr>
    </c:forEach>
    </table>

    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>