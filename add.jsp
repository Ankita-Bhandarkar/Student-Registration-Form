<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><form  action="addStudent">
<table border="1">

<tr><th>ID:</th>
<td><input type="text" name="id" ></td></tr>
<tr><th>NAME:</th>
<td><input type="text"  name="name"></td></tr>
<tr><th>AGE:</th>
<td><input type="text" name="age"></td></tr>
<tr><th>ADDRESS:</th>
<td><input type="text" name="address" ></td><br>

<tr><th>Email Id</th>
<td><input type="text" name="email"></td></tr>
<tr><th></th><td><input type="submit" value="Register"></td></tr>
</table></center>
</form>


<form action="search">
<h3 align ="center">
Search By Id<input type="text" name="id"></br>
<input type="submit" value="Search">

</h3>



<form action="deleteStudent">
<h3 align ="center">
Delete By Id<input type="number" name="id"></br>
<input type="submit" value="Delete">

</h3>








</body>
</html>