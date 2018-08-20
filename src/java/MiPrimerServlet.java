
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Primero debemos extender de httpServlet
public class MiPrimerServlet extends HttpServlet{
    
    // get
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Holi :)");
    }
}
