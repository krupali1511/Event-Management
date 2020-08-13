package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Event Management</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Events Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("\tSmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("<link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">  \n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\t\t<!-- font-awesome icons -->\n");
      out.write("<!-- //Custom Theme files --> \n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-2.2.3.min.js\"></script>  \n");
      out.write("<!-- //js -->\n");
      out.write("<!-- web-fonts -->  \n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Josefin+Sans:300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("<!-- //web-fonts -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-fixed-top\">  \n");
      out.write("\t<!-- banner -->\n");
      out.write("\t<div class=\"w3ls-banner-1\"> \n");
      out.write("\t\t<!-- banner-text --> \n");
      out.write("\t\n");
      out.write("\t<!-- //banner --> \n");
      out.write("\t\t\t<!-- header -->\n");
      out.write("\t\t<div class=\"header-w3layouts\"> \n");
      out.write("\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header page-scroll\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Events</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<h1><a class=\"navbar-brand\" href=\"index.jsp\">Events</a></h1>\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Hidden li included to remove active class from about link when scrolled up past about section -->\n");
      out.write("\t\t\t\t\t\t\t<li class=\"hidden\"><a class=\"page-scroll\" href=\"#page-top\"></a>\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"about.jsp\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"events.jsp\">Events</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle hvr-sweep-to-right\" data-hover=\"Pages\" data-toggle=\"dropdown\">Pages <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"icons.jsp\">Icons</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"typography.jsp\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"gallery.jsp\">Gallery</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-sweep-to-right\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.container -->\n");
      out.write("\t\t\t</nav>  \n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<!-- //header -->\n");
      out.write("\t</div>\t\n");
      out.write("        <div class=\"w3ls_address_mail_footer_grids\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<h2 class=\"heading-agileinfo\"><span>Successfully booked</span></h2>");
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
