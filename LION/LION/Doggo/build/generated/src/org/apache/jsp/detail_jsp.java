package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // MDB Lightbox Init\n");
      out.write("                $(function () {\n");
      out.write("                    $(\"#mdb-lightbox-ui\").load(\"mdb-addons/mdb-lightbox-ui.html\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Section: Block Content-->\n");
      out.write("        <section class=\"mb-5\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 mb-4 mb-md-0\">\n");
      out.write("\n");
      out.write("                    <div id=\"mdb-lightbox-ui\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"mdb-lightbox\">\n");
      out.write("\n");
      out.write("                        <div class=\"row product-gallery mx-1\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 mb-0\">\n");
      out.write("                                <figure class=\"view overlay rounded z-depth-1 main-img\">\n");
      out.write("                                    <a href=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/15a.jpg\"\n");
      out.write("                                       data-size=\"710x823\">\n");
      out.write("                                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/15a.jpg\"\n");
      out.write("                                             class=\"img-fluid z-depth-1\">\n");
      out.write("                                    </a>\n");
      out.write("                                </figure>\n");
      out.write("                                <figure class=\"view overlay rounded z-depth-1\" style=\"visibility: hidden;\">\n");
      out.write("                                    <a href=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/12a.jpg\"\n");
      out.write("                                       data-size=\"710x823\">\n");
      out.write("                                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/12a.jpg\"\n");
      out.write("                                             class=\"img-fluid z-depth-1\">\n");
      out.write("                                    </a>\n");
      out.write("                                </figure>\n");
      out.write("                                <figure class=\"view overlay rounded z-depth-1\" style=\"visibility: hidden;\">\n");
      out.write("                                    <a href=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/13a.jpg\"\n");
      out.write("                                       data-size=\"710x823\">\n");
      out.write("                                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/13a.jpg\"\n");
      out.write("                                             class=\"img-fluid z-depth-1\">\n");
      out.write("                                    </a>\n");
      out.write("                                </figure>\n");
      out.write("                                <figure class=\"view overlay rounded z-depth-1\" style=\"visibility: hidden;\">\n");
      out.write("                                    <a href=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/14a.jpg\"\n");
      out.write("                                       data-size=\"710x823\">\n");
      out.write("                                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/14a.jpg\"\n");
      out.write("                                             class=\"img-fluid z-depth-1\">\n");
      out.write("                                    </a>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <div class=\"view overlay rounded z-depth-1 gallery-item\">\n");
      out.write("                                            <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/12a.jpg\"\n");
      out.write("                                                 class=\"img-fluid\">\n");
      out.write("                                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <div class=\"view overlay rounded z-depth-1 gallery-item\">\n");
      out.write("                                            <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/13a.jpg\"\n");
      out.write("                                                 class=\"img-fluid\">\n");
      out.write("                                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <div class=\"view overlay rounded z-depth-1 gallery-item\">\n");
      out.write("                                            <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/14a.jpg\"\n");
      out.write("                                                 class=\"img-fluid\">\n");
      out.write("                                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <div class=\"view overlay rounded z-depth-1 gallery-item\">\n");
      out.write("                                            <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/15a.jpg\"\n");
      out.write("                                                 class=\"img-fluid\">\n");
      out.write("                                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                    <h5>Fantasy T-shirt</h5>\n");
      out.write("                    <p class=\"mb-2 text-muted text-uppercase small\">Shirts</p>\n");
      out.write("                    <ul class=\"rating\">\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-star fa-sm text-primary\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-star fa-sm text-primary\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-star fa-sm text-primary\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-star fa-sm text-primary\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"far fa-star fa-sm text-primary\"></i>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p><span class=\"mr-1\"><strong>$12.99</strong></span></p>\n");
      out.write("                    <p class=\"pt-1\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam, sapiente illo. Sit\n");
      out.write("                        error voluptas repellat rerum quidem, soluta enim perferendis voluptates laboriosam. Distinctio,\n");
      out.write("                        officia quis dolore quos sapiente tempore alias.</p>\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"table table-sm table-borderless mb-0\">\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"pl-0 w-25\" scope=\"row\"><strong>Model</strong></th>\n");
      out.write("                                    <td>Shirt 5407X</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"pl-0 w-25\" scope=\"row\"><strong>Color</strong></th>\n");
      out.write("                                    <td>Black</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"pl-0 w-25\" scope=\"row\"><strong>Delivery</strong></th>\n");
      out.write("                                    <td>USA, Europe</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"table-responsive mb-2\">\n");
      out.write("                        <table class=\"table table-sm table-borderless\">\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"pl-0 pb-0 w-25\">Quantity</td>\n");
      out.write("                                    <td class=\"pb-0\">Select size</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"pl-0\">\n");
      out.write("                                        <div class=\"def-number-input number-input safari_only mb-0\">\n");
      out.write("                                            <button onclick=\"this.parentNode.querySelector('input[type=number]').stepDown()\"\n");
      out.write("                                                    class=\"minus\"></button>\n");
      out.write("                                            <input class=\"quantity\" min=\"0\" name=\"quantity\" value=\"1\" type=\"number\">\n");
      out.write("                                            <button onclick=\"this.parentNode.querySelector('input[type=number]').stepUp()\"\n");
      out.write("                                                    class=\"plus\"></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <div class=\"mt-1\">\n");
      out.write("                                            <div class=\"form-check form-check-inline pl-0\">\n");
      out.write("                                                <input type=\"radio\" class=\"form-check-input\" id=\"small\" name=\"materialExampleRadios\"\n");
      out.write("                                                       checked>\n");
      out.write("                                                <label class=\"form-check-label small text-uppercase card-link-secondary\"\n");
      out.write("                                                       for=\"small\">Small</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-check form-check-inline pl-0\">\n");
      out.write("                                                <input type=\"radio\" class=\"form-check-input\" id=\"medium\" name=\"materialExampleRadios\">\n");
      out.write("                                                <label class=\"form-check-label small text-uppercase card-link-secondary\"\n");
      out.write("                                                       for=\"medium\">Medium</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-check form-check-inline pl-0\">\n");
      out.write("                                                <input type=\"radio\" class=\"form-check-input\" id=\"large\" name=\"materialExampleRadios\">\n");
      out.write("                                                <label class=\"form-check-label small text-uppercase card-link-secondary\"\n");
      out.write("                                                       for=\"large\">Large</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary btn-md mr-1 mb-2\">Buy now</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-light btn-md mr-1 mb-2\"><i\n");
      out.write("                            class=\"fas fa-shopping-cart pr-2\"></i>Add to cart</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!--Section: Block Content-->\n");
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
}
