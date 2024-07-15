<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<s:head/>
</head>
<body>
<h2>Registration Form</h2>
	<s:form action="registerAction">
		<s:textfield name="firstName" label="First Name"></s:textfield>
		<s:textfield name="lastName" label="Last Name"></s:textfield>
		<s:radio name="gender" list="{'Male','Female'}" label="Gender"></s:radio>
		<s:textfield name="age" label="Age"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textarea name="address" cols="30" rows="7" label="Address"></s:textarea>
		<!--  remove these 2 below lines and run -->
		<!--  <s:select multiple="true" list="{'Blue','Red','Green','White'}" name="selectedColor" headerKey="None" headerValue="Select a color"></s:select> --> 
		<!-- <s:select list="colors" name="selectedColor" headerKey="None" headerValue="Select a color"></s:select> -->
		<s:reset value="Reset"></s:reset>
		<s:submit value="Register"></s:submit>
	</s:form>
	
	 <h2>Product List</h2>
    <table border="1" width="300">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Price</th>
        </tr>
        <s:iterator value="products" var="product">
            <tr>
                <td><s:property value="#product.productId"/></td>
                <td><s:property value="#product.productName"/></td>
                <td><s:property value="#product.productPrice"/></td>
            </tr>
        </s:iterator>
    </table>
	
</body>
</html>

