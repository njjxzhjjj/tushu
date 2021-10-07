<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/6
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">

    <!-- 引入 layui.js -->
    <script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>


<form>
    <p>员工管理</p>
    员工编号：<input type="text" id="empnum"><br>
    员工姓名：<input type="text"id="empname"><br>
    员工性别：<input id="" type="radio" checked="checked" name="empsex" value="男"/>男<input id="empsex" type="radio" checked="checked" name="empsex" value="女"/>女<br>
    所属一级单位：<select id="deptname"></select><br>
    所属单位：<select id="deptnames"></select><br>
    <button type="button" id="subint">注册</button>


</form>

<script>

    $(function () {

        $.ajax({
            type: 'GET',
            url: "/api/unit/selectAll",
            // data: data,

            // dataType: dataType,
            success:function (data) {
                console.log(data);


                var book=$("#deptname")
                var options = '<option value ="0">请选择</option>';

                $(data.units).each(function () {
                    // console.log(this.deptname)
                    if (this.parentnum==0) {
                        options += '<option value="' + this.deptnum + '" >' + this.deptname + '</option>';}



                })

                book.append(options)


            }
        });

    })
    $("#deptname").click(function () {
        $("#deptnames").empty();

        $.ajax({
            type: 'GET',
            url: "/api/unit/selectAll",
            // data: data,

            // dataType: dataType,
            success:function (data) {
                console.log(data);
                var  ss=$("#deptname").val();
                var book=$("#deptnames")

                var options = '<option value ="0">请选择</option>';

                $(data.units).each(function () {
                    // console.log(this.deptname)
                    if (this.parentnum==ss) {
                        options += '<option value="' + this.deptnum + '" >' + this.deptname + '</option>';}



                })

                book.append(options)


            }
        });


    })

    $("#subint").click(function () {
        // [{"empsex":"男","deptnum":7,"empnum":1,"empname":"张三"}
        var empnum=$("#empnum").val();
        var empname=$("#empname").val();
        var deptnames=$("#deptnames").val();
        // var empsex=$(".empsex").val();
        var empsex=$('input:radio[name="empsex"]:checked').val();
        var staff={};
        staff.empnum=empnum;
        staff.empname=empname;
        staff.deptnum=deptnames;
        staff.empsex=empsex;


        console.log(staff);
        $.ajax({


            type : "post",
            url : "/api/staff/insert",//servlet
            contentType:"json",
            data: JSON.stringify(staff),//前台将要传递的数组封装成json格式

            // data:{"bookname":bookname,"province":province,"city":city,"author":author,"price":price},
            // data:{bookname:bookname,province:province,city:city,author:author,price:price},

            // traditional: true,
            contentType: "application/json;charset=UTF-8",

            success: function (ret) {

                console.log(ret)

                if (ret.code==200){

                    alert("添加成功")
                    location.reload(true)

                }else{

                    alert("添加失败")
                }

            }

        });


    })




</script>

</body>
</html>

