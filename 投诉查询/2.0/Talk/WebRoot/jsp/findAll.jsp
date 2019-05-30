<%@ page language="java" import="java.util.*,com.demo.vo.*,com.demo.factory.*,com.demo.dao.*" pageEncoding="utf-8"%>
<script language="javascript">
  function te(f)
  {
  if(!(/\d{4}-\d{2}-\d{2}/g).test(f.reaction.value))
  {
    f.reaction.focus();
    f.reaction.select();
    alert("请输入日期");
    return false;
  }
  
  }

</script>
<html>
	<head>
		<titile></titile>
		<script type="text/javascript" src="../My97DatePicker/WdatePicker.js"></script>
	</head>
	<body>
		<center>
<h1>投诉线索筛查系统 By 虫它</h1>

<form action="go" method="post">
	   	Show All: <input type="submit" value="Go">
</form>

<form action="goAddress" method="post">
	   	Show Address: 
	<select id="projectPorperty" name="projectPorperty">
		<option value="下城区">下城区</option>
		<option value="上城区">上城区</option>
		<option value="江干区">江干区</option>
		<option value="拱墅区">拱墅区</option>
		<option value="西湖区">西湖区</option>
		<option value="滨江区">滨江区</option>
		<option value="桐庐县">桐庐县</option>
		<option value="淳安县">淳安县</option>
		<option value="萧山区">萧山区</option>
		<option value="建德市">建德市</option>
		<option value="富阳区">富阳区</option>
		<option value="余杭区">余杭区</option>
	</select>
	   	<input type="submit" value="Go">
</form>

<form action="goTime" method="post" onSubmit="return te(this)">
	   	Show Reaction: <input name="reaction" tyep="text" class="Wdate" onFocus="WdatePicker({lang:'zh-cn'})"/><input type="submit" value="Go">
</form>


</center>
	</body>
</html>
