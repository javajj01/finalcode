<%--
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2017/5/31
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

<script>

    $(function () {
        $ccc=$(".ccc");
        $ccc.combobox({
            required:true,
            url:"${pageContext.request.contextPath}/dealtype/showOneDealtype",
            valueField: 'id',
            textField: 'name',
            limitToList:true,
        })
    })


</script>
<form method="post" id="twoaddff" >
    名称:<input type="text" class="easyui-textbox" name="name" data-options="iconCls:'icon-man'"><br/>
    <input type="hidden" name="flag" value="t">
    请选择案例类别: <input class="ccc" name="dealtype.id">
</form>


