<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new Person</title>
</head>
<body>

    <%@ include file="navbar.jsp" %>

    <form action="/person/add" method="post">

        <label for="name">Name</label>
        <input type="text" id="name" name="name"><br>

        <label for="age">Age</label>
        <input type="text" id="age" name="age"><br>

        <input type="submit" value="Add Person">
        <input type="reset" value="Clear">

    </form>

</body>
</html>
