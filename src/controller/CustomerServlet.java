package controller;

import model.Customer;
import service.ListCustomer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    ListCustomer listCustomer=new ListCustomer();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       showCustomer(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showCustomer(request,response);
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) {
        listCustomer.createCustomer();
        List<Customer> customerList=listCustomer.findAll();
        request.setAttribute("customers",customerList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("ShowCustomers.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

