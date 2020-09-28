import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Main"} ,
            initParams = {
                    @WebInitParam(name = "nome", value = "Merciana"),
                    @WebInitParam(name = "email", value = "merciana.goncalves@gmail.com")
            }
    )
public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String firstName;
    String emailAddress;
    String tads;

    public void init(){
        ServletConfig config = getServletConfig();
        firstName = config.getInitParameter("name");
        emailAddress = config.getInitParameter("email");
        tads = context.getInitParameter("TADS");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text//html");
        PrintWriter out = response.getWriter();
        out.println(firstName + "<br>" + emailAddress + "<br>" + tads);
    }
}
