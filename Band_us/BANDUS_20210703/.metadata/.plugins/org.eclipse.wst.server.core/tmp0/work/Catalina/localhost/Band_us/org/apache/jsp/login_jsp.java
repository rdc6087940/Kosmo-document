/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-07-03 03:56:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("HTML {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("BODY {\r\n");
      out.write("    min-height: 100%;\r\n");
      out.write("    background-image: url(\"img/login_background.jpg\");\r\n");
      out.write("    background-position: center center;\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("MAIN {\r\n");
      out.write("    padding-top: 30px; \r\n");
      out.write("    padding-bottom: 30px;\r\n");
      out.write("    margin-top: 56px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <title>음악의 시작, Band us</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <main role=\"main\" class=\"container\">\r\n");
      out.write("        <div class=\"jumbotron\">\r\n");
      out.write("          <h1 class=\"mb-3 text-warning\"><span class=\"cafe-text\">BAND US</span></h1>\r\n");
      out.write("          <p class=\"lead cafe-text\">Welcome to Band us!!</p>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <form method=\"post\" action=\"loginAction.jsp\">\r\n");
      out.write("            <div class=\"form-group\" style=\"display:flex; align-items: center;\" >\r\n");
      out.write("                <div class=\"input-group form-group\">\r\n");
      out.write("                    <div style=\"max-width: 50%;\" class=\"input-group-prepend\">\r\n");
      out.write("        \r\n");
      out.write("                        <span style=\"width: 100%;\" class=\"input-group-text\">E-mail</span>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"userID\" placeholder=\"band@us.com\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group form-group\">\r\n");
      out.write("            <div style=\"max-width: 50%;\" class=\"input-group-prepend\">\r\n");
      out.write("                <span style=\"width: 100%;\"  class=\"input-group-text\">Password</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"userPassword\" placeholder=\"비밀번호\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row align-items-center remember\">\r\n");
      out.write("            <input type=\"checkbox\">Remember Me\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\" style=\"display:flex; align-items: center; \" >\r\n");
      out.write("        <form method=\"post\" action=\"loginAction.jsp\"  class=\"w-50 \" style=\"position: relative; \">\r\n");
      out.write("            <input type=\"submit\" value=\"로그인\"  class=\"btn btn-outline-warning mt-4 mr-1 form-control \">\r\n");
      out.write("         </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<form   class=\"w-75 \" style=\"position: relative;\">\r\n");
      out.write("            <input type=\"button\" value=\"회원 가입\" onclick=\"location.href='register.jsp'\" class=\"btn btn-outline-warning mt-4 ml-1\">\r\n");
      out.write("                  </form>\r\n");
      out.write("\r\n");
      out.write("       </div>\r\n");
      out.write("       </form>\r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </main>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
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