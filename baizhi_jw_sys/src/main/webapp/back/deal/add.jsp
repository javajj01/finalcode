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
       $("#adddate").datebox({
            formatter:$.fn.datebox.defaults.formatter = function(date){
                var y = date.getFullYear();
                var m = date.getMonth()+1;
                var d = date.getDate();
                return y+'/'+(m<10?('0'+m):m)+'/'+(d<10?('0'+d):d);
            },
            parser:$.fn.datebox.defaults.parser = function(s){
                if (!s) return new Date();
                var ss = s.split('/');
                var y = parseInt(ss[0],10);
                var m = parseInt(ss[1],10);
                var d = parseInt(ss[2],10);
                if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
                    return new Date(y,m-1,d);
                } else {
                    return new Date();
                }
            },

        })
        $otype=$("#otype");

        $otype.combobox({
            required:true,
            url:"${pageContext.request.contextPath}/dealtype/showOneDealtype",
            valueField: 'id',
            textField: 'name',
            limitToList:true,
            onSelect:function (rec) {
                $('#ttype').combobox('clear');
                var url="${pageContext.request.contextPath}/dealtype/showTwo?id="+rec.id;
                $('#ttype').combobox('reload',url);

            }
        })
    })


    </script>
<form method="post" id="dealaddff" >
    标题:<input type="text" class="easyui-textbox" name="title" data-options="iconCls:'icon-man'"><br/>
    内容:<input type="text" class="easyui-textbox" name="content" data-options="iconCls:'icon-man'"><br/>
    日期:<input  id="adddate"  type= "text" name="createtime" class= "easyui-datebox" required ="required"><br/>

    请选择案例一级类别: <input id="otype">
    请选择案例二类别: <input id="ttype" name="dealtypeid" class="easyui-combobox" data-options="valueField:'id',textField:'name'" >
</form>

