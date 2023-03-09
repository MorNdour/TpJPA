package sn.ept.git.dic2.hellodic2;

import java.io.*;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = "/bonjour")
public class HelloServlet extends HttpServlet {
    private String message;
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String PathInfo = request.getContextPath();
        String prenom = request.getParameter("prenom");

        String jpqlRequest = "SELECT e FROM Eleve e";
        Query q = entityManager.createQuery(jpqlRequest);
        List<Eleve> eleves = q.getResultList();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message+" " + prenom +"</h1>");
        out.println("Nombre d'eleves="+eleves.size());
        out.println("</body></html>");
    }

    public void destroy() {
    }
}