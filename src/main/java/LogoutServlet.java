import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")//here your creating a logout "variable"
public class LogoutServlet extends HttpServlet {//in the code below is standard you will always need a request and response
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("user");//removing all info
        request.getSession().invalidate();//this wipes cookies and session which is important to server side
        response.sendRedirect("/login");//redirect to login

    }

}
