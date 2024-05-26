
<%--
  Created by IntelliJ IDEA.
  User: Md. Shafiqur Rohman
  Date: 5/23/24
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
    <style>
        /* CSS for styling the table */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }

        .edit-btn {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .delete-btn {
            padding: 5px 10px;
            background-color: #8e2626;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .edit-btn:hover {
            background-color: #45a049;
        }
        .delete-btn:hover {
            background-color: #a04553;
        }
    </style>
</head>
<body>

<h1> User List</h1>
<h2><button class="edit-btn" onclick="crateNewUser()">Create New User</button></h2>

<table id="userTable">
    <thead>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Email</th>
        <th>Full Name</th>
        <th>Country</th>
        <th>Created On</th>
        <th>Updated On</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <!-- Loop through users and display each user's information -->
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.email}</td>
            <td>${user.fullName}</td>
            <td>${user.country}</td>
            <td>${user.createdOn}</td>
            <td>${user.updatedOn}</td>
            <td>
                <button class="edit-btn" onclick="editUser(${user.id})">Edit</button>
                <button class="delete-btn" onclick="deleteUser(${user.id})">Delete</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!-- JavaScript for sorting the table -->
<script>

    <%--console.log("hello I am here", ${users});--%>

    // Function to handle editing a user
    function editUser(userId) {
        // Redirect to edit user page with user ID
        window.location.href = "/user/edit/" + userId;
    }

    function crateNewUser(){
        window.location.href = "/user/create";
    }

    // Function to handle deleting a user
    function deleteUser(userId) {
        window.location.href = "/user/delete/" + userId;
    }
</script>
</body>
</html>
