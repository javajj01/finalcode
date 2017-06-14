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
            $("#lawerlawertypedt").datagrid({
                url:'${pageContext.request.contextPath}/lawer/lawerLawerType?id=${param.id}',
               remoteSort:false,
               fitColumns:true,
               height:400,
               fit:true,
               striped:true,
                method:'get',
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'律师姓名',field:'name',width:200, sortable:true},
                    {title:'分类',field:'typename',width:200, sortable:true},

                ]]
            })

        })

    </script>


<table id="lawerlawertypedt" class="easyui-datagrid"></table>




