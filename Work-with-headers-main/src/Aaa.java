import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

public class Aaa extends HttpServlet implements Servlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpClient hc = new HttpClient();
        String uri = "http://localhost:8080/lab16_war_exploded/Bbb";
        PostMethod pm = new PostMethod(uri);
        pm.addRequestHeader("1-My-Header", "1-My-Header-Value");
        pm.addRequestHeader("2-My-Header", "2-MyHeader-Value");
        pm.addRequestHeader("3-My-Header", "3-MyHeader-Value");
        String s;
        Enumeration enr = request.getParameterNames();

        while (enr.hasMoreElements()) {
            s = (String) enr.nextElement();
            pm.addParameter(s, request.getParameter(s));
        }
        hc.executeMethod(pm);
        response.setContentType("text/html");
        InOutServlet inout = new InOutServlet(response.getOutputStream(), pm.getResponseBodyAsStream());
        inout.perform();

        //Map<String, List<String>>   test;
    }
}
