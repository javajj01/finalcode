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
            $("#lawercommentdt").datagrid({
                url:'${pageContext.request.contextPath}/lawer/lawerComment?id=${param.id}',
               remoteSort:false,
               fitColumns:true,
               height:400,
               fit:true,
               striped:true,
                method:'get',
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'律师姓名',field:'name',width:200, sortable:true},
                    {title:'评价用户',field:'username',width:200, sortable:true},
                    {title:'评价内容',field:'content',width:200, sortable:true},
                    {title:'评价时间',field:'createTime',width:200, sortable:true},

                ]]
            })

        })

    </script>


<table id="lawercommentdt" class="easyui-datagrid"></table>




