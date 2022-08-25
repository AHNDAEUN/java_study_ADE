
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bank</title>
    <!-- title은 웹사이트 탭명에 표시 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  </head>
  <body>
    
    <!-- header import-->
    
    <c:import url="./template/header.jsp"></c:import>
    

			${sessionScope.bankmember}
     <!-- 이미지 나오는지 확인!
        <img src="/resources/images/KakaoTalk_20220822_194608984.jpg " alt="" srcset="">
      -->

      <section  class=" container-fluid col-lg-5 mt-4">
         <!-- 중앙에 들어가는 contents 부분-->


        <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
              <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
              <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
              <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active" data-bs-interval="2000">
                <img src="/resources/images/KakaoTalk(1).jpg" class="d-block w-90" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>First slide label</h5>
                  <p>Some representative placeholder content for the first slide.</p>
                </div>
              </div>
              <div class="carousel-item" data-bs-interval="2000"> <!-- 1000 => 1초 -->
                <img src="/resources/images/KakaoTalk(2)jpg.jpg" class="d-block w-90" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Second slide label</h5>
                  <p>Some representative placeholder content for the second slide.</p>
                </div>
              </div>
              <div class="carousel-item">
                <img src="/resources/images/KakaoTalk_(3)jpg.jpg" class="d-block w-90" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Third slide label</h5>
                  <p>Some representative placeholder content for the third slide.</p>
                </div>
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>

      </section>


      <!--
      <div class="container-fluid">  큰 박스 생성
        <div class="row"> 
            <div class="col-sm-12 col-lg-6 bg-success">
                    col-lg-6: 가로길이의 박스 생성, 화면이 큰사이즈이면서 12칸 중 6칸을 차지
                    col-sm-12: 작은화면이 될 때까지 줄이다보면 12칸 중 12칸을 차지한 박스가 표시됨
                    div1
            </div>
            <div class="col-sm-12 col-lg-6 bg-danger">
                div2
            </div>
        </div>
      </div>-->

       <!-- footer import -->

     <c:import url="./template/footer.jsp"></c:import>

       


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
  </body>
</html>