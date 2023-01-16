import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Sss_Header extends javax.servlet.http.HttpServlet
        implements  javax.servlet.Servlet {
    public Sss_Header() {
        super();
    }
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        System.out.println("Sss:doGet");
    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        System.out.println("Sss:doPost");
        System.out.println(rq.getHeader("Value-X"));
        System.out.println(rq.getHeader("Value-Y"));
        
        int task = Integer.parseInt(rq.getHeader("task"));

        if (task == 4) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        Float x = new Float(rq.getHeader("Value-X"));
        Float y = new Float(rq.getHeader("Value-Y"));
        Float z = x + y;
        System.out.println(z.toString());
        rs.setHeader("Value-Z", z.toString());
    }
}

