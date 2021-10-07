<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/6
  Time: 16:38
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

<p>图书信息录入</p>
<iframe width="0" height="0" name="actionframe"></iframe>
<form  target="actionframe">
    图书名： <input type="text" id="bookname"><br>
    出版社所在地：省份 <select id="book">

</select>
    <select id="address"></select><br>
    作者：<input type="text" id="author"><br>
    零售价：<input type="text" id="price"><br>
    <%--<input type="submit" value="提交" id="formDemo"><br>--%>

    <button type="button" id="submit">提交</button>
</form>




<table id="demo" lay-filter="test"></table>

<%--<script src="/layui/layui.js"></script>--%>
<script>
    // layui.use('form', 'table', function(){
    layui.use( 'table', function(){
        var table = layui.table;

        // var form = layui.form;


        // form.render(test1,test2);

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/api/shop/selectAll' //数据接口
            ,parseData: function(res){ //res 即为原始返回的数据
                return {
                    "code": res.code, //解析接口状态
                    "msg": res.msg, //解析提示文本
                    "count": res.total, //解析数据长度
                    "data": res.shops //解析数据列表
                };
            }
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'bid', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'bookname', title: '书名', width:160}
                ,{field: 'province', title: '省份编号', width:80, sort: true}
                ,{field: 'city', title: '城市', width:80}
                ,{field: 'author', title: '作者', width: 177}
                ,{field: 'price', title: '价格', width: 80, sort: true}

            ]]
        });

    });
</script>

<script>


    $(function () {

        $.ajax({
            type: 'GET',
            url: "/api/book/selectAll",
            // data: data,

            // dataType: dataType,
            success:function (data) {
                console.log(data);
                var  list=data.books.bname;
                var book=$("#book")
                var options = '<option value ="0">请选择</option>';

                $(data.books).each(function () {
                    console.log(this.bname)
                    options += '<option value="' + this.bid + '" >' + this.bname + '</option>';


                })

                book.append(options)


            }
        });






    })



    $("#book").click(function () {
        $("#address").empty();

        var options=null;
        var  books=$("#address")
        $.ajax({
            type: 'GET',
            url: "/api/address/selectAll",
            // data: data,

            // dataType: dataType,
            success:function (data) {
                console.log(data);


                options = '<option value ="0">请选择</option>';
                var  book=$("#book").val();
                console.log(book)


                $(data.addresss).each(function () {
                    if (book==this.parentid) {

                        console.log(this.addressname)
                        options += '<option value="' + this.parentid + '" >' + this.addressname + '</option>';
                    }



                })

                books.append(options)








            }
        });

    })
    $('#submit').on('submit', function (event) {
        event.preventDefault();
    });

    $("#submit").click(function () {
        // console.log("zhefdvgh")
        // {"msg":"查询成功","code":0,"shops":[{"bid":1,"bookname":"十万个为什么","province":"1","city":"濮阳","author":"小慧","price":34.12}]}

        var bookname=$("#bookname").val();
        console.log(bookname)
        var province=$("#book").val();
        console.log(province)
        // var city=$("#address").value();
        var city= $(" #address option:checked").text()
        console.log(city)
        var author=$("#author").val();
        console.log(author)
        var price=$("#price").val();
        console.log(price)

        var shop={};
        shop.bookname=bookname;
        shop.province=province;
        shop.city=city;
        shop.author=author;
        shop.price=price;

        console.log(shop)

        $.ajax({


            type : "post",
            url : "/api/shop/insert",//servlet
            contentType:"json",
            data: JSON.stringify(shop),//前台将要传递的数组封装成json格式

            // data:{"bookname":bookname,"province":province,"city":city,"author":author,"price":price},
            // data:{bookname:bookname,province:province,city:city,author:author,price:price},

            // traditional: true,
            contentType: "application/json",

            success: function (ret) {

                console.log(ret)

                if (ret.code==200){

                    alert("添加成功")
                    layui.use( 'table', function(){
                        var table = layui.table;

                        // var form = layui.form;


                        // form.render(test1,test2);

                        //第一个实例
                        table.render({
                            elem: '#demo'
                            ,height: 312
                            ,url: '/api/shop/selectAll' //数据接口
                            ,parseData: function(res){ //res 即为原始返回的数据
                                return {
                                    "code": res.code, //解析接口状态
                                    "msg": res.msg, //解析提示文本
                                    "count": res.total, //解析数据长度
                                    "data": res.shops //解析数据列表
                                };
                            }
                            ,page: true //开启分页
                            ,cols: [[ //表头
                                {field: 'bid', title: 'ID', width:80, sort: true, fixed: 'left'}
                                ,{field: 'bookname', title: '书名', width:160}
                                ,{field: 'province', title: '省份编号', width:80, sort: true}
                                ,{field: 'city', title: '城市', width:80}
                                ,{field: 'author', title: '作者', width: 177}
                                ,{field: 'price', title: '价格', width: 80, sort: true}

                            ]]
                        });

                    });
                } else{

                    alert("添加失败")
                    layui.use( 'table', function(){
                        var table = layui.table;

                        // var form = layui.form;


                        // form.render(test1,test2);

                        //第一个实例
                        table.render({
                            elem: '#demo'
                            ,height: 312
                            ,url: '/api/shop/selectAll' //数据接口
                            ,parseData: function(res){ //res 即为原始返回的数据
                                return {
                                    "code": res.code, //解析接口状态
                                    "msg": res.msg, //解析提示文本
                                    "count": res.total, //解析数据长度
                                    "data": res.shops //解析数据列表
                                };
                            }
                            ,page: true //开启分页
                            ,cols: [[ //表头
                                {field: 'bid', title: 'ID', width:80, sort: true, fixed: 'left'}
                                ,{field: 'bookname', title: '书名', width:160}
                                ,{field: 'province', title: '省份编号', width:80, sort: true}
                                ,{field: 'city', title: '城市', width:80}
                                ,{field: 'author', title: '作者', width: 177}
                                ,{field: 'price', title: '价格', width: 80, sort: true}

                            ]]
                        });

                    });
                }
            }

        });



    })


</script>





</body>
</html>
