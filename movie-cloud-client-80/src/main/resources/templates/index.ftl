<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="">
    <meta name="author" content="">
	
    <title>Newspaper</title>
	<style type="text/css">
		html{overflow:hidden;}
	</style>
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
	
	<!-- Owl Carousel Assets -->
    <link href="owl-carousel/owl.carousel.css" rel="stylesheet">
    <link href="owl-carousel/owl.theme.css" rel="stylesheet">
	
	<!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
	 <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
	
	<!-- Custom Fonts -->
    <link rel="stylesheet" href="font-awesome-4.4.0/css/font-awesome.min.css"  type="text/css">
	
	<!-- jQuery and Modernizr-->
	<script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
	
	<!-- Core JavaScript Files -->  	 
    <script src="js/bootstrap.min.js"></script>
	
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
        <script src="http://apps.bdimg.com/libs/respond.js/1.4.2/respond.js"></script>
    <![endif]-->
</head>

<body>
<header>
	<!--Top-->
	<nav id="top">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<strong>Welcome to Us!</strong>
				</div>
				<div class="col-md-6">
					<ul class="list-inline top-link link">
						<li><a href="../../Desktop/index.html"><i class="fa fa-home"></i> Home</a></li>
						<li><a href="contact.ftl"><i class="fa fa-comments"></i> Contact</a></li>
						<li><a href="#"><i class="fa fa-question-circle"></i> FAQ</a></li>
					</ul>
				</div>
			</div>
		</div>
	</nav>
	
	<!--Navigation-->
    <nav id="menu" class="navbar container">
		<div class="navbar-header">
			<button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse"><i class="fa fa-bars"></i></button>
			<a class="navbar-brand" href="#">
				<div class="logo"><span>Newspaper</span></div>
			</a>
		</div>
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li><a href="../../Desktop/index.html">首页</a></li>


				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">类别<i class="fa fa-arrow-circle-o-down"></i></a>
					<div class="dropdown-menu" style="margin-left: -203.625px;">
						<div class="dropdown-inner">
							<ul class="list-unstyled">
								<li><a href="archive.ftl">喜剧</a></li>
								<li><a href="archive.ftl">爱情</a></li>
								<li><a href="archive.ftl">动作</a></li>
								<li><a href="archive.ftl">枪战</a></li>
								<li><a href="archive.ftl">犯罪</a></li>
							</ul>
							<ul class="list-unstyled">
								<li><a href="archive.ftl">惊悚</a></li>
								<li><a href="archive.ftl">恐怖</a></li>
								<li><a href="archive.ftl">悬疑</a></li>
								<li><a href="archive.ftl">动画</a></li>
								<li><a href="archive.ftl">家庭</a></li>
							</ul>
							<ul class="list-unstyled">
								<li><a href="archive.ftl">奇幻</a></li>
								<li><a href="archive.ftl">魔幻</a></li>
								<li><a href="archive.ftl">科幻</a></li>
								<li><a href="archive.ftl">战争</a></li>
								<li><a href="archive.ftl">青春</a></li>
							</ul>
						</div>
					</div>
				</li>
				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">下载<i class="fa fa-arrow-circle-o-down"></i></a>
					<div class="dropdown-menu">
						<div class="dropdown-inner">
							<ul class="list-unstyled">
								<li><a href="archive.ftl">Text 201</a></li>
								<li><a href="archive.ftl">Text 202</a></li>
								<li><a href="archive.ftl">Text 203</a></li>
								<li><a href="archive.ftl">Text 204</a></li>
								<li><a href="archive.ftl">Text 205</a></li>
							</ul>
						</div>
					</div>
				</li>
				<li><a href="archive.ftl"><i class="fa fa-cubes"></i> 类型名称</a></li>
				<li><a href="contact.ftl"><i class="fa fa-envelope"></i> Contact</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">用户 <i class="fa fa-arrow-circle-o-down"></i></a>
					<div class="dropdown-menu">
						<div class="dropdown-inner">
							<ul class="list-unstyled">
								<li><a href="/index?ifream=login">Login</a></li>
								<li><a href="register.ftl" target="_blank">Register</a></li>
							</ul>
						</div>
					</div>
				</li>
			</ul>
			<ul class="list-inline navbar-right top-social">
				<li><a href="#"><i class="fa fa-facebook"></i></a></li>
				<li><a href="#"><i class="fa fa-twitter"></i></a></li>
				<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
				<li><a href="#"><i class="fa fa-google-plus-square"></i></a></li>
				<li><a href="#"><i class="fa fa-youtube"></i></a></li>
			</ul>
		</div>
	</nav>
</header>

<div>

	<iframe class="myIframe" src="${ifreamSrc}" height="400" width="" name="${ifreamName}" frameborder="0"
			scrolling="auto"
	></iframe>


		<script type="text/javascript">
            $(function(){
                changeWH();
            });
            function changeWH(){
                $(".myIframe").height($(document).height());
                $(".myIframe").width($(document).width());
            }
            window.onresize=function(){
                changeWH();
            }
		</script>


</div>
</body>
</html>
