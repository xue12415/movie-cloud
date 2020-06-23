<!DOCTYPE HTML>
<html>
<head>
    <title>Register</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Movie_store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <link href="css/style2.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<div class="container">
    <div class="container_wrap">

        <div class="content">
            <div class="register">
                <form id="userForm" action="/registers" method="get">
                    <div class="register-top-grid">
                        <h3>Personal Information</h3>
                        <div>
                            <span>Name<label>*</label></span>
                            <input type="text" name="name">
                        </div>
                        <div>
                            <span>Phone<label>*</label></span>
                            <input type="text" name="phone">
                        </div>
                        <div>
                            <span>Email Address<label>*</label></span>
                            <input type="text" name="mail">
                        </div>
                        <div class="clearfix"></div>
                        <a class="news-letter" href="#">
                            <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Sign Up
                                for Newsletter</label>
                        </a>
                    </div>
                    <div class="register-bottom-grid">
                        <h3>Login Information</h3>
                        <div>
                            <span>Password<label>*</label></span>
                            <input type="password" name="password" >
                        </div>
                        <div>
                            <span>Confirm Password<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </form>
                <div class="clearfix"></div>
                <div class="register-but" onclick="formSubmit()">
                    <form>
                        <input type="submit" value="submit">
                        <div class="clearfix"></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="jquery-1.10.2/jquery.js"></script>
<script type="application/javascript">
        function formSubmit() {
            $.ajax({
                type:"post",
                url:"/user/add",
                data:$("#userForm").serialize(),
                datatype:"json",
                success:function (data) {
                   alert(data.flag);
                   console.log(data.flag);
                   window.open("localhost");
                },
                error:function () {
                    alert("connect error.");
                }
            });
        }

</script>
</html>