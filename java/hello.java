import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "hello", urlPatterns = "/hello")
public class hello extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("deu certo");

        ServletContext servletContext = getServletContext();

        List<Usuario> usuarioList = (ArrayList<Usuario>) servletContext.getAttribute("usuarios");

        for (var u:usuarioList){
            response.getWriter().println(u.toStrig());
        }
    }
}
