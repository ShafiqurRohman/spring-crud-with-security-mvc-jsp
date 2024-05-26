<%--
  Created by IntelliJ IDEA.
  User: Md.Shafiqur Rohman
  Date: 5/23/24
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit User</title>
    <style>
        /* CSS for styling the form */
        form {
            margin: 20px auto;
            width: 50%;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 5px;
        }
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="text"], input[type="password"], select {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h1>Edit User</h1>
<form action="/user/edit/${User.id}" method="post">
    <input type="hidden" name="_method" value="PUT">
    <label for="userName">Username:</label>
    <input type="text" id="userName" name="userName" value="${User.userName}" required>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email" value="${User.email}" required>

    <label for="fullName">Full Name:</label>
    <input type="text" id="fullName" name="fullName" value="${User.fullName}" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" value="${User.password}" required>

    <label for="country">Country:</label>
    <input type="text" id="country" name="country" value="${User.country}" required>

    <input type="submit" value="Update User">
</form>
</body>
</html>

