<%-- 
    Document   : header
    Created on : Jun 8, 2021, 8:24:46 PM
    Author     : laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            header{
                position: -webkit-sticky;
                position: sticky;
                top: 0;
                z-index: 100    ;
            }

        </style>
    </head>
    <body>
        <header>
            <div class="container-fluid">
                <div class="row bg-dark pt-2 pb-2 pl-1 pr-1">
                    <div class="col-sm-12">
                        <nav class="navbar navbar-expand-sm navbar-dark">
                            <a class="navbar-brand" href="home"><h4>sport<span style="color: yellow">KITS</span></h4></a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                                <ul class="navbar-nav ">
                                    <li class="nav-item">
                                        <a class="nav-link text-light" href="home"><i class="fas fa-home"></i><span class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link text-light" href="catalog?league=*&page=1"><i class="fas fa-tshirt"></i></a>
                                    </li>
                                    <!--                                    <li class="nav-item dropdown">
                                                                            <a class="nav-link dropdown-toggle text-light" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                                                <i class="fas fa-tshirt"></i>
                                                                            </a>
                                                                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                                                                <a class="dropdown-item" href="catalog?league=*&page=1">Tất cả</a>
                                                                                <a class="dropdown-item" href="catalog?league=Premier+League&page=1">Áo đấu Premier League</a>
                                                                                <a class="dropdown-item" href="catalog?league=La+Liga&page=1">Áo đấu La Liga</a>
                                                                                <a class="dropdown-item" href="catalog?league=Series+A&page=1">Áo đấu Series A</a>
                                                                                <a class="dropdown-item" href="catalog?league=Bundesliga&page=1">Áo đấu Bundesliga</a>
                                                                                <a class="dropdown-item" href="catalog?league=Ligue+1&page=1">Áo đấu Ligue 1</a>
                                                                            </div>
                                                                        </li>-->
                                    <c:if test="${sessionScope.account!=null}" >    
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="account"><i class="fas fa-user-circle"></i></a>
                                        </li>
                                    </c:if>
                                    <c:if test="${sessionScope.account.role == 'admin'}">
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="crud"><i class="fas fa-plus-circle"></i></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="morder"><i class="fas fa-shopping-bag"></i></a>
                                        </li>
                                    </c:if>
                                </ul>
                                <ul class="navbar-nav ml-auto">
                                    <li class="nav-item">
                                        <form class="form-inline my-2 my-lg-0" action="search" method="get">
                                            <input class="form-control mr-sm-2" type="search" name="query" placeholder="Search" aria-label="Search">
                                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><img src="image/link-ico.png"></button>
                                        </form>
                                    </li>
                                    <c:if test="${sessionScope.account==null}" >
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="login"><i class="fas fa-shopping-cart"></i></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="login"><i class="fas fa-user"></i></a>
                                        </li>
                                    </c:if>
                                    <c:if test="${sessionScope.account!=null}" >                          
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="cart"><i class="fas fa-shopping-cart"></i></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link text-light" href="logout"><i class="fas fa-sign-out-alt"></i></i></a>
                                        </li>
                                    </c:if>         
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <c:if test="${sessionScope.account!=null}" >
            <h3 class="text-center">Hello ${sessionScope.account.username} - ${sessionScope.account.role}</h3>
        </c:if>
    </body>
</html>
