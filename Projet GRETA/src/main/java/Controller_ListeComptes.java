import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Controller_ListeComptes")
public class Controller_ListeComptes extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/compte";
            String utilisateur = "root";
            String motDePasse = "";
            conn = DriverManager.getConnection(url, utilisateur, motDePasse);

            String selectQuery = "SELECT id, login, password FROM liste_des_comptes_utilisateurs";
            stmt = conn.prepareStatement(selectQuery);
            rs = stmt.executeQuery();

            // Stocker les résultats dans une liste de comptes
            List<Compte> comptesList = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("id");
                String login = rs.getString("login");
                String password = rs.getString("password");
                comptesList.add(new Compte(id, login, password));
            }

            // Ajouter la liste des comptes à l'attribut de la requête
            request.setAttribute("comptesList", comptesList);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Erreur lors de la récupération des comptes : " + e.getMessage());
        } finally {
            // Fermeture des ressources
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        // Redirection vers la page JSP qui affichera la liste des comptes
        request.getRequestDispatcher("Vue_Liste.jsp").forward(request, response);
    }
}
