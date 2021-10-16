package by.tms;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");

        if (Check.isNumeric(num1)) {  // Вызов методов проверки на число и стринг
            if (Check.isNumeric(num2)) {
                if (Check.checkString(operation)) {
                    double n1 = Double.parseDouble(num1);
                    double n2 = Double.parseDouble(num2);
                    resp.getWriter().println("Result - " + Service.selection(operation, n1, n2));
                } else {
                    resp.getWriter().println(operation + " Error, write one of the values to the parameter:\n" +
                            "sum\ndiv\nsubtrack\nmultiply");
                }
            } else {
                resp.getWriter().println("Parameter '" + num2 + "' not number.");
            }
        } else {
            resp.getWriter().println("Parameter '" + num1 + "' not number.");
        }
    }
}