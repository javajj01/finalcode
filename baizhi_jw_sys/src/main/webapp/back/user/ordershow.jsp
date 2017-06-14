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
            $("#userorderdt").datagrid({
                url:'${pageContext.request.contextPath}/user/showOrder?id=${param.id}',
                remoteSort:false,

                fitColumns:true,
                fit:true,

                striped:true,
                //method:'get',
                columns:[[
                    {title:'订单编号编号',field:'oid',width:200, sortable:true},
                    {title:'用户id',field:'uid',width:200, sortable:true},
                    {title:'用户名',field:'username',width:200, sortable:true},
                    {title:'订单内容',field:'ordercontent',width:200, sortable:true},
                    {title:'律师id',field:'lid',width:200, sortable:true},
                    {title:'律师名',field:'lawername',width:200, sortable:true},
                    {title:'订单状态',field:'l',width:200, sortable:true,
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
                    {title:'评价内容',field:'comment',width:200, sortable:true},
                ]]
            })
        })

    </script>


<div data-options="region:'south'," style="height:715px;">
<table id="userorderdt" class="easyui-datagrid"></table>

</div>
</div>


