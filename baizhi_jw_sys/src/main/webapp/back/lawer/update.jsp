<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

<script>
    $(function () {
        $('#lawerupdateff').form('load','${pageContext.request.contextPath}/lawer/showOne?id=${param.id}');
        var $upcc;
        $(function () {
            $upcc=$("#upcc");
            $upcc.combobox({
                required:true,
                multiple:true,
                url:"${pageContext.request.contextPath}/lawertype/check",
                valueField: 'id',
                textField: 'name',
                limitToList:true,
            })
        })




    })
</script>
<form action="post" id="lawerupdateff" >
    <input type="hidden" name="id" value="${param.id}">
    姓名:<input type="text" class="easyui-textbox" name="name" data-options="iconCls:'icon-man'"><br/>
    地址:<input type="text" class="easyui-textbox" name="address" data-options="iconCls:'icon-man'"><br/>
    从业年限:<input type="text" class="easyui-textbox" name="year" data-options="iconCls:'icon-man'"><br/>
    律师号:<input type="text" class="easyui-textbox" name="number" data-options="iconCls:'icon-man'"><br/>
    所在律师事务所:<input type="text" class="easyui-textbox" name="workspace" data-options="iconCls:'icon-man'"><br/>
    简介:<input type="text" class="easyui-textbox" name="description" data-options="iconCls:'icon-man'"><br/>
    问题咨询价格:<input type="text" class="easyui-textbox" name="wordprice" data-options="iconCls:'icon-man'"><br/>
    电话咨询价格:<input type="text" class="easyui-textbox" name="phoneprice" data-options="iconCls:'icon-man'"><br/>
    照片:<input type="text" class="easyui-textbox" name="photo" data-options="iconCls:'icon-man'"><br/>
    电话:<input type="text" class="easyui-textbox" name="phone" data-options="iconCls:'icon-man'"><br/>
    请选择律师类别: <input id="upcc" name="lawertypeid">
</form>

