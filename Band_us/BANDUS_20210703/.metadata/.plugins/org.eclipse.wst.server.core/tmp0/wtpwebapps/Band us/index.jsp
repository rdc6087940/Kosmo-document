<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="ko">


<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link rel="stylesheet" href="css/index.css">
    <title>음악의 시작, Band us</title>
</head>

<body>
   <jsp:include page="navbar.jsp"/>

      <!-- carousel start -->
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">

        <div class="carousel-caption d-none d-md-block" >
            <h1 class="display-1" >당신을 위한 밴드</h1>
            <p class="display-4">그 시작입니다</p>
            <button type="button" class="btn btn-outline-warning ml-3 mr-5 mb-3 mt-1 btn-lg" onclick="location.href='home.jsp'">Band us</button>
          </div>

          <div class="carousel-caption d-block d-md-none d-lg-none">
            <h2 >당신을 위한 밴드</h2>
            <h4>그 시작입니다</h4>
            <button type="button" class="btn btn-outline-warning ml-3 mr-5 mb-3 mt-1 btn-lg" onclick="location.href='home.jsp'">Band us</button>
          </div>

   
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>

        
        <div class="carousel-inner">
            
          <div class="carousel-item active">
            <img class="d-block w-100" src="img/calousel_01.jpg" alt="First slide">
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="img/calousel_02.jpg" alt="Second slide">
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="img/calousel_03.jpg" alt="Third slide">
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
      

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>

</html>