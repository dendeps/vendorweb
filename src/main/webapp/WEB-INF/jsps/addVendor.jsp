<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="saveVen" method="post">
<pre>
	  Id: <input type="text" name="id" />
	Code: <input type="text" name="code" />
	Name: <input type="text" name="name" />
	Type:  Regular<input type="radio" name="type" value = "REGULAR"/>
      	  Contract<input type="radio" name="type" value = "CONTRACT"/>
    Email: <input type="text" name="email" />
    Phone: <input type="text" name="phone" />
  Address: <input type="text" name="address" />
      	   <input type="submit" value="Save" />
</pre>
</form>

${msg}


<a href="displayVendors">View all</a>

</body>
</html>