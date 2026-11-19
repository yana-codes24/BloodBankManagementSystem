
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Blood Bank - Donor List</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f4;
            padding: 30px;
        }

        h1 {
            color: #b22222;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            margin-top: 25px;
        }

        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background: #b22222;
            color: white;
        }

        tr:nth-child(even) {
            background: #f2f2f2;
        }

        button {
            background: #b22222;
            color: white;
            border: none;
            padding: 8px 12px;
            cursor: pointer;
            border-radius: 4px;
        }

        button:hover {
            background: #800000;
        }

        .add-btn {
            display: inline-block;
            background: #198754;
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            border-radius: 4px;
        }
        .logout-btn {
    display: inline-block;
    background: #b22222;
    color: white;
    padding: 10px 18px;
    text-decoration: none;
    border-radius: 5px;
    margin-right: 10px;
    font-weight: bold;
}

.logout-btn:hover {
    background: #800000;
}
    </style>
</head>

<body>

<h1>Blood Bank Management System</h1>
<h2>Registered Donors</h2>
<a href="logout" class="logout-btn">Logout</a>
<a class="add-btn" href="register-donor.jsp">+ Register New Donor</a>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Blood Group</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Action</th>
    </tr>

    <c:forEach var="d" items="${donors}">
        <tr>
            <td>${d.id}</td>
            <td>${d.name}</td>
            <td>${d.age}</td>
            <td>${d.gender}</td>
            <td>${d.blood_group}</td>
            <td>${d.phone}</td>
            <td>${d.email}</td>
            <td>
                <a href="${pageContext.request.contextPath}/edit-donor?id=${d.id}">
                        Edit
                </a>
                <form action="${pageContext.request.contextPath}/delete-donor"
                      method="post"
                      onsubmit="return confirm('Are you sure you want to delete this donor?');">

                    <input type="hidden" name="donor_id" value="${d.id}">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>

    <c:if test="${empty donors}">
        <tr>
            <td colspan="7">No donor records found.</td>
        </tr>
    </c:if>
</table>

</body>
</html>
