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
            $("#dt").datagrid({
                url:'${pageContext.request.contextPath}/lawertype/show',
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
                        $("#div").dialog({
                            iconCls:'icon-save',
                            href:'${pageContext.request.contextPath}/back/lawertype/add.jsp',
                            title:"添加分类",
                            buttons:[{
                                text:'保存',
                                iconCls:'icon-save',
                                handler:addlawertype,
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
                    {title:'名称',field:'name',width:200, sortable:true},
                    {title:'操作',field:'en',width:200, sortable:true,
                        formatter:function(value,row,index){
                            return "<a class='del' href='javascript:;' onclick=\"test1('"+row.id+"')\">删除</a>"+
                                    "<a class='edit' onClick=\"test2('"+ row.id +"')\"  href='javascript:;'>修改</a>";
                        }
                    },
                ]]
            })

        })
        function test1(id) {
            $.messager.confirm("一个温馨的提示","你这个小白猪确定要删除么",function (r) {
                if(r){
                    $.post("${pageContext.request.contextPath}/lawertype/delete",{id:id});
                    $("#dt").datagrid('reload');
                }

            });
        }

        function test2(id) {
            $("#da").dialog({
                title:"修改信息",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/lawertype/update.jsp?id='+id,
                buttons:[{
                    text:'保存',
                    iconCls:'icon-save',
                    handler:saveEmp,

                },{
                    text:'关闭',
                    iconCls:'icon-cancel',
                    handler:closeda,
                }]
            })
        }

        function saveEmp() {
            $("#updateff").form("submit",{
                url:'${pageContext.request.contextPath}/lawertype/update',
                success:function(){
                    $("#da").dialog('close',true);
                    $("#dt").datagrid('reload');
                }
            })
        }
        function closeda() {
            $("#da").dialog('close',true);
        }
        function addlawertype() {
            $('#addff').form("submit",{
                url:"${pageContext.request.contextPath}/lawertype/add",
                success:function(){
                    $("#div").dialog('close',true);
                    $("#dt").datagrid('reload');
                }
            })
        }

    </script>


<div data-options="region:'south'," style="height:715px;">
<table id="dt" class="easyui-datagrid"></table>

<div id="div" style="width:400px;height:200px"></div>

<div id="da" style="width:600px;height:300px">

</div>
</div>


