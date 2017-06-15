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
            $("#twodealtypedt").datagrid({
                url:'${pageContext.request.contextPath}/dealtype/showTwoDealtype?id=${param.id}',
                remoteSort:false,
                fitColumns:true,
                fit:true,
                striped:true,
                //method:'get',
                toolbar: [{
                    iconCls: 'icon-add',
                    handler: function(){
                        //添加的窗口
                        $("#twodealtypediv").dialog({
                            iconCls:'icon-save',
                            href:'${pageContext.request.contextPath}/back/dealtype/addtwodealtype.jsp',
                            title:"添加分类",
                            buttons:[{
                                text:'保存',
                                iconCls:'icon-save',
                                handler:addtwodealtype,
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
                onLoadSuccess:function () {
                    $(".del").linkbutton({
                        iconCls:"icon-remove",
                        plain:true
                    })
                    $(".edit").linkbutton({
                        iconCls:"icon-edit",
                        plain:true
                    })

                },/*"<a class='del' href='javascript:;' onclick=\"test9('"+row.twoid+"')\">删除</a>"+*/
                columns:[[
                    {title:'所属一级分类编号',field:'oid',width:200, sortable:true},
                    {title:'所属一级分类名称',field:'oname',width:200, sortable:true},
                    {title:'二级分类编号',field:'twoid',width:200, sortable:true},
                    {title:'二级分类名称',field:'twoname',width:200, sortable:true},
                    {title:'操作',field:'en',width:200, sortable:true,
                        formatter:function(value,row,index){
                            return "<a class='edit' onClick=\"test33('"+ row.twoid +"')\"  href='javascript:;'>修改</a>";
                        }
                    },

                ]]
            })

        })
        function test33(id) {
            $("#twodealtypeda").dialog({
                title:"修改信息",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/dealtype/updatetwo.jsp?id='+id,
                buttons:[{
                    text:'保存',
                    iconCls:'icon-save',
                    handler:saveTwoDealtype,

                },{
                    text:'关闭',
                    iconCls:'icon-cancel',
                    handler:closeda,
                }]
            })
        }
        function saveTwoDealtype() {
            $("#dealtypeupdatetwoff").form("submit",{
                url:'${pageContext.request.contextPath}/dealtype/update',
                success:function(){
                    $("#twodealtypeda").dialog('close',true);
                    $("#twodealtypedt").datagrid('reload');
                }
            })
        }
      /*  function test9(id) {
            $.messager.confirm("一个温馨的提示","你这个小白猪确定要删除么",function (r) {
                if(r){
                    $.post("/dealtype/delete",{id:id});
                    $("#twodealtypedt").datagrid('reload');
                }

            });
        }*/
        function addtwodealtype() {
            $('#twoaddff').form("submit",{
                url:"${pageContext.request.contextPath}/dealtype/add",
                success:function(){
                    $("#twodealtypediv").dialog('close',true);
                    $("#twodealtypedt").datagrid('reload');
                }
            })
        }
    </script>

<div data-options="region:'north'," style="height:50px;">

</div>

<div data-options="region:'south'," style="height:715px;">
<table id="twodealtypedt" class="easyui-datagrid"></table>
    <div id="twodealtypediv" style="width:600px;height:300px">
        <div id="twodealtypeda" style="width:600px;height:300px"></div>
</div>
</div>


