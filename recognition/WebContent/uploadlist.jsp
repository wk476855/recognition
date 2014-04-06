<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.io.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>列表显示</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

<body>
<%
	String tempPath1 = "upload"+"\\";//指定目录(本地)
	String tempPath2 = "upload"+"/";//指定目录(url)
		
	String realpath = request.getSession().getServletContext().getRealPath("\\");//服务器绝对路径
	realpath = realpath + tempPath1;
	
	String path = request.getContextPath();
	String basepath = request.getScheme()+"://"+request.getServerName()
					+":"+request.getServerPort()+path+"/";//服务器Url路径
	basepath = basepath + tempPath2;
	
	
	System.out.println(realpath);
	System.out.println(basepath);	
	File f = new File(realpath);
	if (!f.exists())
	{
		out.println(basepath+"查无文件");
		return;
	}
	File fa[] = f.listFiles();
	for(int i=0;i<fa.length;i++)
	{
		File fs = fa[i];
		if (!fs.isDirectory())
		{
			out.println("<p"+fs.getName()+"</p>");
			out.println("<br />");
		}
		else{
		}
	}
%>
</body>
</html>

