/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2016-01-20 16:17:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.aperto.brainbnb.dto.User;

public final class startpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.aperto.brainbnb.dto.User");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Aperto | BrainBnB</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/startpage.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel='stylesheet' href=\"resources/font/ApertoAGReg\" type='text/css'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"theme.blue.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"print, projection, screen\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-1.11.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.tablesorter.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#tab\").tablesorter({\r\n");
      out.write("\t\t\tsortList : [ [ 0, 0 ], [ 2, 1 ] ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\".tablesorter\").tablesorter({\r\n");
      out.write("\t\t// *** Appearance ***\r\n");
      out.write("\t\t// fix the column widths\r\n");
      out.write("\t\twidthFixed : true,\r\n");
      out.write("\t\t// include zebra and any other widgets, options:\r\n");
      out.write("\t\t// 'uitheme', 'filter', 'stickyHeaders' & 'resizable'\r\n");
      out.write("\t\t// the 'columns' widget will require custom css for the\r\n");
      out.write("\t\t// primary, secondary and tertiary columns\r\n");
      out.write("\t\twidgets : [ 'uitheme', 'zebra' ],\r\n");
      out.write("\t\t// other options: \"ddmmyyyy\" & \"yyyymmdd\"\r\n");
      out.write("\t\tdateFormat : \"mmddyyyy\",\r\n");
      out.write("\r\n");
      out.write("\t\t// *** Functionality ***\r\n");
      out.write("\t\t// starting sort direction \"asc\" or \"desc\"\r\n");
      out.write("\t\tsortInitialOrder : \"asc\",\r\n");
      out.write("\t\t// These are detected by default,\r\n");
      out.write("\t\t// but you can change or disable them\r\n");
      out.write("\t\theaders : {\r\n");
      out.write("\t\t\t// set \"sorter : false\" (no quotes) to disable the column\r\n");
      out.write("\t\t\t0 : {\r\n");
      out.write("\t\t\t\tsorter : \"text\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t1 : {\r\n");
      out.write("\t\t\t\tsorter : \"digit\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t2 : {\r\n");
      out.write("\t\t\t\tsorter : \"text\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t3 : {\r\n");
      out.write("\t\t\t\tsorter : \"url\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t// forces the user to have this/these column(s) sorted first\r\n");
      out.write("\t\tsortForce : null,\r\n");
      out.write("\t\t// initial sort order of the columns\r\n");
      out.write("\t\t// [[columnIndex, sortDirection], ... ]\r\n");
      out.write("\t\tsortList : [],\r\n");
      out.write("\t\t// default sort that is added to the end of the users sort\r\n");
      out.write("\t\t// selection.\r\n");
      out.write("\t\tsortAppend : null,\r\n");
      out.write("\t\t// Use built-in javascript sort - may be faster, but does not\r\n");
      out.write("\t\t// sort alphanumerically\r\n");
      out.write("\t\tsortLocaleCompare : false,\r\n");
      out.write("\t\t// Setting this option to true will allow you to click on the\r\n");
      out.write("\t\t// table header a third time to reset the sort direction.\r\n");
      out.write("\t\tsortReset : false,\r\n");
      out.write("\t\t// Setting this option to true will start the sort with the\r\n");
      out.write("\t\t// sortInitialOrder when clicking on a previously unsorted column.\r\n");
      out.write("\t\tsortRestart : false,\r\n");
      out.write("\t\t// The key used to select more than one column for multi-column\r\n");
      out.write("\t\t// sorting.\r\n");
      out.write("\t\tsortMultiSortKey : \"shiftKey\",\r\n");
      out.write("\r\n");
      out.write("\t\t// *** Customize header ***\r\n");
      out.write("\t\tonRenderHeader : function() {\r\n");
      out.write("\t\t\t// the span wrapper is added by default\r\n");
      out.write("\t\t\t$(this).find('span').addClass('headerSpan');\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// jQuery selectors used to find the header cells.\r\n");
      out.write("\t\tselectorHeaders : 'thead th',\r\n");
      out.write("\r\n");
      out.write("\t\t// *** css classes to use ***\r\n");
      out.write("\t\tcssAsc : \"headerSortUp\",\r\n");
      out.write("\t\tcssChildRow : \"expand-child\",\r\n");
      out.write("\t\tcssDesc : \"headerSortDown\",\r\n");
      out.write("\t\tcssHeader : \"header\",\r\n");
      out.write("\t\ttableClass : 'tablesorter',\r\n");
      out.write("\r\n");
      out.write("\t\t// *** widget css class settings ***\r\n");
      out.write("\t\t// column classes applied, and defined in the skin\r\n");
      out.write("\t\twidgetColumns : {\r\n");
      out.write("\t\t\tcss : [ \"primary\", \"secondary\", \"tertiary\" ]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// find these jQuery UI class names by hovering over the\r\n");
      out.write("\t\t// Framework icons on this page:\r\n");
      out.write("\t\t// http://jqueryui.com/themeroller/\r\n");
      out.write("\t\twidgetUitheme : {\r\n");
      out.write("\t\t\tcss : [ \"ui-icon-arrowthick-2-n-s\", // Unsorted icon\r\n");
      out.write("\t\t\t\"ui-icon-arrowthick-1-s\", // Sort up (down arrow)\r\n");
      out.write("\t\t\t\"ui-icon-arrowthick-1-n\" // Sort down (up arrow)\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// pick rows colors to match ui theme\r\n");
      out.write("\t\twidgetZebra : {\r\n");
      out.write("\t\t\tcss : [ \"ui-widget-content\", \"ui-state-default\" ]\r\n");
      out.write("\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t// *** prevent text selection in header ***\r\n");
      out.write("\t\tcancelSelection : true,\r\n");
      out.write("\r\n");
      out.write("\t\t// *** send messages to console ***\r\n");
      out.write("\t\tdebug : false\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- NAVBAR -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"resources/img/aperto-logo.svg\" alt=\"Aperto\" align=\"left\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"114px\" height=\"21px\" />\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"user-images\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"resources/img/User_Bild_2.png\" width=\"50px\" height=\"40px\" />\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"> ");
	User user = (User) session.getAttribute("user");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(user.getUserName());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"vertical-separator\">|</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"LogoutServlet\"> Log out </a></li> \r\n");
      out.write("\t\t\t\t\t\t<li class=\"vertical-separator\">|</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"> EN </a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- MAIN -->\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t<h2>Projects summary</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- SEARCH CONTAINER -->\r\n");
      out.write("\t\t<form class=\"search-container\">\r\n");
      out.write("\t\t\t<!-- <label for=\"search-box\"> <span class=\"glyphicon glyphicon-search search-icon\"></span> </label>  -->\r\n");
      out.write("\t\t\t<input class=\"search-box\" type=\"search\" placeholder=\"Search\" />\r\n");
      out.write("\t\t\t<!-- <input type= \"submit\" id= \"search-submit\" />  -->\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- PROJECT TABLE -->\r\n");
      out.write("\t\t<form action=\"login\" method=\"post\">\r\n");
      out.write("\t\t<div id=\"div-table\">\r\n");
      out.write("\t\t\t<table id=\"tab\" class=\"tablesorter table-condensed table-responsive\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>No.</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Start</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Role</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Status</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td><a type = \"submit\"> #0001 </a></td>\r\n");
      out.write("\t\t\t\t\t\t<td>Synfioo</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <!-- <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p> --></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("<!-- \t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0002</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Creative Workline GmbH</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0003</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Kinderladen Plappertasche</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0004</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Lasinoh Laboratories Inc.</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0005</td>\r\n");
      out.write("\t\t\t\t\t\t<td>artLABOR e.V</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0006</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Aperto AG</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Project Manager</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0007</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Aperto Move GmbH</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0008</td>\r\n");
      out.write("\t\t\t\t\t\t<td>imatics Software GmbH</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0009</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Keylight GmbH</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>#0010</td>\r\n");
      out.write("\t\t\t\t\t\t<td>proventis GmbH</td>\r\n");
      out.write("\t\t\t\t\t\t<td>01-01-2016</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Observer</td>\r\n");
      out.write("\t\t\t\t\t\t<td>IN PROCESS</td>\r\n");
      out.write("\t\t\t\t\t\t<td><progress value=\"21\" max=\"100\"></progress> <div class=\"progress-bar\"> <span style= \"width:3%\"></span> </div><p></p></td>\r\n");
      out.write("\t\t\t\t\t</tr> -->\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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