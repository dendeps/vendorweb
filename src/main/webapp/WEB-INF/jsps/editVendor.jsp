<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	
		<form action="updateVendor" method="post">
		<pre>
			Id: <input type="text" name="id" value ="${vendor.id}" readonly/>
			Code: <input type="text" name="code" value ="${vendor.code}"/>
			Name: <input type="text" name="name" value ="${vendor.name}"/>
			Type: Regular<input type="radio" name="type" value = "REGULAR"  ${vendor.type=="REGULAR"?"checked":""}/>
      			 Contract<input type="radio" name="type" value = "CONTRACT" ${vendor.type=="CONTRACT"?"checked":""}/>
      	    Email: <input type="text" name="email" value ="${vendor.email}"/>
			Phone: <input type="text" name="phone" value ="${vendor.phone}"/>
		  Address: <input type="text" name="address" value ="${vendor.address}"/>
      		<input type="submit" value="Save" />
      	</pre>
      	</form>
${msg}

<a href="displayVendors">View all</a>

</body>
</html>