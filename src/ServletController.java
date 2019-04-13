import cms.Customer;
import cms.ListCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletController", urlPatterns = "/control_1")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ListCustomer.createCustomer();
        Customer mycustomer=ListCustomer.getCustomer(1);

        String url=mycustomer.getImg();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println(mycustomer.getImg());
        writer.println("<img src=\""+mycustomer.getImg()+"\">");
        writer.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
