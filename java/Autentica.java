import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Autentica" , urlPatterns = "/autentica")
public class Autentica extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var emial = request.getParameter("email");
        var senha = request.getParameter("senha");

        ServletContext servletContext = getServletContext();
        List<Usuario> usuarioList = (ArrayList<Usuario>) servletContext.getAttribute("usuario");
        List<String> tokenList = (ArrayList<String>) servletContext.getAttribute("token");

        var wather = false;
        for (var usuario:usuarioList) {

            if (usuario.getEmail.equals(emial) && usuario.getSenha.equals(senha)){
                wather = true;
                var token = usuario.getemail() + usuario.getSenha();
                Cookie cookie = new Cookie("autenticar", token);
                response.addCookie(cookie);
                tokenList.add(token);
                servletContext.setAttribute("token", tokenList);

                var dispatcher = request.getRequestDispatcher("/user/hello.html");
                dispatcher.forward(request, response);
            }
        }
        if (wather == false){
            response.sendRedirect("http://login.html");
            //Não fiz teste pois meu "var" não está sendo reconhecido, dessa forma da erro!
        }
    }
}
