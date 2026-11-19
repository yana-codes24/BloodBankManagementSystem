<%-- 
    Document   : login
    Created on : 31 Oct 2026, 8:46:28 pm
    Author     : Yana Pandey
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Login - Blood Bank</title>
</head>
<body>

    <h2>Blood Bank Admin Login</h2>

    <form action="login" method="post">

        <label>Username:</label><br>
        <input type="text" name="username" required><br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required><br><br>

        <button type="submit">Login</button>

    </form>

    <p style="color:red;">${error}</p>

</body>
</html>

