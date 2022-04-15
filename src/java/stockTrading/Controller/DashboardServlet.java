/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockTrading.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Float.parseFloat;
import java.util.LinkedHashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import stockTrading.Dao.StocksNames;

/**
 *
 * @author Hp
 */
@WebServlet("/Dashboard")
public class DashboardServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    StocksNames sn=new StocksNames();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DashboardServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DashboardServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        float t_inv_amt=0;
        LinkedHashMap<String,String> result = sn.getAllHoldings2((String)session.getAttribute("UserName"));
        if(result!=null)
        {
            System.out.println("TAIV2 "+result.get("invAmt"));
            t_inv_amt = parseFloat(result.get("invAmt"));
        
            request.setAttribute("investedAmount",t_inv_amt);
            request.setAttribute("allSymbols",result.get("allsym"));
            request.setAttribute("fordonut",result.get("allCost"));
            result.remove("allCost");
            result.remove("allsym");
            request.setAttribute("HoldingDetails",result);
            String ambi=(String)session.getAttribute("UserName");
            System.out.println(ambi);
            RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.jsp?msg=Nostocks");
            rd.forward(request, response);
        }
        else
        {
            response.sendRedirect("/StockTrading/Dashboard.jsp");
        }
        //response.sendRedirect("/StockTrading/Dashboard.jsp");
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
