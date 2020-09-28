import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdicionaCarrinho", urlPatterns = {"/adicionarCarrinho"})
public class AdicionaCarrinho extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var id = request.getParameter("id");
        response.getWriter().println(id);
    }
}
