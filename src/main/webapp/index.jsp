<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="UserServlet.do" method="post" enctype="multipart/form-data">
		name:<input name="name" /> <br />
		nick:<input name="nick" /> <br />
		photo: <input type="file" name="photo" /> <br />
		<button type="submit">GO</button>
	</form>
</body>
</html>