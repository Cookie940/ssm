<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>行内单笔转账</title>
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
    <div id="title" align="center"><h1>行内单笔转账成功</h1></div>
    <div align="center">
        <table class="divTab" width="80%">
            
            <tr>
                <td colspan="2">
                    <br/>
                    <br/>
                    <span class="remaining"> 
                    你已成功将￥[${requestScope.Ok[1]}]转入到[${requestScope.Ok[0]}账号]！
                    </span>
                    <br/>
                    <br/>
                    <br/>
                </td>
            </tr>
        </table>
    </div>
        </div>
    </div>
</body>
</html>
