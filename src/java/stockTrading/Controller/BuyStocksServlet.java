/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockTrading.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import stockTrading.Dao.StocksNames;
import stockTrading.Model.HoldingsDetails;

/**
 *
 * @author Hp
 */
@WebServlet("/Bought")
public class BuyStocksServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    StocksNames sn = new StocksNames();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BuyStocksServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuyStocksServlet at " + request.getContextPath() + "</h1>");
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
        HttpSession session=request.getSession();
        HoldingsDetails Hd=new HoldingsDetails();
        System.out.println("Symbol fetch" + request.getParameter("Ssym"));
        Hd.setSymbol(request.getParameter("Ssym"));
        System.out.println("Symbol fetch" + Hd.getSymbol());
        System.out.println("In req "+ request.getParameter("Quantity"));
        
        //Hd.setQuantity(parseInt(request.getParameter("Quantity")));
        Hd.setQuantity(parseInt(request.getParameter("Quantity")));
        Hd.setAmount(parseFloat(request.getParameter("Amount").substring(1)));
        Hd.setUserid((String) session.getAttribute("UserName"));
        System.out.println("Testing "+Hd.getUserid());
        Hd.setBuyDate(request.getParameter("Date"));
        Hd.setBuyPrice(Hd.getAmount()/Hd.getQuantity());
        Hd.setStockName(sn.FindName(Hd.getSymbol()));
        
        sn.BuyHoldings(Hd);
        response.sendRedirect("/StockTrading/Buy?msg=success");
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
