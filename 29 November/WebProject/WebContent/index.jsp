<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
    <style>
        table {
            border-collapse: collapse;
            width: 30%;
            margin: auto;
        }
        th, td {
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <form method="post" action="login.jsp">
        <table border="1">
            <thead>
                <tr>
                    <th colspan="2">Login Here</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="uname" required /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass" required /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    <td><input type="reset" value="Reset" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        Yet Not Registered? 
                        <a href="reg.jsp">Register Here</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
</body>
</html>