<%-- 
    Document   : home
    Created on : Jun 6, 2021, 6:46:14 PM
    Author     : laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="js/mycode.js"></script>
        <title>Trang chủ</title>
        <style>

            #category img {
                -webkit-filter: grayscale(100%);
                filter: grayscale(100%);
                -webkit-transition: .8s ease-in-out;
                transition: .8s ease-in-out;
                width: 10em;
                height: 10em;
            }
            #category:hover img {
                -webkit-filter: grayscale(0);
                filter: grayscale(0);
            }

            /*            #topsale, #newest{
                            border: solid black;
                            margin: 10px;
                        }*/

            #topsale .img-responsive, #latest .img-responsive{
                width: 120px;
                height: 150px;
            }

        </style>
    </head>

    <body>

        <%@include file="footer_header/header.jsp" %>

        <div class="main">
            <div class="container-fluid">
                <div class="row m-3 h-75">
                    <div style="margin: 0 auto;" class="col-sm-11">
                        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
                            </ol>
                            <div class="carousel-inner">

                                <div class="carousel-item active">
                                    <img src="image/EPL-carousel.png" class="d-block w-100" alt="...">
                                </div>

                                <div class="carousel-item">
                                    <img src="image/LaLiga-carousel.jpg" class="d-block w-100" alt="...">
                                </div>

                                <div class="carousel-item">
                                    <img src="image/SeriesA-carousel.jpg" class="d-block w-100" alt="...">
                                </div>

                                <div class="carousel-item">
                                    <img src="image/Bundesliga-carousel.jpg" class="d-block w-100" alt="...">
                                </div>

                                <div class="carousel-item">
                                    <img src="image/Ligue1-carousel.jpg" class="d-block w-100" alt="...">
                                </div>

                            </div>
                            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                                <span class="carousel-control-prev-icon bg-dark" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                                <span class="carousel-control-next-icon bg-dark" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="row m-3 d-flex justify-content-center d-none .d-lg-flex d-xl-flex">
                    <h2 class="text-center m-2">League</h2>

                    <div class="col-sm-2 justify-content-center m-2" id="category">
                        <a href="https://www.premierleague.com" target="_blank">
                            <img src="image/EPL-logo.jpg">
                        </a>
                    </div>

                    <div class="col-sm-2 justify-content-center m-2" id="category">
                        <a href="https://www.laliga.com/en-GB" target="_blank">
                            <img src="image/LaLiga-logo.jpg">
                        </a>
                    </div>

                    <div class="col-sm-2 justify-content-center m-2" id="category">
                        <a href="https://www.laliga.com/en-GB" target="_blank">
                            <img src="image/SeriesA-logo.jpg">
                        </a>
                    </div>

                    <div class="col-sm-2 justify-content-center m-2" id="category">
                        <a href="https://www.bundesliga.com/en/bundesliga" target="_blank">
                            <img src="image/Bundesliga-logo.jpg">
                        </a>
                    </div>

                    <div class="col-sm-2 justify-content-center m-2" id="category">
                        <a href="https://www.ligue1.com" target="_blank">
                            <img src="image/Ligue1-logo.jpg">
                        </a>
                    </div>

                </div>

                <div class="row m-4">
                    <button type="button" class="btn btn-info col-5 col-md-3 mx-auto mb-2" data-toggle="collapse" data-target="#demo">Chuyện Áo Đấu</button>
                    <div id="demo" class="collapse m-2">
                        <div class="bg-primary text-white text-justify col-11 mx-auto" style="padding: 10px; border: ridge 2px; font-family: cursive sans-serif;">
                            Áo đấu, một phần không thể thiếu trong những trận bóng đá, là cả một thế giới rộng lớn đầy màu sắc và có sức sống riêng. <br> Từ những câu chuyện về chiếc áo Newell’s Old Boys của Maradona mặc vào năm 1993 đến phiên bản 2020 mà
                            Lionel Messi khoác lên mình khi ghi bàn vào lưới Osasuna, hay chuyện về bộ áo đấu “Viva Uruguay” có một không hai của Bolivia ở kì World Cup đầu tiên, rồi cả chiếc áo bóng rổ mà tuyển Cameroon sử dụng tại World Cup 2002,... tất
                            cả đều thú vị và hết sức li kì.<br> Chúng tôi mong muốn khai thác sâu hơn về những chiếc áo đấu, mang đến cho khách hàng một góc nhìn khác về bóng đá, để từ đó hiểu và thêm yêu môn thể thao vua.<br>
                            <h4>Hope you enjoy</h4>
                        </div>
                    </div>
                </div>

                <div class="content m-1">
                    <div class="row m-1">
                        <div class="col-md-12 text-center">
                            <h2><mark>Áo đấu giá rẻ</mark></h2>
                        </div>
                    </div>
                    <div class="row d-flex justify-content-center">

                        <c:forEach items="${requestScope.cheap}" var="ch">

                            <div id="topsale" class=" border border-info col-5 col-md-4 col-lg-2 text-center m-3 pt-3">
                                <div class="grid">
                                    <div class="portfolio app mix_all" data-cat="app" style="display: inline-block; opacity: 1;">
                                        <div class="portfolio-wrapper">
                                            <a data-toggle="modal" data-target=".bs-example-modal-md" href="#" class="b-link-stripe b-animate-go  thickbox">
                                                <img class="img-responsive" src="${ch.img}" />
                                                <div class="b-wrapper">
                                                    <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <p class="text-center">${ch.kitName}</p>
                                    <div class="text-center text-danger"><h3>$${ch.price}</h3></div>
                                    <a href="detail?kit=${ch.kitID}"><button class="btn btn-light m-2"><i class="fas fa-cart-plus"></i></button></a>
                                </div>
                            </div>

                        </c:forEach>

                        <div class="clearfix"></div>
                    </div>


                    <div class="row m-5">
                        <div class="col-md-12 text-center">
                            <h2><mark>Sản phẩm mới</mark></h2>
                        </div>
                    </div>

                    <div class="row d-flex justify-content-center">

                        <c:forEach items="${requestScope.latest}" var="l">

                            <div id="latest" class="border border-info col-5 col-md-4 col-lg-2 text-center m-3 pt-3">
                                <div class="grid">
                                    <div class="portfolio app mix_all" data-cat="app" style="display: inline-block; opacity: 1;">
                                        <div class="portfolio-wrapper">
                                            <a data-toggle="modal" data-target=".bs-example-modal-md" href="#" class="b-link-stripe b-animate-go  thickbox">
                                                <img class="img-responsive" src="${l.img}" />
                                                <div class="b-wrapper">
                                                    <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <p class="text-center">${l.kitName}</p>
                                    <div class="text-center text-danger"><h3>$<fmt:formatNumber type="number" maxFractionDigits="2" value="${l.price}"/></h3></div>
                                    <a href="detail?kit=${l.kitID}"><button class="btn btn-light m-2"><i class="fas fa-cart-plus"></i></button></a>
                                </div>
                            </div>

                        </c:forEach>

                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        <%@include file="footer_header/footer.jsp" %>

    </body>

</html>
