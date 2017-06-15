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
            $("#dealdt").datagrid({
                url:'${pageContext.request.contextPath}/deal/show',
                remoteSort:false,
                pageNumber:1,
                pageSize:2,
                fitColumns:true,
                fit:true,
                pageList:[2,4,6,8],
                pagination:true,
                striped:true,
                //method:'get',
                toolbar: [{
                    iconCls: 'icon-add',
                    handler: function(){
                        //添加的窗口
                        $("#dealdiv").dialog({
                            iconCls:'icon-save',
                            href:'${pageContext.request.contextPath}/back/deal/add.jsp',
                            title:"添加分类",
                            buttons:[{
                                text:'保存',
                                iconCls:'icon-save',
                                handler:adddeal,
                            },{
                                text:'关闭',
                                iconCls:'icon-cancel',
                                handler:closeda,
                            }]
                        })

                    }
                },'-',{
                    iconCls: 'icon-help',
                    handler: function(){alert('帮助按钮')}
                }],
                onLoadSuccess:function () {
                    $(".del").linkbutton({
                        iconCls:"icon-remove",
                        plain:true
                    })
                    $(".edit").linkbutton({
                        iconCls:"icon-edit",
                        plain:true
                    })

                },
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'标题',field:'title',width:200, sortable:true},
                    {title:'内容',field:'content',width:200, sortable:true},
                    {title:'创建时间',field:'createDate',width:200, sortable:true},
                    {title:'分类',field:'typename',width:200, sortable:true},
                    {title:'操作',field:'en',width:200, sortable:true,
                        formatter:function(value,row,index){
                            return "<a class='del' href='javascript:;' onclick=\"test30('"+row.id+"')\">删除</a>";
                        }
                    },
                ]]
            })

        })
        function test30(id) {
            $.messager.confirm("一个温馨的提示","你这个小白猪确定要删除么",function (r) {
                if(r){
                    $.post("${pageContext.request.contextPath}/deal/delete",{id:id});
                    $("#dealdt").datagrid('reload');
                }

            });
        }





        function closeda() {
            $("#dealda").dialog('close',true);
        }
        function adddeal() {
            $('#dealaddff').form("submit",{
                url:"${pageContext.request.contextPath}/deal/add",
                success:function(){
                    $("#dealdiv").dialog('close',true);
                    $("#dealdt").datagrid('reload');
                }
            })
        }

    </script>

<div data-options="region:'north'," style="height:50px;">
    <div style="text-align: center;margin: 10px 0px 10px 0px;">
        <input id="ss" class="easyui-searchbox" style="width:300px"
               data-options="searcher:test4,prompt:'Please Input Value',menu:'#mm'">
        <div id="mm" style="width:120px">
            <div data-options="name:'name'">名称</div>
            <div data-options="name:'age'">年龄</div>
        </div>
    </div>
</div>

<div data-options="region:'south'," style="height:715px;">
<table id="dealdt" class="easyui-datagrid"></table>

<div id="dealdiv" style="width:800px;height:500px"></div>

<div id="dealda" style="width:600px;height:300px">


</div>
</div>


