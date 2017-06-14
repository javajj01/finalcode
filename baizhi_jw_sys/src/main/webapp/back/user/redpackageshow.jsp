<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2017/5/31
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<script>

        $(function () {
            $("#useredpackagedt").datagrid({
                url:'${pageContext.request.contextPath}/user/showRedpackage?id=${param.id}',
                remoteSort:false,

                fitColumns:true,
                fit:true,

                striped:true,
                //method:'get',
                columns:[[
                    {title:'用户编号',field:'id',width:200, sortable:true},
                    {title:'用户名',field:'username',width:200, sortable:true},
                    {title:'红包金额',field:'redpackage',width:200, sortable:true},
                    {title:'红包增语',field:'content',width:200, sortable:true},
                    {title:'所赠律师id',field:'lawerid',width:200, sortable:true},
                    {title:'所赠律师名',field:'lawername',width:200, sortable:true},
                ]]
            })
        })

    </script>


<div data-options="region:'south'," style="height:715px;">
<table id="useredpackagedt" class="easyui-datagrid"></table>

</div>
</div>


