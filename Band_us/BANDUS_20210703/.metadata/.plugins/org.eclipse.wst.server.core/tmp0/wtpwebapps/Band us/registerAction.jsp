<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="user.UserDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPassword" />
<jsp:setProperty name="user" property="userNickname" />
<jsp:setProperty name="user" property="userPWConfirm" />
<!doctype html>
<html lang="ko">

<head>
<meta charset="UTF-8">

<title>음악의 시작, Band us</title>
</head>

<body>

	<%
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if (userID != null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이미 로그인이 되어있습니다.')");
			script.println("location.href = 'home.jsp'");
			script.println("</script>");
		}

		if (user.getUserID() == null || user.getUserPassword() == null || user.getUserNickname() == null) {

			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('양식을 전부 입력해주세요.')");
			script.println("history.back()");
			script.println("</script>");
		} else if (!(user.getUserPassword().equals(user.getUserPWConfirm()))) {
			System.out.println(user.getUserPassword());
			System.out.println(user.getUserPWConfirm());
			System.out.println(user.getUserPassword().equals(user.getUserPWConfirm()));
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호를 다시 확인해주세요')");
			script.println("history.back()");
			script.println("</script>");
		} else {
			UserDAO userDAO = new UserDAO();
			int result = userDAO.register(user);
			if (result == -1) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미 존재하는 아이디입니다.')");
				script.println("history.back()");
				script.println("</script>");
			} else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("location.href = 'home.jsp'");
				script.println("</script>");
			}

		}
	%>


</body>

</html>