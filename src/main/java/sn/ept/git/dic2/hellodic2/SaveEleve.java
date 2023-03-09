package sn.ept.git.dic2.hellodic2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SaveEleve", value = "/SaveEleve")
public class SaveEleve extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String prenom = request.getParameter("prenom");
      String nom = request.getParameter("nom");
      String poids =request.getParameter("poids");

        Eleve eleve = new Eleve();
        eleve.setPrenom(prenom);
        eleve.setNom(nom);
        eleve.setPoids(Double.parseDouble(poids));

        System.out.println(eleve);

        request.getRequestDispatcher("ok.html").forward(request, response);
    }
}
