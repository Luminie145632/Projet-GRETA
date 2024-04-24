import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_d_entrée")
public class Servlet_d_entrée extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet_d_entrée() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/webapp/Vue_Connecter.jsp").forward(request, response);
    }

}