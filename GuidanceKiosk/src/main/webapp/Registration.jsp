<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css">
</head>
<body>
    <div id="design"></div>
    <div id="form">
			<%
				String message = (String)request.getParameter("message");
				
			%>
        <form action="userregisteration" method="post" style="border:1px solid black">
        	<% 
        	if (message != null) {
        	%>
        	<p style="color:blue">
       
        	<%=message%>
        	</p>
        	<% 
        	}
        	
        	%>
            <legend>Sign Up as a mentee</legend>
            <div class="form-group">
                <label for="firstname">First Name</label>
                <input type="text" id="firstname" name="firstname" required>
            </div>
            <div class="form-group">
                <label for="lastname">Last Name</label>
                <input type="text" id="lastname" name="lastname" required>
            </div>
            <div class="form-group">
                <label for="age">Age</label>
                <input type="number" id="age" name="age" min="18" max="65" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <input type="submit" value="Sign up">
            </div>
        </form>
    </div>
</body>
</html>