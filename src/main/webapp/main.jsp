<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>

<script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

$(function(){
	$.ajax({
		url:"http://172.20.10.14:8080/SSMT10_22_war/sel",
		type:"post",
		success:function(msg){
			var json = eval("(" + msg + ")");
			$.each(json.people,function(index,person){
				var id = $("<td></td>").append(person.id);
				var name = $("<td></td>").append(person.name);
				var password = $("<td></td>").append(person.password);
				$("<tr></tr>").append(id).append(name).append(password).appendTo($("#table tbody"));
			});
		},
		error:function(){
			
		}
	});
	
	
});


</script>

</head>
<body>
<table id="table">
<tr>
<td>编号</td>
<td>姓名</td>
<td>密码</td>
</tr>

</table>

</body>

</html>










