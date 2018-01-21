
<!DOCTYPE html>
<html>
<%@ page contentType="text/html; charset=UTF-8" %>

	
<body>
	
	<form action="showUser" method="post">
    userid:<input type="text" name = "userid" ><p> 
   <input type="hidden" name="id" value="${user1.id}">
    <input type="submit" value="showuser">
</form>
	<textarea rows="15" cols="40">
id: ${user.id}
名字：${user.userName}
密码：${user.password}
年龄：${user.age}
	
	</textarea>
		<textarea rows="4" cols="40">
${errmessage}
	</textarea>
		
	
</body>
</html>