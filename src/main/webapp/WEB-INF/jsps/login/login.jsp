<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Here</h2>
<form action="verifylogin" method="post">
 <pre>
  ${error}
 
emailid<input type="text" name="emailId"/>
password<input type="password" name="password"/>
     <input type="submit" name="login"/>
   </pre>
     </form>
</body>
</html>         