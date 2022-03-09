package org.apache.jsp.footer_005fheader;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            header{\n");
      out.write("                position: -webkit-sticky;\n");
      out.write("                position: sticky;\n");
      out.write("                top: 0;\n");
      out.write("                z-index: 100    ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-dark pt-2 pb-2 pl-1 pr-1\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <nav class=\"navbar navbar-expand-sm navbar-dark\">\n");
      out.write("                            <a class=\"navbar-brand\" href=\"home\"><h4>sport<span style=\"color: yellow\">KITS</span></h4></a>\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("                                <ul class=\"navbar-nav \">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link text-light\" href=\"home\">Trang chủ<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item dropdown\">\n");
      out.write("                                        <a class=\"nav-link dropdown-toggle text-light\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                            Danh mục\n");
      out.write("                                        </a>\n");
      out.write("                                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=*&page=1\">Tất cả</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Premier+League&page=1\">Áo đấu Premier League</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=La+Liga&page=1\">Áo đấu La Liga</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Series+A&page=1\">Áo đấu Series A</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Bundesliga&page=1\">Áo đấu Bundesliga</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Ligue+1&page=1\">Áo đấu Ligue 1</a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <!--                                        <div class=\"dropdown\">\n");
      out.write("                                                                                    <button class=\"btn dropdown-toggle text-white\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                                                        <a class=\"text-decoration-none text-light\" href=\"catalog?league=*\">Tất cả</a>\n");
      out.write("                                                                                    </button>\n");
      out.write("                                                                                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                                                                                        <a class=\"dropdown-item\" href=\"catalog?league=Premier+League\">Áo đấu Premier League</a>\n");
      out.write("                                                                                        <a class=\"dropdown-item\" href=\"catalog?league=La+Liga\">Áo đấu La Liga</a>\n");
      out.write("                                                                                        <a class=\"dropdown-item\" href=\"catalog?league=Series+A\">Áo đấu Series A</a>\n");
      out.write("                                                                                        <a class=\"dropdown-item\" href=\"catalog?league=Bundesliga\">Áo đấu Bundesliga</a>\n");
      out.write("                                                                                        <a class=\"dropdown-item\" href=\"catalog?league=Ligue 1\">Áo đấu Ligue 1</a>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>-->\n");
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <!--                                    <li class=\"nav-item\">\n");
      out.write("                                                                            <a class=\"nav-link text-light\" href=\"contact.jsp\">Liên hệ</a>\n");
      out.write("                                                                        </li>-->\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <form class=\"form-inline my-2 my-lg-0\" action=\"search\" method=\"get\">\n");
      out.write("                                            <input class=\"form-control mr-sm-2\" type=\"search\" name=\"query\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\"><img src=\"image/link-ico.png\"></button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link text-light\" href=\"cart.jsp\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_otherwise_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"#\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                        </li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent(null);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"login.jsp\"><i class=\"fas fa-user\"></i></a>\n");
        out.write("                                        </li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
