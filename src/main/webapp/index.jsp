<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello HaproPotter!" %>
</h1>
<br/>

<%--<a href="index">Get time now!!!</a>--%>
<style type="text/css">
    .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
    }
    .login input {
        padding:5px; margin:5px
    }
</style>
<form action="login" method="get">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="30" placeholder="username"/>
        <input type="password" name="password" size="30" placeholder="password" />
        <input type="submit" value="Sign in"/>
    </div>
</form>

<form action="/converter" method="get">
    <p>Rate</p><br>
    <input type="text" name="Rate" placeholder="Rate" value="24000"><br>
    <p>USD</p><br>
    <input type="text" name="USD" placeholder="USD" value="0">
    <input type="submit" value="Converter"/>
</form>

<h2>Vietnamese Translate</h2>
<form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="" value="">
    <input type="submit" value="Translate"/>
</form>

<h2>Tính Chiết Khấu</h2>
<form action="/calculator" method="post">
    <p>Mô tả sp</p>
    <input type="text" name="moTa" placeholder="" value=""><br>
    <p>Giá Niêm Yết</p>
    <input type="text" name="price" placeholder="" value=""><br>
    <p>Chiết Khấu (%)</p>
    <input type="text" name="discount" placeholder="" value="">
    <input type="submit" value="Calculator"/>
</form>
</body>
</html>