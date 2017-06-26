<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2017/5/31
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<script><%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

        $(function () {
            $("#lawerdt").datagrid({
                url:'${pageContext.request.contextPath}/lawer/show',
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
                        $("#lawerdiv").dialog({
                            width:800,
                            height:600,
                            iconCls:'icon-save',
                            href:'${pageContext.request.contextPath}/back/lawer/add.jsp',
                            title:"添加律师",
                            buttons:[{
                                text:'保存',
                                iconCls:'icon-save',
                                handler:addlawer,
                            },{
                                text:'关闭',
                                iconCls:'icon-cancel',
                                handler:closeda,
                            }]
                        })

                    }
                },'-' <shiro:hasPermission name="lawer:*">,
                    {
                    iconCls: 'icon-help',
                    handler: function(){alert('帮助按钮')}
                }
                    </shiro:hasPermission>
                ],
                onLoadSuccess:function () {
                    $(".lawerdel").linkbutton({
                        iconCls:"icon-remove",
                        plain:true
                    })
                    $(".laweredit").linkbutton({
                        iconCls:"icon-edit",
                        plain:true
                    })

                },
                columns:[[
                   {title:'照片',field:'22',width:115,sortable:true,
                        formatter:function(value,row,index){

                           return "<img  src=${pageContext.request.contextPath}/upload/"+row.photo+"></img>";
                        }
                    },
                    {title:'编号',field:'id',width:200, sortable:true},
                    {title:'姓名',field:'name',width:200,sortable:true},
                    {title:'姓名',field:'address',width:200, sortable:true},
                    {title:'律师号',field:'number',width:200, sortable:true},
                    {title:'律师事务所',field:'workspace',width:200, sortable:true},
                    <shiro:hasPermission name="lawer:*">
                    {title:'操作',field:'en',width:400,sortable:true,
                        formatter:function(value,row,index){
                            return "<a class='lawerdel' href='javascript:;' onclick=\"test50('"+row.id+"')\">删除</a>"+
                                    "<a class='laweredit' onClick=\"test40('"+ row.id +"')\"  href='javascript:;'>修改</a>"+
                                    "<a class='laweredit' onClick=\"test41('"+ row.id +"')\"  href='javascript:;'>红包记录</a>"+
                                    "<a class='laweredit' onClick=\"test42('"+ row.id +"')\"  href='javascript:;'>律师分类标签</a>"+
                                    "<a class='laweredit' onClick=\"test43('"+ row.id +"')\"  href='javascript:;'>律师评价</a>";
                        }
                    },
                    </shiro:hasPermission>
                ]]
            })

        })
        function test50(id) {
            $.messager.confirm("一个温馨的提示","你这个小白猪确定要删除么",function (r) {
                if(r){
                    $.post("${pageContext.request.contextPath}/lawer/delete",{id:id});
                    $("#lawerdt").datagrid('reload');
                }

            });
        }




        function test41(id){
            $("#redpackage").dialog({
                title:"红包记录",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/lawer/redpackage.jsp?id='+id,
            })
        }
        function test42(id){
            $("#lawerlawertype").dialog({
                title:"律师分类",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/lawer/lawerlawertype.jsp?id='+id,
            })
        }
        function test43(id){
            $("#lawercomment").dialog({
                title:"律师评价",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/lawer/lawercomment.jsp?id='+id,
            })
        }



        function test40(id) {
            $("#da").dialog({
                title:"修改信息",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/lawer/update.jsp?id='+id,
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
            $("#lawerupdateff").form("submit",{
                url:'${pageContext.request.contextPath}/lawer/update',
                success:function(){
                    $("#da").dialog('close',true);
                    $("#lawerdt").datagrid('reload');
                }
            })
        }
        function closeda() {
            $("#da").dialog('close',true);
        }
        function addlawer() {
            $('#laweraddff').form("submit",{
                url:"${pageContext.request.contextPath}/lawer/add",
                success:function(){
                    $("#lawerdiv").dialog('close',true);
                    $("#lawerdt").datagrid('reload');
                }
            })
        }

    </script>

<div data-options="region:'south'," style="height:715px;">
<table id="lawerdt" class="easyui-datagrid"></table>

<div id="lawerdiv" style="width:400px;height:200px"></div>

<div id="da" style="width:600px;height:300px">

    <div id="redpackage" style="width:600px;height:300px"></div>
    <div id="lawerlawertype" style="width:700px;height:500px"></div>
    <div id="lawercomment" style="width:700px;height:500px"></div>
</div>
</div>


