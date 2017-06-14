<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2017/5/31
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

    <script>
        var $cc;
    $(function () {
        $cc=$("#cc");
        $cc.combobox({
            required:true,
            multiple:true,
            url:"${pageContext.request.contextPath}/lawertype/check",
            valueField: 'id',
            textField: 'name',
            limitToList:true,
        })
    })


    </script>
<form method="post" id="laweraddff" >
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
   请选择律师类别: <input id="cc" name="lawertypeid">
</form>

