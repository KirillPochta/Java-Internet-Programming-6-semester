import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

public class Jjj extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/index.html";


        HttpSession session = request.getSession();
        Date date = new Date();
        if(date.getHours() <= 12 && date.getHours() >= 4){
            path = "/jsp/morning.jsp";
        }
        else if(date.getHours() > 12 && date.getHours() <= 18){
            path = "/jsp/afternoon.jsp";

        }
        else if(date.getHours() > 18 && date.getHours() <= 23) {
            path = "/jsp/evening.jsp";
        }
        else if(date.getHours() > 23 || date.getHours() < 4){
            path = "/jsp/night.jsp";

        }

        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/index.html";


        HttpSession session = request.getSession();
        Date date = new Date();
        if(date.getHours() <= 12 && date.getHours() >= 4){
            path = "/jsp/morning.jsp";
        }
        else if(date.getHours() > 12 && date.getHours() <= 18){
            path = "/jsp/afternoon.jsp";

        }
        else if(date.getHours() > 18 && date.getHours() <= 23) {
            path = "/jsp/evening.jsp";
        }
        else if(date.getHours() > 23 || date.getHours() < 4){
            path = "/jsp/night.jsp";

        }

        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }
}
