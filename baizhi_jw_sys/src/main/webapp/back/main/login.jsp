<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2017/6/12
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/themes/ui-sunny/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/IconExtension.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/form.validator.rules.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/easyui-lang-zh_CN.js"></script>
    <script>
        var $btn;
        var $loginff;
        $(function () {
            $btn=$("#btn");
            $loginff=$("#loginff");
            $btn.linkbutton({
                onClick:test1,
            })
        })

        function test1() {

            $loginff.form('submit',{
                url:"${pageContext.request.contextPath}/admin/login",
                success:function (result) {
                    var data = eval('(' + result+ ')');
                    if(data.temp){
                      
                    window.location.href="${pageContext.request.contextPath}/back/main/main.jsp"
                    }else {
                        window.location.href="${pageContext.request.contextPath}/back/main/login.jsp"
                    }
                }
            })
        }
    </script>
</head>
<body>


<form method="post" id="loginff">
    用户名:<input name="adminname" class="easyui-textbox" data-options="iconCls:'icon-search;height:34px;padding:10px'" ><br/>
    密码&nbsp:<input name="password"  class="easyui-passwordbox"  data-options="iconCls:'icon-search;height:34px;padding:10px'" ><br/>

    <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui</a>
</form>
</body>
</html>
