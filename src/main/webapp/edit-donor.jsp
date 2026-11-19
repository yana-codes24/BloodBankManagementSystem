<%-- 
    Document   : edit-donor.jsp
    Created on : 31 Oct 2026, 8:38:08 pm
    Author     : Yana Pandey
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Donor</title>
</head>
<body>

<h2>Edit Donor Details</h2>

<form action="update-donor" method="post">

    <input type="hidden" name="donor_id" value="${donor.id}">

    Full Name:<br>
    <input type="text" name="full_name" value="${donor.name}" required><br><br>

    Age:<br>
    <input type="number" name="age" value="${donor.age}" min="18" required><br><br>

    Gender:<br>
    <select name="gender" required>
        <option value="Male" ${donor.gender == 'Male' ? 'selected' : ''}>Male</option>
        <option value="Female" ${donor.gender == 'Female' ? 'selected' : ''}>Female</option>
        <option value="Other" ${donor.gender == 'Other' ? 'selected' : ''}>Other</option>
    </select><br><br>

    Phone:<br>
    <input type="text" name="phone" value="${donor.phone}" required><br><br>

    Email:<br>
    <input type="email" name="email" value="${donor.email}"><br><br>

    <button type="submit">Update Donor</button>

</form>

</body>
</html>
