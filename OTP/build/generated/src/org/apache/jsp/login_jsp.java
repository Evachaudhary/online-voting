package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Add_Contestant</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("    .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      border-radius: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("    .row.content {height: 420px}\n");
      out.write("    \n");
      out.write("    /* Set gray background color and 100% height */\n");
      out.write("    .sidenav {\n");
      out.write("      padding-top: 20px;\n");
      out.write("      background-color: #f1f1f1;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("   .the-legend {\n");
      out.write("    border-style: none;\n");
      out.write("    border-width: 0;\n");
      out.write("    font-size: 14px;\n");
      out.write("    line-height: 20px;\n");
      out.write("    margin-bottom: 0;\n");
      out.write("    width: auto;\n");
      out.write("    padding: 0 10px;\n");
      out.write("    border: 1px solid #e0e0e0;\n");
      out.write("}\n");
      out.write(".the-fieldset {\n");
      out.write("    border: 1px solid #e0e0e0;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("    /* Set black background color, white text and some padding */\n");
      out.write("    footer {\n");
      out.write("      background-color: teal;\n");
      out.write("      color: teal;\n");
      out.write("      padding: 15px;\n");
      out.write("       height:50px; \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("    @media screen and (max-width: 760px) {\n");
      out.write("      .sidenav {\n");
      out.write("        height: auto;\n");
      out.write("        padding: 15px;\n");
      out.write("      }\n");
      out.write("      .row.content {height:auto;} \n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"background-color: teal\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                      \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"#\">Result</a></li>\n");
      out.write("        <li><a href=\"#\">Contestant Information</a></li>\n");
      out.write("      \n");
      out.write("      </ul>\n");
      out.write("     <!-- <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>-->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("      <header style=\"background-color: white\">\n");
      out.write("      <div class=\"container text-center\">\n");
      out.write("        <h1>                                 </h1>\n");
      out.write("        <p class=\"lead\">                       </p>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("  \n");
      out.write("     <header>\n");
      out.write("      <div class=\"container text-center\">\n");
      out.write("        <div class=\"col-lg-40 mx-auto\">\n");
      out.write("<div class=\"mt-5 col-md-12\">\n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("        <h1 > Welcome  </h1>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write(" <header  id=\"about\">\n");
      out.write("\n");
      out.write("      <div class=\"container text-center\"  style=\"width: 330px\">\n");
      out.write("        <div class=\"row\" >\n");
      out.write("          <div class=\"mt-5 col-md-30\">\n");
      out.write("        \n");
      out.write("             <div class=\"col-sm-70mx-auto\">\n");
      out.write("                <h2>            </h2>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("        <form method=\"post\" action=\"process.jsp\">\n");
      out.write("             <fieldset class=\"the-fieldset\">\n");
      out.write("                            <legend class=\"the-legend\">Candidate Registration</legend>\n");
      out.write("\n");
      out.write("                             <div class=\"col-sm-17\">  \n");
      out.write("                             <div class=\"table-responsive\">\n");
      out.write("         Name:<br>\n");
      out.write("\n");
      out.write("        <input type=\"text\" name=\"name\">\n");
      out.write("         <br>\n");
      out.write("         Email:<br>\n");
      out.write("        <input type=\"text\" name=\"email\">\n");
      out.write("         <br>\n");
      out.write("        Phone:<br>\n");
      out.write("        <input type=\"text\" name=\"phone\">\n");
      out.write("        <br>\n");
      out.write("        <br><br>\n");
      out.write("<input type=\"submit\" name=\"save\" value=\"submit\">\n");
      out.write("             \n");
      out.write("   </fieldset>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("           </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("             <div class=\"form-group\" class=\"text-center\" class=\"container\">        \n");
      out.write("                  <div class=\"col-sm-offset-1 col-sm-10\">\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("          <div class=\"jumbotron \" style=\"background-color: white\">\n");
      out.write("        <div class=\"col-md-2 px-0\">\n");
      out.write("          <h1 class=\"display-2 font-italic\"></h1>\n");
      out.write("         \n");
      out.write("          <p class=\"lead mb-0\"><a href=\"#\" class=\"text-white font-weight-bold\"></a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("</fieldset>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("      <header style=\"background-color: white\">\n");
      out.write("      <div class=\"container text-center\">\n");
      out.write("        <h1>                                 </h1>\n");
      out.write("        <p class=\"lead\">                       </p>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("      <header style=\"background-color: white\">\n");
      out.write("      <div class=\"container text-center\">\n");
      out.write("        <h1>                                 </h1>\n");
      out.write("        <p class=\"lead\">                       </p>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <p></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
