<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>交易记录查询</title>
    <link href="css/default.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div>
        【${requestScope.account.accountId}用户】，欢迎你登录XX银行个人网上银行系统！
    </div>
    <div id="menu" align="center">
        <div class="operateTitle">操作菜单<div>
            <span class="menu"><a href="Ind_ex">个人首页</a></span><span class="menu">
            <a href="balance?Id=${requestScope.account.accountId}">账号余额查询</a></span>
            <span class="menu"><a href="Trade_Record">交易记录查询</a></span>
            <span class="menu"><a href="Trans_fer">行内单笔转账</a></span>
        </div>
    <div id="title" align="center"><h1>交易记录查询</h1></div>
    <div align="center">
            <form action="tradeRecord" method="get">
			<TABLE class="divTab" width="500">
            <TR>
                <TD colspan="2" align="center" style="font-size:25px;">
                    请选择查询交易时段
                </TD>
            </TR>
                <c:if test="${!empty check}">
            <TR>
                <TD colspan="2" align="center" style="font-size:15px;color:red;">
                    请输入正确的查询时段！
                </TD>
            </TR>
            </c:if>
            <TR>
                <TD align="right" width="35%">开始时间：</TD>
                <TD align="left" width="65%"><INPUT TYPE="date"  NAME="start_time"></TD>
            </TR>
            <TR>
                <TD align="right" width="35%">结束时间：</TD>
                <TD align="left" width="65%"><INPUT readonly TYPE="text" NAME="end_time" value="<jsp:useBean id="now" class="java.util.Date" scope="page"/><fmt:formatDate value="${now}" pattern="yyyy-MM-dd" />"></TD>

            </TR>
			<TR>
				<TD colspan="2">*本查询仅能查询自当前时间起一个月内的业务</TD>
            </TR>
            <TR>
                <TD colspan="2" align="center" style="font-size:30px;">
                    <INPUT TYPE="submit" value="查看交易明细">
                    <INPUT TYPE="reset" value="取消操作">
                </TD>
            </TR>
            </TABLE>
            </form>
    </div>
        </div>
    </div>
</body>
</html>
