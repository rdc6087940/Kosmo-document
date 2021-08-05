/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-07-01 00:14:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("utf-8");


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/detail.css\">\r\n");
      out.write("<title>키오스크 프로젝트</title>\r\n");
      out.write("\r\n");
      out.write("<script src='./lib/jquery-3.1.1.min.js' type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"./js/detail.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"bodies\">\r\n");
 String place = request.getParameter("place"); 
      out.write('\r');
      out.write('\n');
 
	int price = Integer.parseInt(request.getParameter("price"));

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- nav--------------------------------------------------------------------- -->\r\n");
      out.write("	<div>\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark ml-auto\">\r\n");
      out.write("			<a id=\"homes\" class=\"navbar-brand text-warning text-center\" href=\"index.html\">KOSMO\r\n");
      out.write("				여행사 [패키지 구매]</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("				data-target=\"#navbarSupportedContent\"\r\n");
      out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</nav>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- nav end--------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("	<!--header --------------------------------------------------------------------- -->\r\n");
      out.write("	<header class=\"bg-dark py-1\">\r\n");
      out.write("		<div class=\"container px-1\">\r\n");
      out.write("			<div class=\"row gx-3 justify-content-center\">\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("					<div class=\"text-center my-2\">\r\n");
      out.write("						<h1\r\n");
      out.write("							class=\"display-5 fw-bolder text-white mb-2 cafe-text text-warning\">KOSMO\r\n");
      out.write("							여행</h1>\r\n");
      out.write("						<h1 class=\"display-5 fw-bolder text-white mb-2 cafe-text\">패키지\r\n");
      out.write("							구매</h1>\r\n");
      out.write("						<p class=\"lead text-white-50 mb-4\">Kosmo 여행사는 완전무결한 패키지를 제공합니다</p>\r\n");
      out.write("						<div class=\"d-grid gap-3 d-sm-flex justify-content-sm-center\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<!--header end --------------------------------------------------------------------- -->\r\n");
      out.write("	<!--main       --------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("	<main role=\"main\" class=\"container\">\r\n");
      out.write("	<div class=\"jumbotron\" style=\"background-color: grey\">\r\n");
      out.write("		<h1 class=\"mb-3 text-warning\">\r\n");
      out.write("			<span class=\"cafe-text\">KOSMO 여행</span>\r\n");
      out.write("		</h1>\r\n");
      out.write("		<p class=\"lead cafe-text text-white\">");
      out.print(place );
      out.write("</p>\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		<label class=\"text-warning\">- 희망 여행날짜</label>\r\n");
      out.write("		<div class=\"form-group\" style=\"display: flex; align-items: center;\">\r\n");
      out.write("			<input id=\"notweek\" type=\"button\" value=\"평일\"\r\n");
      out.write("				class=\"btn btn-outline-warning mt-2 mr-4 form-control \"> \r\n");
      out.write("				<input\r\n");
      out.write("				id=\"week\" type=\"button\" value=\"주말\"\r\n");
      out.write("				class=\"btn btn-outline-warning mt-2 mr-2 ml-4 form-control \">\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<!-- ★결과값 출력을 위해 div 추가 -->\r\n");
      out.write("		<div class=\"result text-white\"></div>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<label class=\"text-warning\">- 희망 숙박시설</label>\r\n");
      out.write("		<div class=\"form-group\" style=\"display: flex; align-items: center;\">\r\n");
      out.write("			<input id=\"hotel\" type=\"button\" value=\"호텔\"\r\n");
      out.write("				class=\"btn btn-outline-warning mt-2 mr-4 form-control \"> <input\r\n");
      out.write("				id=\"hhotel\" type=\"button\" value=\"고급 호텔\"\r\n");
      out.write("				class=\"btn btn-outline-warning mt-2 mr-2 ml-4 form-control \">\r\n");
      out.write("				<!-- ★id명 변경 호텔 > hotel / 고급호텔 > hhotel -->\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<!-- ★결과값 출력을 위해 div 추가 -->\r\n");
      out.write("		<div class=\"result2 text-white\"></div>\r\n");
      out.write("		<br>\r\n");
      out.write("		<hr>\r\n");
      out.write("		\r\n");
      out.write("		<pre class=\"text-warning\"> 현재 코로나로 인한 5인 이상 집합 금지 명령에\r\n");
      out.write(" 따라 최대 4인까지 예약 가능합니다.</pre>\r\n");
      out.write("		<div class=\"input-group mb-3\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"input-group-prepend\">\r\n");
      out.write("\r\n");
      out.write("				<label class=\"input-group-text \" for=\"inputGroupSelect01\">인원</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<select class=\"custom-select\" id=\"inputGroupSelect01\">\r\n");
      out.write("				<option value=\"0\">인원수</option>\r\n");
      out.write("				<option value=\"1\">1명</option>\r\n");
      out.write("				<option value=\"2\">2명</option>\r\n");
      out.write("				<option value=\"3\">3명</option>\r\n");
      out.write("				<option value=\"4\">4명</option>\r\n");
      out.write("			</select>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row align-items-center remember\">\r\n");
      out.write("			<input id=\"agree\" type=\"checkbox\" class=\"ml-4 \"><span class=\"text-warning\">약관에 동의합니다.</span>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<br>\r\n");
      out.write("		<hr>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"form-group\" style=\"display: flex; align-items: center;\">\r\n");
      out.write("			<label class=\"mr-4 text-warning\"> 총 결제 금액</label>\r\n");
      out.write("			<input name=\"totalbox\" type=\"text\" class=\"w-50\" value=\"\" readonly>\r\n");
      out.write("			<!-- ★input에 name, value 추가 -->\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-group\" style=\"display: flex; align-items: center;\">\r\n");
      out.write("\r\n");
      out.write("			<input id=\"buy\" type=\"submit\" value=\"결제\"\r\n");
      out.write("				class=\"btn btn-outline-warning mt-4 mr-1 form-control\">\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	</main>\r\n");
      out.write("	<!--main end --------------------------------------------------------------------- -->\r\n");
      out.write("<p class=\"text-white\" id=\"prices\">");
      out.print(price);
      out.write("</p>\r\n");
      out.write("	<!--외부 스크립트 --------------------------------------------------------------------- -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("		integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}