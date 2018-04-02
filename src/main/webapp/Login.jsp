<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<link href="css/default.css" rel="stylesheet" type="text/css" />
<title style="font-size:12px">XX银行个人网上银行系统</title>
	<style type="text/css">
		body {
			font-family: Tahoma, Verdana;
			font-size: 12px
		}
	</style>
</head>
<body>

	<div id="title" align="center"><h1>XXX银行个人网上银行系统</h1></div>
	<div id="operation">
		<div id="link_student" align="center" >
             <form action="Lo_gin" method="post">
			<TABLE class="divTab" width="500">
            <TR>
                <TD colspan="2" align="center" style="font-size:25px;">个人客户登录</TD>
            </TR>
                <c:if test="${!empty check}">
            <TR>
                <TD colspan="2" align="center" style="font-size:15px;color:red;">
                    账号或密码不对！
                </TD>
            </TR>
                </c:if>
            <TR>
                <TD align="right" width="35%">账号：</TD>
                <TD align="left" width="65%"><INPUT TYPE="text"  NAME="accountId"></TD>
            </TR>
            <TR>
                <TD align="right" width="35%">密码：</TD>
                <TD align="left" width="65%"><INPUT TYPE="password" NAME="password"></TD>
            </TR>
            <TR>
                <TD colspan="2" align="center" style="font-size:30px;">
                    <INPUT TYPE="submit" value="提　　交">
                    <INPUT TYPE="reset" value="重　　置">
                </TD>
            </TR>
            </TABLE>
            </form>
		</div>
	</div>
</body>
</html>
