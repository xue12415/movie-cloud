﻿<!DOCTYPE HTML>
<html>
<head>
    <title>Movie</title>
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
    <script src="jquery-1.10.2/jquery.js"></script>
</head>
<body>
<div class="container">
    <div class="container_wrap">

        <div class="content">
            <h2 class="m_3">推荐电影</h2>
            <div class="movie_top">
                <div class="col-md-9 movie_box">
                    <!-- Movie variant with time -->
                    <div class="movie movie-test movie-test-dark movie-test-left">
                        <div class="movie__images">
                            <a href="single.ftl" class="movie-beta__link">
                                <img alt="" src="images/1.jpg" class="img-responsive" alt=""/>
                            </a>
                        </div>
                        <div class="movie__info">
                            <a href="single.ftl" class="movie__title">Ipsum (2015) </a>
                            <p class="movie__time">80 min</p>
                            <p class="movie__option"><a href="single.ftl">Contray</a> | <a href="single.ftl">Dolor
                                sit</a> | <a href="single.ftl">Drama</a></p>
                            <ul class="list_6">
                                <li><i class="icon1"> </i>
                                    <p>2,548</p></li>
                                <li><i class="icon3"> </i>
                                    <p>546</p></li>
                                <li>Rating : &nbsp;&nbsp;<p><img src="images/rating1.png" alt=""></p></li>
                                <div class="clearfix"></div>
                            </ul>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <!-- Movie variant with time -->

                    <div class="clearfix"></div>
                    <!-- Movie variant with time -->
                </div>
                <div class="col-md-3">
                    <div class="movie_img">
                        <a href="#">
                            <div class="grid_2">
                                <img src="images/pic6.jpg" class="img-responsive" alt="">
                                <div class="caption1">
                                    <ul class="list_5 list_7">
                                        <li><i class="icon5"> </i>
                                            <p>3,548</p></li>
                                    </ul>
                                    <i class="icon4 icon6 icon7"> </i>
                                    <p class="m_3">Guardians of the Galaxy</p>
                                </div>
                            </div>
                        </a>
                        <a href="#">
                            <div class="grid_2 col_1">
                                <img src="images/pic2.jpg" class="img-responsive" alt="">
                                <div class="caption1">
                                    <ul class="list_3 list_7">
                                        <li><i class="icon5"> </i>
                                            <p>3,548</p></li>
                                    </ul>
                                    <i class="icon4 icon7"> </i>
                                    <p class="m_3">Guardians of the Galaxy</p>
                                </div>
                            </div>
                        </a>
                        <a href="#">
                            <div class="grid_2 col_1">
                                <img src="images/pic9.jpg" class="img-responsive" alt="">
                                <div class="caption1">
                                    <ul class="list_3 list_7">
                                        <li><i class="icon5"> </i>
                                            <p>3,548</p></li>
                                    </ul>
                                    <i class="icon4 icon7"> </i>
                                    <p class="m_3">Guardians of the Galaxy</p>
                                </div>
                            </div>
                        </a>
                    </div>

                </div>
                <div class="clearfix"></div>
            </div>
            <h1 class="recent">观看历史</h1>
            <ul id="Demo">
                <li><img src="images/1.jpg" class="img-responsive"/>
                    <div class="grid-flex"><a href="#">Syenergy 2mm</a>
                        <p>22.10.2014 | 14:40</p></div>
                </li>
                <li><img src="images/2.jpg" class="img-responsive"/>
                    <div class="grid-flex"><a href="#">Surf Yoke</a>
                        <p>22.01.2015 | 14:40</p></div>
                </li>
                <li><img src="images/3.jpg" class="img-responsive"/>
                    <div class="grid-flex"><a href="#">Salty Daiz</a>
                        <p>22.10.2013 | 14:40</p></div>
                </li>
                <li><img src="images/4.jpg" class="img-responsive"/>
                    <div class="grid-flex"><a href="#">Cheeky Zane</a>
                        <p>22.10.2014 | 14:40</p></div>
                </li>
                <li><img src="images/5.jpg" class="img-responsive"/>
                    <div class="grid-flex"><a href="#">Synergy</a>
                        <p>22.10.2013 | 14:40</p></div>
                </li>
            </ul>
            <script type="text/javascript">
                $(window).load(function () {
                    $("#Demo").flexisel({
                        visibleItems: 4,
                        animationSpeed: 1000,
                        autoPlay: true,
                        autoPlaySpeed: 3000,
                        pauseOnHover: true,
                        enableResponsiveBreakpoints: true,
                        responsiveBreakpoints: {
                            portrait: {
                                changePoint: 480,
                                visibleItems: 1
                            },
                            landscape: {
                                changePoint: 640,
                                visibleItems: 2
                            },
                            tablet: {
                                changePoint: 768,
                                visibleItems: 3
                            }
                        }
                    });

                });
            </script>
            <script type="text/javascript" src="js/jquery.flexisel.js"></script>

        </div>
    </div>
</div>
</body>
</html>