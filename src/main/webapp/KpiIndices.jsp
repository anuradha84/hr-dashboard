<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>KPI Indices</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link>

</head>
<body>
    <form:form method="POST" action="/hradmin/kpiIndices" modelAttribute="kpiIndices">
        <form:label path="index">KPI Index: </form:label>
        <form:input path="index" />
        <form:label path="state">Status:</form:label>
        <form:input path="state" />
        <form:label path="value">Value:</form:label>
        <form:select path="value" >
            <form:option value="1" label="YES"/>
            <form:option value="o" label="NO" />
        </form:select>
        <input type="submit" value="Submit" />
    </form:form>

    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>