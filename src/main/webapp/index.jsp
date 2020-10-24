<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
<body>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/sel">
    <input type="submit" value="查询"/>
</form>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/selone">
    <input type="text" name="id"/>
    <input type="submit" value="查询"/>
</form>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/add">
    <input type="text" name="id"/>
    <input type="text" name="username"/>
    <input type="text" name="jobs"/>
    <input type="text" name="phone"/>
    <input type="submit" value="添加"/>
</form>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/del">
    <input type="text" name="id"/>
    <input type="submit" value="删除"/>
</form>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/upda">
    <input type="text" name="id"/>
    <input type="text" name="username"/>
    <input type="text" name="jobs"/>
    <input type="text" name="phone"/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>