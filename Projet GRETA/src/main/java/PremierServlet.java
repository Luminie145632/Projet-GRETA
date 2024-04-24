import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/PremierServlet")
public class PremierServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PremierServlet() {
        // Constructeur vide
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String hours = request.getParameter("hours");

        if (name == null || name.isEmpty()) {
            name = "NULL";
        }
        
        else if (name != null || name.isEmpty()) {
        }

        if (hours == null || hours.isEmpty()) {
            hours = "NULL";
        }

        out.println("<p>Nom : " + name + "</p>");
        out.println("<p>NB heures : " + hours + "</p>");
    }

    @SuppressWarnings("unused")
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/Resultat.jsp").forward(request, response);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Form.jsp").forward(request, response);
    }
}
