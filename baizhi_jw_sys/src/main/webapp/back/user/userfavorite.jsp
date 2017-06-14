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
            $("#userfavoritedt").datagrid({
                url:'${pageContext.request.contextPath}/user/showFavorite?id=${param.id}',
                remoteSort:false,

                fitColumns:true,
                fit:true,

                striped:true,
                //method:'get',
                columns:[[
                    {title:'用户id',field:'uid',width:200, sortable:true},
                    {title:'用户名',field:'username',width:200, sortable:true},
                    {title:'律师id',field:'lid',width:200, sortable:true},
                    {title:'律师名',field:'lawername',width:200, sortable:true},
                    {title:'律师地址',field:'laweraddress',width:200, sortable:true},
                    {title:'律师电话',field:'lawerphone',width:200, sortable:true},
                ]]
            })
        })

    </script>


<div data-options="region:'south'," style="height:715px;">
<table id="userfavoritedt" class="easyui-datagrid"></table>

</div>
</div>


