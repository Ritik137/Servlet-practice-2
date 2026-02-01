<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Form Page</title>
</head>
<body>
	<div class="container">
	<h1>My Form</h1>
	
	<form action="/Youtube/register" method="post">
		
			<table>
				<tr>
						<td> Enter your name :</td>
						<td><input type="text" name="user_name" placeholder="Enter your name here..." ></td>
				</tr>
				
				<tr>
					<td>Enter your password</td>
					<td><input type="password" name="user_password" placeHolder="Enter your password..."></td>
					
				</tr>
				
				<tr>
						<td>Enter your Email</td>
						<td><input type="email" name="user_email" placeholder="Enter your email..."></td>
				</tr>
				
				<tr>
					<td>select gender</td>
					<td><input type="radio" name="user_gender" value="male"> Male &nbsp; &nbsp; <input type="radio" name="user_gender" value="female"> Female </td>
					
				</tr>
				<tr>
					<td>Select your course </td>
					<td> <select name="user_course">
						<option value="Java">Java</option>
						<option value="Php">Php</option>
						<option value="Python">Python</option>
						<option value="Android">Android</option>
					</select>
					</td>
				</tr>
				
				<tr>
					<td style="text-align: right;">
						<input type="checkbox" value="checked" name="condition" />
					</td>
					<td> Agree terms and conditions</td>
				</tr>
				<tr>
					<td> 
					<button type="submit">Register</button>
					<button type="reset">Reset</button>
					
					</td>
				</tr>
			</table>
	</form>
	</div>
</body>
</html>
