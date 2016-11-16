<%@page import="com.hb.guest.model.GuestDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style></style>
<!-- jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList list = (ArrayList)request.getAttribute("alist");
	
		for(int i=0; i<list.size(); i++){
	
			GuestDto dto = (GuestDto)list.get(i);
			
			out.print(dto.getSabun());
			out.print(",");
			out.print(dto.getName());
			out.print(",");
			out.print(dto.getNalja());
			out.print(",");
			out.println(dto.getPay());
			out.print("<br/>");
		}
	%>
</body>
</html>