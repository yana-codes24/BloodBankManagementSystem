<%-- 
    Document   : register-donor
    Created on : 31 Oct 2026, 8:10:11 pm
    Author     : Yana Pandey
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register Donor | Blood Bank</title>
</head>
<body>

    <h2>Blood Donor Registration</h2>

    <form action="register-donor" method="post">

        <label>Full Name:</label><br>
        <input type="text" name="full_name" required><br><br>

        <label>Age:</label><br>
        <input type="number" name="age" min="18" required><br><br>

        <label>Gender:</label><br>
        <select name="gender" required>
            <option value="">Select Gender</option>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br><br>

        <label>Blood Group:</label><br>
        <select name="blood_group_id" required>
            <option value="">Select Blood Group</option>
            <option value="1">A+</option>
            <option value="2">A-</option>
            <option value="3">B+</option>
            <option value="4">B-</option>
            <option value="5">AB+</option>
            <option value="6">AB-</option>
            <option value="7">O+</option>
            <option value="8">O-</option>
        </select><br><br>

        <label>Phone:</label><br>
        <input type="tel" name="phone" required><br><br>

        <label>Email:</label><br>
        <input type="email" name="email"><br><br>

        <label>Address:</label><br>
        <textarea name="address"></textarea><br><br>

        <label>Last Donation Date:</label><br>
        <input type="date" name="last_donation_date"><br><br>

        <button type="submit">Register Donor</button>

    </form>

</body>
</html>

