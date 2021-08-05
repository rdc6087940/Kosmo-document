<%@ page import="user.UserDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="ko">
<meta charset="UTF-8">
<!-- navbar start-->
<%
String userID = (String) session.getAttribute("userID");
%>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark ml-auto" >
        <a class="navbar-brand text-warning" href="index.jsp">Band us</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active ml-3">
              <a class="nav-link text-warning" href="home.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item  ml-3" >
              <a class="nav-link text-warning" href="#">Song</a>
            </li>
            
            <%
            if (userID != null) {
            %>
            <li class="nav-item  ml-3" >
              <a class="nav-link text-warning" href="#">Community</a>
            </li>
            <li class="nav-item active ml-3">
              <a class="nav-link text-warning" href="postSong.jsp">Post Song <span class="sr-only">(current)</span></a>
            </li>
            
            <%
    		}
    		else{
            %>
            <li class="nav-item  ml-3" >
              <a class="nav-link text-warning" href="login.jsp">Community</a>
            </li>
            <li class="nav-item active ml-3">
              <a class="nav-link text-warning" href="login.jsp">Post Song <span class="sr-only">(current)</span></a>
            </li>
            
            <%
    		}
          %>
            <li class="nav-item dropdown  ml-3">
              <a class="nav-link dropdown-toggle text-warning" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Rank
              </a>
              <div class="dropdown-menu  ml-3" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Top 10</a>
                <a class="dropdown-item" href="#">New Songs</a>
                <a class="dropdown-item" href="#">Hot Artist</a>
                <a class="dropdown-item" href="#">Category</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">My favorite</a>
              </div>
            </li>
            <%

    			
    		
    		if (userID != null) {
    			
            %>
            <a class="nav-link text-warning" href="#">Welcome, <%=userID %></a>
            </li>
            <li>
            <button type="button" class="btn btn-outline-warning ml-3 mr-5" onclick="location.href='logoutAction.jsp'">Logout</button>
            <%
    		}
    		else{
            %>
             <button type="button" class="btn btn-outline-warning ml-3 mr-5" onclick="location.href='login.jsp'">Login</button>
          <%
    		}
          %>
          </li>
          
          </ul>
        </div>
      </nav>
</html>
      <!-- navbar end -->