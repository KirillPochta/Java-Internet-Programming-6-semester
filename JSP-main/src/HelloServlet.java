import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Date date = new Date();
        if(date.getHours() <= 12 && date.getHours() >= 4){
            session.setAttribute("time", " Good morning");
            session.setAttribute("page", "morning");
        }
        else if(date.getHours() > 12 && date.getHours() <= 18){

            session.setAttribute("time", "Good afternoon");
            session.setAttribute("page", "afternoon");
        }
        else if(date.getHours() > 18 && date.getHours() <= 23){

            session.setAttribute("time", "Good evening");
            session.setAttribute("page", "evening");
        }
        else if(date.getHours() > 23 || date.getHours() < 4){

            session.setAttribute("time", "Good night");
            session.setAttribute("page", "night");
        }


        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}