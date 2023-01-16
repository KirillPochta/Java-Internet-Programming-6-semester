import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;

public class Bbb extends HttpServlet implements Servlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String s;
        response.setContentType("text/html");
        response.addHeader("Bbb-Header-1", "Bbb-Header-Value-1");
        response.addHeader("Bbb-Header-2", "Bbb-Header-Value-2");
        Enumeration enr = request.getParameterNames();
        response.getWriter().println("<h1>request parameters</h1>");

        while (enr.hasMoreElements()) {
            s = (String) enr.nextElement();
            pw.println("<br />" + s + "= " + request.getParameter(s));
        }
        Enumeration enh = request.getHeaderNames();
        response.getWriter().println("<h1></br>request headers</h1>");

        while (enh.hasMoreElements()) {
            s = (String) enh.nextElement();
            pw.println("<br />" + s + "= " + request.getHeader(s));
        }

        Collection<String> rsHead = response.getHeaderNames();
        response.getWriter().println("<h1></br>response headers</h1>");
        for(String header:rsHead){
            pw.println("<br/>" + header + ": " + response.getHeader(header));
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
