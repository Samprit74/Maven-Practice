package com.roy.source;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class EmployeeSearchServlet extends HttpServlet {

    private static final String GET_EMP_DETAILS_BY_NO =
            "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        PrintWriter pw = null;
        int eno = 0;

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ServletConfig cg = null;
        String driver = null, url = null, user = null, pwd = null;

        try {

            pw = res.getWriter();
            res.setContentType("text/html");

            eno = Integer.parseInt(req.getParameter("eno"));

            cg = getServletConfig();

            driver = cg.getInitParameter("driver");
            url = cg.getInitParameter("url");
            user = cg.getInitParameter("dbuser");
            pwd = cg.getInitParameter("dbpwd");

            pw.println("<b> searching and giving details </b>");

            Class.forName(driver);

            con = DriverManager.getConnection(url, user, pwd);

            ps = con.prepareStatement(GET_EMP_DETAILS_BY_NO);

            ps.setInt(1, eno);

            rs = ps.executeQuery();

            if (rs.next()) {

                pw.println("<h1> Employee Details are </h1>");
                pw.println("<b> empno ::: " + rs.getInt(1) + "<br>");
                pw.println("<b> emp name ::: " + rs.getString(2) + "<br>");
                pw.println("<b> emp JOB ::: " + rs.getString(3) + "<br>");
                pw.println("<b> emp SAL ::: " + rs.getString(4) + "<br>");
                pw.println("<b> emp DEPTNO ::: " + rs.getString(5) + "<br>");

            } else {

                pw.println("<h1 style='color:red'> Employee Not Found </h1>");
            }

            pw.println("<br><br> logical name of servlet :::" + cg.getServletName());
            pw.println("<br> ServletConfig obj class name :::" + cg.getClass());

        } catch (Exception e) {

            pw.println("<b> internal problem try again </b>");
            e.printStackTrace();

        } finally {

            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}

        }
    }
}