<%--
  Created by IntelliJ IDEA.
  User: keZhong1986
  Date: 2019/2/12
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h3>登录</h3>
<br/>
<form action="login" method="post">
    <table>
        <tr>
            <td>
                <label>登录名：</label>
                <input type="text" id="loginname" name="loginname">
            </td>
        </tr>
        <tr>
            <td>
                <label>密码：</label>
                <input type="password" id="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
