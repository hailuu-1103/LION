<%-- 
    Document   : footer
    Created on : Jun 8, 2021, 8:21:27 PM
    Author     : laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
        <style>
            .site-footer
            {
                background-color:#26272b;
                padding:45px 0 20px;
                font-size:15px;
                line-height:24px;
                color:#737373;
            }
            .site-footer hr
            {
                border-top-color:#bbb;
                opacity:0.5
            }
            .site-footer hr.small
            {
                margin:20px 0
            }
            .site-footer h6
            {
                color:#fff;
                font-size:16px;
                text-transform:uppercase;
                margin-top:5px;
                letter-spacing:2px
            }
            .site-footer a
            {
                color:#737373;
            }
            .site-footer a:hover
            {
                color:#3366cc;
                text-decoration:none;
            }
            .footer-links
            {
                padding-left:0;
                list-style:none
            }
            .footer-links li
            {
                display:block
            }
            .footer-links a
            {
                color:#737373
            }
            .footer-links a:active,.footer-links a:focus,.footer-links a:hover
            {
                color:#3366cc;
                text-decoration:none;
            }
            .footer-links.inline li
            {
                display:inline-block
            }
            .site-footer .social-icons
            {
                text-align:right
            }
            .site-footer .social-icons a
            {
                width:40px;
                height:40px;
                line-height:40px;
                margin-left:6px;
                margin-right:0;
                border-radius:100%;
                background-color:#33353d
            }
            .copyright-text
            {
                margin:0
            }
            @media (max-width:991px)
            {
                .site-footer [class^=col-]
                {
                    margin-bottom:30px
                }
            }
            @media (max-width:767px)
            {
                .site-footer
                {
                    padding-bottom:0
                }
                .site-footer .copyright-text,.site-footer .social-icons
                {
                    text-align:center
                }
            }
            .social-icons
            {
                padding-left:0;
                margin-bottom:0;
                list-style:none
            }
            .social-icons li
            {
                display:inline-block;
                margin-bottom:4px
            }
            .social-icons li.title
            {
                margin-right:15px;
                text-transform:uppercase;
                color:#96a2b2;
                font-weight:700;
                font-size:13px
            }
            .social-icons a{
                background-color:#eceeef;
                color:#818a91;
                font-size:16px;
                display:inline-block;
                line-height:44px;
                width:44px;
                height:44px;
                text-align:center;
                margin-right:8px;
                border-radius:100%;
                -webkit-transition:all .2s linear;
                -o-transition:all .2s linear;
                transition:all .2s linear
            }
            .social-icons a:active,.social-icons a:focus,.social-icons a:hover
            {
                color:#fff;
                background-color:#29aafe
            }
            .social-icons.size-sm a
            {
                line-height:34px;
                height:34px;
                width:34px;
                font-size:14px
            }
            .social-icons a.facebook:hover
            {
                background-color:#3b5998
            }
            .social-icons a.twitter:hover
            {
                background-color:#00aced
            }
            .social-icons a.linkedin:hover
            {
                background-color:#007bb6
            }
            .social-icons a.dribbble:hover
            {
                background-color:#ea4c89
            }
            @media (max-width:767px)
            {
                .social-icons li.title
                {
                    display:block;
                    margin-right:0;
                    font-weight:600
                }
            }
        </style>
    </head>
    <body>
        <!-- Site footer -->
        <footer class="site-footer">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 col-md-6">
                        <h6>Giới thiệu</h6>
                        <p class="text-justify">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt 
                            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco 
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in 
                            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non 
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                    </div>

                    <div class="col-xs-6 col-md-3">
                        <h6>Mặt hàng</h6>
                        <ul class="footer-links">
                            <li><a href="http://scanfcode.com/category/c-language/">Áo đấu Premier League</a></li>
                            <li><a href="http://scanfcode.com/category/front-end-development/">Áo đấu La Liga</a></li>
                            <li><a href="http://scanfcode.com/category/back-end-development/">Áo đấu Series A</a></li>
                            <li><a href="http://scanfcode.com/category/java-programming-language/">Áo đấu Bundesliga</a></li>
                            <li><a href="http://scanfcode.com/category/android/">Áo đấu Ligue 1</a></li>
                        </ul>
                    </div>

                    <div class="col-xs-6 col-md-3">
                        <h6>Nhà phân phối</h6>
                        <ul class="footer-links">
                            <li><a href="http://scanfcode.com/about/">Nike</a></li>
                            <li><a href="http://scanfcode.com/contact/">Adidas</a></li>
                            <li><a href="http://scanfcode.com/contribute-at-scanfcode/">Puma</a></li>
                            <li><a href="http://scanfcode.com/privacy-policy/">Kappa</a></li>
                        </ul>
                    </div>
                </div>
                <hr>
            </div>
            <div class="container">
                <div class="row">

                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <ul class="social-icons" style="float: left">
                            <li><a class="facebook" href="https://www.facebook.com/PES" target="_blank"><i class="fab fa-facebook-f"></i></a></li>
                            <li><a class="twitter" href="https://twitter.com/officialpes" target="_blank"><i class="fab fa-twitter"></i></a></li>
                            <li><a class="instagram" href="https://www.instagram.com/officialpes/" target="_blank"><i class="fab fa-instagram"></i></a></li>
                            <li><a class="youtube" href="https://www.youtube.com/user/officialpes" target="_blank"><i class="fab fa-youtube"></i></a></li>   
                        </ul>
                    </div>

                </div>
            </div>
        </footer>
    </body>
</html>
