import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/DeconnexionServlet")
public class DeconnexionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer la session
        HttpSession session = request.getSession();
        
        // Déconnecter l'utilisateur en supprimant le compte de la session
        session.removeAttribute("compteConnecte");
        
        // Rediriger vers la page de connexion
        response.sendRedirect("Vue_Connecter");
    }
}
