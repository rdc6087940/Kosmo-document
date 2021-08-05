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

    <link rel="stylesheet" href="css/register.css">

    <style>
HTML {
    height: 100%;
}

BODY {
    min-height: 100%;
    background-image: url("img/login_background.jpg");
    background-position: center center;
    background-repeat: no-repeat;
    background-size: cover;
}

MAIN {
    padding-top: 30px; 
    padding-bottom: 30px;
    margin-top: 56px;
}




    </style>
    <title>음악의 시작, Band us</title>
</head>

<body>
    <jsp:include page="navbar.jsp"/>

        <form method="post" action="registerAction.jsp"   style="position: relative; ">
      <main role="main" class="container">
        <div class="jumbotron">
          <h1 class="mb-3 text-warning"><span class="cafe-text">BAND US</span></h1>
          <p class="lead cafe-text">Would you Band us?</p>

         

          <p class="lead cafe-text"> - 아이디</p>
            <div class="form-group" style="display:flex; align-items: center;" >
                <div class="input-group form-group">
                    <div style="max-width: 50%;" class="input-group-prepend">
        
                        <span style="width: 100%;" class="input-group-text">E-mail</span>
                        
                    </div>
                    <input type="email" class="form-control" name="userID" placeholder="band@us.com">
                    
                    </div>
            </div>
            

            <p class="lead cafe-text"> - 비밀번호</p>
        <div class="input-group form-group">
            <div style="max-width: 50%;" class="input-group-prepend">
                <span style="width: 100%;"  class="input-group-text">Password</i></span>
            </div>
            <input type="password" class="form-control" name="userPassword" placeholder="비밀번호">
        </div>

        <div class="input-group form-group">
            <div style="max-width: 50%;" class="input-group-prepend">
                <span style="width: 100%;" class="input-group-text">PW Confirm</i></span>
            </div>
            <input type="password" class="form-control" name="userPWConfirm" placeholder="비밀번호 확인">
        </div>
        
         <div class="input-group form-group">
            <div style="max-width: 50%;" class="input-group-prepend">
                <span style="width: 100%;" class="input-group-text">Nickname</i></span>
            </div>
            <input type="text" class="form-control" name="userNickname" placeholder="닉네임">
        </div>

        <div class="row align-items-center remember">
            <input type="checkbox">정보제공에 동의합니다.
        </div>
        <div class="form-group" style="display:flex; align-items: center;" >
            <input style="width: 80%;" type="submit" value="회원 가입" class="btn btn-outline-warning mt-4 ml-5">
        </div>
    
        </div>
      </main>
      </form>

      

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

<script>

var con = 

</script>

</html>