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
            $("#dealtypedt").datagrid({
                url:'${pageContext.request.contextPath}/dealtype/show',
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
                        $("#dealtypediv").dialog({
                            iconCls:'icon-save',
                            href:'${pageContext.request.contextPath}/back/dealtype/add.jsp',
                            title:"添加分类",
                            buttons:[{
                                text:'保存',
                                iconCls:'icon-save',
                                handler:adddealtype,
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

                },/*"<a class='del' href='javascript:;' onclick=\"test1('"+row.id+"')\">删除</a>"+*/
                columns:[[
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'名称',field:'name',width:200, sortable:true},
                    {title:'操作',field:'en',width:200, sortable:true,
                        formatter:function(value,row,index){
                            return  "<a class='edit' onClick=\"test31('"+ row.id +"')\"  href='javascript:;'>修改</a>"+
                                    "<a class='edit' onClick=\"test11('"+ row.id +"')\"  href='javascript:;'>查看子标签</a>";
                        }
                    },
                ]]
            })

        })
       /* function test1(id) {
            $.messager.confirm("一个温馨的提示","你这个小白猪确定要删除么",function (r) {
                if(r){
                    $.post("/dealtype/delete",{id:id});
                    $("#dealtypedt").datagrid('reload');
                }

            });
        }*/

        function test11(id){
            $("#twodealtypedia").dialog({
                title:"子标签",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/dealtype/twoDealtype.jsp?id='+id,
            })
        }

        function test31(id) {
            $(".dealtypeda").dialog({
                title:"修改信息",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/dealtype/update.jsp?id='+id,
                buttons:[{
                    text:'保存',
                    iconCls:'icon-save',
                    handler:saveDealtype,

                },{
                    text:'关闭',
                    iconCls:'icon-cancel',
                    handler:closeda,
                }]
            })
        }

        function saveDealtype() {
            $("#dealtypeupdateff").form("submit",{
                url:'${pageContext.request.contextPath}/dealtype/update',
                success:function(){
                    $(".dealtypeda").dialog('close',true);
                    $("#dealtypedt").datagrid('reload');
                }
            })
        }
        function closeda() {
            $(".dealtypeda").dialog('close',true);
        }
        function adddealtype() {
            $('#dealtypeaddff').form("submit",{
                url:"${pageContext.request.contextPath}/dealtype/add",
                success:function(){
                    $("#dealtypediv").dialog('close',true);
                    $("#dealtypedt").datagrid('reload');
                }
            })
        }

    </script>


<div data-options="region:'south'," style="height:715px;">
<table id="dealtypedt" class="easyui-datagrid"></table>

<div id="dealtypediv" style="width:400px;height:200px"></div>

<div class="dealtypeda" style="width:600px;height:300px">

    <div id="twodealtypedia" style="width:600px;height:300px"></div>

</div>
</div>


