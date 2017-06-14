<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

<script>
    $(function () {
        $('#updateff').form('load','${pageContext.request.contextPath}/student/selectOne?id=${param.id}');





    })
</script>
<form action="post" id="updateff" >
    <input type="hidden" name="id" value="${param.id}">
    学生姓名:<input type="text"  name="name" class="easyui-textbox" data-options="iconCls:'icon-man'"><br/>
    年龄:<input type="text" name="age" class="easyui-textbox" data-options="iconCls:'icon-man'"><br/>
    生日:<input type="text" name="bir" id="updatedate" class="easyui-datebox" data-options="required:'required'"><br/>
</form>

