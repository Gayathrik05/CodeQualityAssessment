<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
th {
	text-align: left;
}

th, td {
	padding: 15px;
}

div {
	border: 2px solid navy;
	border-raidus: 3px;
	width: 70%;
}

form {
	width: 75%;
}
</style>
<!-- <script> 
/* function lettersAndSpaceCheck(name)
{
   var nameregEx = /^[a-z][a-z\s]*$/;
   
		
   if(name.value.match(regEx))
     {
      return true;
     }
   else
     {
     alert("Please enter letters and space only.");
     }
}  */   

function validate(){
var name="^[A-Z a-z]+$";
var pass="^[0-9]+$";
var eid=document.getElementById("eid").value;
var ename=document.getElementById("ename").value;
var esalary=document.getElementById("esalary").value;


if (eid==null || eid==""){  
    alert("Employee ID can't be blank");  
    return false;  
    } else if(! eid.match(pass)){
        alert("Enter valid Employee ID");  
        return false; 
    }

if (ename==null || ename==""){  
    alert("Employee Name can't be blank");  
    return false;  
    } else if(! ename.match(name)){
        alert("Enter valid Employee Name");  
        return false; 
    }
if (esalary==null || esalary==""){  
    alert("Employee salary can't be blank");  
    return false;  
    } else if(! esalary.match(name)){
        alert("Enter valid Employee Salary");  
        return false; 
    }


}

</script>
 --></head>
<body class="mt-5">
	<center>
		<h1 style="color: green;">Enter Employee Details</h1>
		<div class="mb-3 mt-4">
			<form action="PerformInsert" method="post"  name="form1" class="was-validated">
				<!-- url pattern of the servlet -->
				<table class="mb-4 mt-4">
					<tr>
						<th>Employee ID</th>
						<td><input type="number" name="id" id="eid"
							class="form-control form-control-lg" required/></td>
					</tr>
					<!-- name same as bean property -->
					<tr>
						<th>Employee Name</th>
						<td><input type="text" name="name" id="ename"
							class="form-control form-control-lg" required/></td>
					</tr>
					<tr>
						<th>Employee Salary</th>
						<td><input type="number" name="salary" id="esalary"
							class="form-control form-control-lg" required/></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Insert Employee" onclick="validate()" class="btn btn-outline-success" /></td>
					</tr>
				</table>
			</form>
		</div>
	</center>
</body>
</html> --%>