<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

<script>
    $(function () {
        $('#dealtypeupdatetwoff').form('load','${pageContext.request.contextPath}/dealtype/showOne?id=${param.id}');





    })
</script>
<form action="post" id="dealtypeupdatetwoff" >
    <input type="hidden" name="id" value="${param.id}">
    分类名称:<input type="text" class="easyui-textbox" name="name" data-options="iconCls:'icon-man'"><br/>
    <input type="hidden" name="flag" value="t">
</form>

