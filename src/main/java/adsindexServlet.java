import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class adsindexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //Use the factory get the dao object
        Ads adsDao = DaoFactory.getAdsDao();//creating instance to call information
        List<Ad> ads = adsDao.all();//this is the "call all the list items" request
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}



