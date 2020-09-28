import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListaProdutos", urlPatterns = {"/ListaProdutos"})
public class ListaProdutos extends HttpServlet {

    List<Produtos> ListaProdutos;

    public ListaProdutos() {
        ListaProdutos = new ArrayList<>();
         var p1 = new Produtos(1, "boné", "Marrom", "15.0");
         var p2 = new Produtos(2, "camiseta", "Marrom", "20.0");
         var p3 = new Produtos(3, "blusa", "Marrom", "25.0");
         var p4 = new Produtos(4, "refrigerante", "Marrom", "5.0");
         var p5 = new Produtos(5, "sorvete", "Marrom", "2.0");

        ListaProdutos.add(p1);
        ListaProdutos.add(p2);
        ListaProdutos.add(p3);
        ListaProdutos.add(p4);
        ListaProdutos.add(p5);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var out = response.getWriter();
        response.setContentType();
        out.println ("<html>");
        out.println("<body>");
        out.pitnln("<table");
        out.println("<tr>");
        out.println("<th> id </th>");
        out.println("<th> nome </th>");
        out.println("<th> descrição </th>");
        out.println("<th> preço </th>");
        out.println("<tr>");
        for (var i : listaProdutos) {
            out.println("<tr>");
            out.println("<td>" + i.getId() + "</td>");
            out.println("<td>" + getNome() + "</td>");
            out.println("<td>" + getDescricao() + "</td>");
            out.println("<td>" + getpreco() + "</td>");
            out.println("<td> <a href='/adicionaCarrinho?id="+ i.getId()+ "'> Add </a> </td>");
            out.println("<tr>");
        }
        out.pitnln("<table");
        out.println("<body>");
        out.println("<html>");
    }
}
