import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Hardcoded username and password for demonstration purposes
    private static final String EXPECTED_USERNAME = "Jocos";
    private static final String EXPECTED_PASSWORD = "joe";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals(EXPECTED_USERNAME) && password.equals(EXPECTED_PASSWORD)) {
            // Authentication successful, redirect to welcome page
            response.sendRedirect("welcome.html");
        } else {
            // Authentication failed, redirect to forgot password page
            response.sendRedirect("forgot_password.html");
        }
    }
}
