<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

<script>
    $(function () {
        $('#updateff').form('load','${pageContext.request.contextPath}/lawertype/showOne?id=${param.id}');





    })
</script>
<form action="post" id="updateff" >
    <input type="hidden" name="id" value="${param.id}">
    分类名称:<input type="text" class="easyui-textbox" name="name" data-options="iconCls:'icon-man'"><br/>
</form>

