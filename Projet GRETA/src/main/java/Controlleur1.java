import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/Controlleur1")
public class Controlleur1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private static final String Math = null;

    public Controlleur1() {
        // Constructeur vide
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String name = request.getParameter("Math");
        String hours = request.getParameter("hours");

        if (name == Math || name.isEmpty()) {
            name = "Math";
        } else {


        out.println("<p>Nom : " + name + "</p>");
        out.println("<p>NB heures : " + hours + "</p>");
    }

    @SuppressWarnings("unused")
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/Final.java").forward(request, response);
        this.getServletContext().getRequestDispatcher("/PremierServlet.java").forward(request, response);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Resultat.jsp").forward(request, response);
    }
}
