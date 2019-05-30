<%@ page language="java" import="java.util.*,com.demo.*,com.demo.vo.*" pageEncoding="utf-8"%>
<html>
	<head>
		<title>Show Address</title>
	</head>
	<body>
		<table border="1"  frame=void style="margin:10px 1px 50px 0px">  
	<tr>
		 <td>city</td>
		 <td>county</td>
		 <td>name</td>
		 <td>handletimes</td>
		 <td>state</td>
		 <td>text</td>
		 <td>reflecttimes</td>
		 <td>source</td>
		 <td>company</td>
		 <td>replytimes</td>
		 <td>replytext</td>
		 
	</tr>
<%
	request.setCharacterEncoding("utf-8");
		if(request.getAttribute("info")!=null){
		List<InfoData> list=(List<InfoData>)request.getAttribute("info");
		Iterator<InfoData> iter=list.iterator();
		while(iter.hasNext()){
		InfoData u=iter.next();
%>
		<tr>
		 <td><%=u.getCity() %></td>
		 <td><%=u.getCounty() %></td>
		 <td><%=u.getName() %></td>
		 
		 <td><%=u.getHandletimes() %></td>
		 <td><%=u.getState() %></td>
		 <td><%=u.getText() %></td>
		 
		 <td><%=u.getReflecttimes() %></td>
		 <td><%=u.getSource()%></td>
		 <td><%=u.getCompany()%></td>
		  <td><%=u.getReflecttimes()%></td>
		 <td><%=u.getReplytext()%></td>
		</tr>
<%
		}
	}
 %>   
</table>
	</body>
</html>
