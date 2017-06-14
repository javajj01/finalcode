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
            $("#userdt").datagrid({
                url:'${pageContext.request.contextPath}/user/show',
                remoteSort:false,
                pageNumber:1,
                pageSize:2,
                fitColumns:true,
                fit:true,
                pageList:[2,4,6,8],
                pagination:true,
                striped:true,
                //method:'get',
                onLoadSuccess:function () {
                    $(".userdel").linkbutton({
                        iconCls:"icon-remove",
                        plain:true
                    })
                    $(".useredit").linkbutton({
                        iconCls:"icon-edit",
                        plain:true
                    })

                },
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'姓名',field:'name',width:200, sortable:true},
                    {title:'电话',field:'phone',width:200, sortable:true},
                    {title:'余额',field:'money',width:200, sortable:true},
                    {title:'操作',field:'en',width:400, sortable:true,
                        formatter:function(value,row,index){
                            return  "<a class='useredit' onClick=\"test20('"+ row.id +"')\"  href='javascript:;'>查看用户订单</a>"+
                                    "<a class='useredit' onClick=\"test21('"+ row.id +"')\"  href='javascript:;'>查看用户红包</a>"+
                                    "<a class='useredit' onClick=\"test22('"+ row.id +"')\"  href='javascript:;'>收藏律师</a>";
                        }
                    },
                ]]
            })

        })





        function test20(id){
            $("#userorder").dialog({
                title:"订单记录",
                iconCls:"icon-man",
                width:900,
                height:500,

                href:'${pageContext.request.contextPath}/back/user/ordershow.jsp?id='+id,
            })
        }
        function test21(id){
            $("#userredpackage").dialog({
                title:"用户红包记录",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/user/redpackageshow.jsp?id='+id,
            })
        }
        function test22(id){
            $("#userfavorite").dialog({
                title:"用户收藏律师",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/user/userfavorite.jsp?id='+id,
            })
        }
    </script>


<div data-options="region:'south'," style="height:715px;">
<table id="userdt" class="easyui-datagrid"></table>

<div id="userdiv" style="width:400px;height:200px"></div>

<div id="da" style="width:600px;height:300px">

    <div id="userorder" style="width:600px;height:300px"></div>
    <div id="userredpackage" style="width:700px;height:500px"></div>
    <div id="userfavorite" style="width:700px;height:500px"></div>
</div>
</div>


