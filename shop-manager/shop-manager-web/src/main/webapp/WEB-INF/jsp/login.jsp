<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<link rel="stylesheet" href="js/bootstrap/css/bootstrap.css"/>
<link rel="stylesheet" href="css/loginStyle.css"/>
<script src="js/bootstrap/js/bootstrap.js"></script>
<script src="js/jquery/jquery1.8.3.js"></script>
<script type="text/javascript">
    $(function () {
        $("#myform").submit(function (e) {
            var uname = $("#uname").val();
            var upwd = $("#upwd").val();
            var param = {"username": uname, "password": upwd};
            //阻止表单提交
            e.preventDefault();
            //Ajax提交表单
            $.ajax({
                url: "login",
                data: param,
                dataType: "text",
                type: "post",
                cache: false,
                async: true,
                success: function (message) {
                    if (message == "0") {
                        $("#uname").prop("placeholder", "用户名不能为空");
                    } else if (message == "1") {
                        $("#uname").val("");
                        $("#uname").prop("placeholder", "密码不能为空");
                    } else if (message == "2") {
                        $("#uname").val("");
                        $("#uname").prop("placeholder", "用户名密码错误");
                    } else {
                        location.href = "goIndex";
                    }
                },
                error: function () {
                    alert("服务器端出现了未知错误!!");
                }
            });
        });
    });
</script>
<body>
<form method="post" action="#" id="myform">
    <div class="mycenter">
        <div class="mysign">
            <div class="col-lg-11 text-center text-info">
                <h2>请登录</h2>
            </div>
            <div class="col-lg-10">
                <input type="text" class="form-control" id="uname" name="username" placeholder="请输入账户名" required autofocus/>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="password" class="form-control" id="upwd" name="password" placeholder="请输入密码" required autofocus/>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10 mycheckbox checkbox">
                <input type="checkbox" class="col-lg-1">记住密码</input>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="submit" class="btn btn-success col-lg-12" value="登录">
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="button" onclick="location.href='goRegister'" class="btn btn-success col-lg-12" value="注册">
            </div>
            <div class="col-lg-11 text-center text-info">
                <h3 style="color: red">${registerSuccessMessage}</h3>
            </div>
        </div>
    </div>
</form>
</body>
</html>
