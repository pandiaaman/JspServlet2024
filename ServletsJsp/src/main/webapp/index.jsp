<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.container{
		width: 40%;
		border: 1px solid black;
		margin: auto;
		padding: 20px;
	}
</style>
</head>
<body>

	<div class="container">
		<p>hello there</p>
		
		<a href="first">run the firstServlet</a>
		
		<a href="second">run the secondServlet</a>
		
		<form action="registerServlet" method="post" class="form-class">
			<input type="text" name="user_name" placeholder="enter your name" required/>
			<br>
			<input type="number" name="user_age" placeholder="enter your age" />
			<br>
			<input type="email" name="user_email" placeholder="enter your email" />
			<br>
			<input type="password" name="user_password" placeholder="enter your password" />
			<br>
			<p>select your gender</p>
			<input type="radio" name="user_gender" value="male" > Male
			<input type="radio" name="user_gender" value="female" /> Female
			<br>
			<p>Select Course</p>
			<select name="user_course">
				<option value="Java">Java</option>
				<option value="PHP">PHP</option>
				<option value="Python">Python</option>
				<option value="SQL">SQL</option>
			</select>
			<br>
			<p>agree terms and conditions <input type="checkbox" value="checked" name="condition"/> </p>
			<br>
			<button type="submit">Register</button>
			&nbsp;
			<button type="reset">Reset</button>
		</div>
	</form> 

</body>
</html>