import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebFilter("/user/*")
public class FilterLogin implements Filter {

    FilterConfig fc;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        Cookie[] cookies= ((HttpServletRequest) req).getCookies();
        ServletContext.servletContext = fc.getServletContext();
        List<String> tokens = (ArrayList<String>) servletContext.getAtribute("token");

        for (var c:cookies) {
            if (c.getName().equals("autentica")){
                for (var i:tokens) {
                    if(i.equals(c.getValue())){
                        chain.doFilter(req, resp);

                    }
                }
            }
        }

        ((HttpServletResponse) resp).sendRedirect("http://localhost:.../.../login.htlm");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
