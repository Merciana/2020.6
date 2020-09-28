import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class IniciaListaUsuario implements ServletContextListener{

    public IniciaListaUsuario() {
    }

    public void contextInitialized(ServletContextEvent sce) {
        var Usuario1 = new  Usuario(1, "Mercina", "merciana.goncalves@gmail.com", "3549514");
        var Usuario2 = new  Usuario(2, "Luana", "Luana02@gmail.com", "315542");
        var Usuario3 = new  Usuario(3, "Juana", "Juanaohsk12@gmail.com", "85456");
        var Usuario4 = new  Usuario(4, "joana", "joana45dhj@gmail.com", "86476");

        List<Usuario> usuariosList = new ArrayList<>();
        usuariosList.add(Usuario1);
        usuariosList.add(Usuario2);
        usuariosList.add(Usuario3);
        usuariosList.add(Usuario4);

        List<String> tokenList = new ArrayList<>();

        ServletContext serveletcontext = sce.getServletContext();
        serveletcontext.setAttribute("usuarios", usuariosList);
        serveletcontext.setAttribute("token", tokenList);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
