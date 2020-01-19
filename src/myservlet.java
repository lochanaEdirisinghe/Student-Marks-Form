import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/markscalculator")
public class myservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String marks = req.getParameter("marks");
        int marksInt = Integer.parseInt(marks);
        System.out.println(marksInt);
        String result;
        if(marksInt==0 | marksInt<=35){
            result = "F";
        }else if(marksInt>35 && marksInt<=55){
            result = "C";
        }else if(marksInt>55 && marksInt<=65){
            result = "B";
        }else {
            result = "A";
        }
        PrintWriter writer = resp.getWriter();
        writer.println(result);


    }
}
