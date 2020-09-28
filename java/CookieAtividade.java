import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieAtividade")
public class CookieAtividade extends HttpServlet {
   private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie c1 = new Cookie("1", "hehe");
        Cookie c2 = new Cookie("2", "chato");
        Cookie c3 = new Cookie("3", "legal");
        Cookie c4 = new Cookie("4", "bravo");
        Cookie c5 = new Cookie("5", "alegre");

        c3.setMaxAge(15);
        c4.setMaxAge(25);
        c5.setMaxAge(35);

        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        response.addCookie(c4);
        response.addCookie(c5);
    }
}
