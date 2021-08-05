<%@ page contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html lang="ko">


<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/login.css">
<title>음악의 시작, Band us</title>
</head>

<body>
	<jsp:include page="navbar.jsp" />

	<header class="bg-dark py-2">
		<div class="container px-5">
			<div class="row gx-5 justify-content-center">
				<div class="col-lg-6">
					<div class="text-center my-5">
						<h1
							class="display-5 fw-bolder text-white mb-2 cafe-text text-warning">Post
							Song</h1>
						<h1 class="display-5 fw-bolder text-white mb-2 cafe-text">노래
							등록</h1>

					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- Features section-->
	<form method="post" action="postSongAction.jsp" enctype="multipart/form-data">
	<div class="container w-75">
		<br>

		<h1 class="text-center">
			<span class="cafe-text">Song Info</span>
		</h1>
		<hr>


		<h3>◆ Upload Song</h3>
		<div class="row">
			<div class="col-12">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="inputGroupFileAddon01">
							Song </span>
					</div>
					<div class="custom-file">
						<input type="file" class="custom-file-input" id="inputGroupFile01"
							aria-describedby="inputGroupFileAddon01"> <label
							class="custom-file-label" for="inputGroupFile01" name="file1"> 노래 찾기</label>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-8">
				<h3>◆ Song name</h3>
				<div class="short-div">
					<div class="input-group form-group mr-0">
						<div style="max-width: 50%;" class="input-group-prepend">
							<span style="width: 100%;" class="input-group-text">곡 이름</span>
						</div>
						<input type="text" class="form-control" name="song_name">
					</div>

				</div>


				<h3>◆ Artist name</h3>
				<div class="short-div mt-2">
					<div class="input-group form-group mr-0">
						<div style="max-width: 50%;" class="input-group-prepend">
							<span style="width: 100%;" class="input-group-text">아티스트</span>
						</div>
						<input type="text" class="form-control" name="artist_name">
					</div>

				</div>

			</div>
			<div class="col-4" style="">
				<img id="preview-image" src="img/postsong_img.jpg" alt="home_1"
					class="float-right img-thumbnail" />
			</div>

		</div>


		<div class="row">
			<div class="col-8">
				<h3>◆ Album name</h3>
				<div class="short-div">
					<div class="input-group form-group mr-0">
						<div style="max-width: 50%;" class="input-group-prepend">
							<span style="width: 100%;" class="input-group-text">앨범명</span>
						</div>
						<input type="text" class="form-control" name="album_name">
					</div>

				</div>
			</div>


			<div class="col-4 mt-3">
				<h5>앨범 사진 선택하기</h5>
				<input style="display: block;" type="file" id="input-image" name="file2" accept="image/png, image/jpeg">
			</div>
		</div>

		<div class="row">
			<div class="col-12">
				<h3>◆ Comment</h3>
				<input class="DOC_TEXT" style="width: 100%; height: 300px"
					placeholder="500자 이내로 적어주세요." name="song_comment">

			</div>
		</div>
		
		
		<button type="submit" class="btn btn-warning btn-lg btn-block mt-5">Post Song</button>
	</div>
	</form>
	
<jsp:include page="footer.jsp" />





	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>

<script>
// 글자수 카운터 
$('.DOC_TEXT').keyup(function (e){
    var content = $(this).val();
    $('#counter').html("("+content.length+" / 최대 500자)");    //글자수 실시간 카운팅

    if (content.length > 500){
        alert("최대 500자까지 입력 가능합니다.");
        $(this).val(content.substring(0, 500));
        $('#counter').html("(500 / 최대 500자)");
    }
});
////////////////////////////////////


function readImage(input) {
    // 인풋 태그에 파일이 있는 경우
    if(input.files && input.files[0]) {
        // 이미지 파일인지 검사 (생략)
        // FileReader 인스턴스 생성
        const reader = new FileReader()
        // 이미지가 로드가 된 경우
        reader.onload = e => {
            const previewImage = document.getElementById("preview-image")
            previewImage.src = e.target.result
        }
        // reader가 이미지 읽도록 하기
        reader.readAsDataURL(input.files[0])
    }
}
// input file에 change 이벤트 부여
const inputImage = document.getElementById("input-image")
inputImage.addEventListener("change", e => {
    readImage(e.target)
})
</script>



</html>