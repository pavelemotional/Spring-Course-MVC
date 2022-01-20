<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Dear Employee, Please enter your details</h2>

<br><br>

<%--        <form action="showDetails" method="get">--%>
<%--            <input type="text" name="employeeName" placeholder="Write your name"/>--%>
<%--            <input type="text" name="employeeSurname" placeholder="Write your surname"/>--%>
<%--            <input type="text" name="employeeSalary" placeholder="Write your salary"/>--%>
<%--            <input type="submit"/>--%>
<%--        </form>--%>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Phone Number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Witch car do you want? <br>
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/> <br>--%>
    <%--    Audi <form:radiobutton path="carBrand" value="Audi"/> <br>--%>
    <%--    Volvo <form:radiobutton path="carBrand" value="Volvo"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign Language(s)
    <br>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
