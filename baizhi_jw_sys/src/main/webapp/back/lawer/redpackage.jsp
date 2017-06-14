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
            $("#redpackagedt").datagrid({
                url:'${pageContext.request.contextPath}/lawer/lawerRedpackage?id=${param.id}',
                remoteSort:false,
                fitColumns:true,
                fit:true,
                striped:true,
                //method:'get',
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'律师姓名',field:'name',width:200, sortable:true},
                    {title:'用户',field:'username',width:200, sortable:true},
                    {title:'心意金额',field:'money',width:200, sortable:true},
                    {title:'心意增语',field:'content',width:200, sortable:true},

                ]]
            })

        })

    </script>

<div data-options="region:'north'," style="height:50px;">

</div>

<div data-options="region:'south'," style="height:715px;">
<table id="redpackagedt" class="easyui-datagrid"></table>



</div>
</div>


