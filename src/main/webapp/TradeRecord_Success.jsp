<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
         <table class="divTab" width="100%">
            <tr>
                <td><b>流水号</b></td>
                <td><b>交易类型</b></td>
				<td><b>交易金额</b></td>
                <td><b>交易时间</b></td>
                <td><b>交易摘要</b></td>
            </tr>
            <c:forEach varStatus="row" var="trade" items="${requestScope.trades}">
                <tr>
                    <td><b>${trade.id}</b></td>
                    <td><b>${trade.tradeType}</b></td>
                    <td><b>${trade.tradeMoney}</b></td>
                    <fmt:formatDate var="tradeTime" value="${trade.tradeTime}"
                                    pattern="yyyy-MM-dd hh:mm:ss"/>
                    <td><b>${tradeTime}</b></td>
                    <td><b>${trade.tradeDigest}</b></td>
                </tr>
            </c:forEach>
        </table>
    </div>
        </div>
    </div>
</body>
</html>
