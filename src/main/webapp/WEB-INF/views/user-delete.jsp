<%--
  Created by IntelliJ IDEA.
  User: Md.Shafiqur Rohman
  Date: 5/23/24
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete User</title>
    <style>
        /* CSS for styling the confirmation message */
        .confirmation-msg {
            margin: 20px auto;
            width: 50%;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 2px 2px 12px #aaa;
        }
        .confirmation-msg h2 {
            margin-bottom: 10px;
        }
        .confirmation-msg p {
            margin-bottom: 20px;
        }
        .button-container {
            display: flex;
            justify-content: flex-end;
        }
        .confirm-btn, .cancel-btn {
            padding: 10px 20px;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-left: 10px;
        }
        .confirm-btn {
            background-color: #4CAF50;
        }
        .cancel-btn {
            background-color: #932222;
            text-decoration: none;
            line-height: 15px;
        }
        .confirm-btn:hover {
            background-color: #45a049;
        }
        .cancel-btn:hover {
            background-color: #a93b3b;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<div class="confirmation-msg">
    <h2>Delete User</h2>
    <p>Are you sure you want to delete below user?</p>
    <table id="userTable">
        <tr>
            <td>${User.id}</td>
            <td>${User.userName}</td>
            <td>${User.email}</td>
            <td>${User.fullName}</td>
            <td>${User.country}</td>
            <td>${User.createdOn}</td>
            <td>${User.updatedOn}</td>
        </tr>
    </table>
    <div class="button-container">
        <form action="/user/delete/${User.id}" method="post" style="display:inline;">
            <input type="hidden" name="_method" value="DELETE">
            <button class="confirm-btn" type="submit">Yes, Delete</button>
        </form>
        <a href="/users" class="cancel-btn">Cancel</a>
    </div>
</div>
</body>
</html>
