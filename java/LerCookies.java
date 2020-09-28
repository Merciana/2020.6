import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LerCookies")
public class LerCookies extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Cookie c[] = request.getCookies();

        String nome, valor;

        if (c != null){
            for (int i = 0; i < c.length; i++){
                nome = c[i].getName();
                valor = c[i].getValue();
                out.println("nome: " + nome + "valor: " + valor);
            }
        }
    }
}
