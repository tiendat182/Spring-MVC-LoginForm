/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-11 09:44:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\r\n");
      out.write("\t<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<title>Spring Login Form</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(10,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/styleLogin.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/login.jsp(11,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/js/jquery-2.1.4.min.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/login.jsp(12,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/js/login.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(16,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setName("submitForm");
    // /WEB-INF/views/login.jsp(16,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    // /WEB-INF/views/login.jsp(16,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("login");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"logmod\">\r\n");
          out.write("\t\t  <div class=\"logmod__wrapper\">\r\n");
          out.write("\t\t    <span class=\"logmod__close\">Close</span>\r\n");
          out.write("\t\t    <div class=\"logmod__container\">\r\n");
          out.write("\t\t      <ul class=\"logmod__tabs\">\r\n");
          out.write("\t\t        <li data-tabtar=\"lgm-2\"><a href=\"#\">Login</a></li>\r\n");
          out.write("\t\t        <li data-tabtar=\"lgm-1\"><a href=\"#\">Sign Up</a></li>\r\n");
          out.write("\t\t      </ul>\r\n");
          out.write("\t\t      <div class=\"logmod__tab-wrapper\">\r\n");
          out.write("\t\t      <div class=\"logmod__tab lgm-1\">\r\n");
          out.write("\t\t        <div class=\"logmod__heading\">\r\n");
          out.write("\t\t          <span class=\"logmod__heading-subtitle\">Enter your personal details <strong>to create an acount</strong></span>\r\n");
          out.write("\t\t        </div>\r\n");
          out.write("\t\t        <div class=\"logmod__form\">\r\n");
          out.write("\t\t            <div class=\"sminputs\">\r\n");
          out.write("\t\t              <div class=\"input full\">\r\n");
          out.write("\t\t                <label class=\"string optional\" for=\"user-email\">Email*</label>\r\n");
          out.write("\t\t                <input class=\"string optional\" maxlength=\"255\" id=\"user-email\" placeholder=\"Email\" type=\"text\" size=\"50\" />\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t            </div>\r\n");
          out.write("\t\t            <div class=\"sminputs\">\r\n");
          out.write("\t\t              <div class=\"input string optional\">\r\n");
          out.write("\t\t                <label class=\"string optional\" for=\"user-pw\">Password *</label>\r\n");
          out.write("\t\t                <input class=\"string optional\" maxlength=\"255\" id=\"user-pw\" placeholder=\"Password\" type=\"text\" size=\"50\" />\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t              <div class=\"input string optional\">\r\n");
          out.write("\t\t                <label class=\"string optional\" for=\"user-pw-repeat\">Repeat password *</label>\r\n");
          out.write("\t\t                <input class=\"string optional\" maxlength=\"255\" id=\"user-pw-repeat\" placeholder=\"Repeat password\" type=\"text\" size=\"50\" />\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t            </div>\r\n");
          out.write("\t\t            <div class=\"simform__actions\">\r\n");
          out.write("\t\t              <input class=\"sumbit\" name=\"commit\" type=\"sumbit\" value=\"Create Account\" />\r\n");
          out.write("\t\t              <span class=\"simform__actions-sidetext\">By creating an account you agree to our <a class=\"special\" href=\"#\" target=\"_blank\" role=\"link\">Terms & Privacy</a></span>\r\n");
          out.write("\t\t            </div> \r\n");
          out.write("\t\t        </div> \r\n");
          out.write("\t\t        <div class=\"logmod__alter\">\r\n");
          out.write("\t\t          <div class=\"logmod__alter-container\">\r\n");
          out.write("\t\t            <a href=\"#\" class=\"connect facebook\">\r\n");
          out.write("\t\t              <div class=\"connect__icon\">\r\n");
          out.write("\t\t                <i class=\"fa fa-facebook\"></i>\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t              <div class=\"connect__context\">\r\n");
          out.write("\t\t                <span>Create an account with <strong>Facebook</strong></span>\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t            </a>\r\n");
          out.write("\t\t              \r\n");
          out.write("\t\t            <a href=\"#\" class=\"connect googleplus\">\r\n");
          out.write("\t\t              <div class=\"connect__icon\">\r\n");
          out.write("\t\t                <i class=\"fa fa-google-plus\"></i>\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t              <div class=\"connect__context\">\r\n");
          out.write("\t\t                <span>Create an account with <strong>Google+</strong></span>\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t            </a>\r\n");
          out.write("\t\t          </div>\r\n");
          out.write("\t\t        </div>\r\n");
          out.write("\t\t      </div>\r\n");
          out.write("\t\t      <div class=\"logmod__tab lgm-2\">\r\n");
          out.write("\t\t        <div class=\"logmod__heading\">\r\n");
          out.write("\t\t          <span class=\"logmod__heading-subtitle\">Enter your name and password <strong>to sign in</strong></span>\r\n");
          out.write("\t\t          <span style=\"color: red\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t        </div> \r\n");
          out.write("\t\t        <div class=\"logmod__form\">\r\n");
          out.write("\t\t            <div class=\"sminputs\">\r\n");
          out.write("\t\t              <div class=\"input full\">\r\n");
          out.write("\t\t                <label class=\"string optional\" for=\"user-name\">User Name*</label>\r\n");
          out.write("\t\t                <input class=\"string optional\" maxlength=\"255\" id=\"user-name\" placeholder=\"User name\" type=\"text\" size=\"50\" name=\"userName\"/>\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t            </div>\r\n");
          out.write("\t\t            <div class=\"sminputs\">\r\n");
          out.write("\t\t              <div class=\"input full\">\r\n");
          out.write("\t\t                <label class=\"string optional\" for=\"user-pw\">Password *</label>\r\n");
          out.write("\t\t                <input class=\"string optional\" maxlength=\"255\" id=\"user-pw\" placeholder=\"Password\" type=\"password\" size=\"50\" name=\"password\"/>\r\n");
          out.write("\t\t                \t\t\t\t\t\t<span class=\"hide-password\">Show</span>\r\n");
          out.write("\t\t              </div>\r\n");
          out.write("\t\t            </div>\r\n");
          out.write("\t\t            <div class=\"simform__actions\">\r\n");
          out.write("\t\t              <input class=\"sumbit\" id=\"submit\"  type=\"submit\" value=\"Log In\" />\r\n");
          out.write("\t\t              <span class=\"simform__actions-sidetext\"><a class=\"special\" role=\"link\" href=\"#\">Forgot your password?<br>Click here</a></span>\r\n");
          out.write("\t\t            </div> \r\n");
          out.write("\t\t        </div> \r\n");
          out.write("\r\n");
          out.write("\t\t          </div>\r\n");
          out.write("\t\t      </div>\r\n");
          out.write("\t\t    </div>\r\n");
          out.write("\t\t  </div>\r\n");
          out.write("\t\t</div>\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
