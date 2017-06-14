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
            $("#orderdt").datagrid({
                url:'${pageContext.request.contextPath}/order/show',
                remoteSort:false,
                pageNumber:1,
                pageSize:2,
                fitColumns:true,
                fit:true,
                pageList:[2,4,6,8],
                pagination:true,
                striped:true,
                //method:'get',
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'订单内容',field:'content',width:200, sortable:true},
                    {title:'订单类型',field:'type',width:200, sortable:true,
                        formatter:function(value,row,index){
                            if(row.type=='word'){
                                return '文字提问';
                            }else{
                                return '电话提问';
                            }
                        }
                    },
                    {title:'状态',field:'status',width:200, sortable:true,
                        formatter:function(value,row,index){
                            if(row.status==1){
                                return '已支付未服务';
                            }
                            if(row.status==2){
                                return '服务中';
                            }
                            if(row.status==3){
                                return '服务结束未评价';
                            }
                            if(row.status==4){
                                return '已评价 订单完成';
                            }
                        }
                    },
                    {title:'用户id',field:'userid',width:200, sortable:true},
                    {title:'用户名',field:'username',width:200, sortable:true},
                    {title:'律师id',field:'lid',width:200, sortable:true},
                    {title:'律师名',field:'lawername',width:200, sortable:true},
                ]]
            })

        })
    </script>



<div data-options="region:'south'," style="height:715px;">
<table id="orderdt" class="easyui-datagrid"></table>

<div id="orderdiv" style="width:800px;height:500px"></div>

<div id="orderda" style="width:600px;height:300px">


</div>
</div>


