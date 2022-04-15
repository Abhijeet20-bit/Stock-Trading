/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockTrading.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stockTrading.Dao.StocksNames;
import stockTrading.Model.StockDetails;

/**
 *
 * @author Hp
 */
@WebServlet("/graph")
public class DashSearch extends HttpServlet {

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
            out.println("<title>Servlet DashSearch</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DashSearch at " + request.getContextPath() + "</h1>");
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
        
        String Sname=request.getParameter("Sname");
        String res=null;
        System.out.println(Sname);
        StockDetails sd=new StockDetails(Sname);
        try {
            res=sn.FindSymbol(sd);
            System.out.println("In");
        }
        catch(ClassNotFoundException e) {
            out.print(e);
        } catch (SQLException ex) {
            Logger.getLogger(DashSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(res.equals("Successfull"))
        {
            request.setAttribute("symbol",sd.getStockSymbol());
            request.setAttribute("stockname", sd.getStockName());
            System.out.println("Abhijeet "+ sd.getStockSymbol());
            RequestDispatcher rd=request.getRequestDispatcher("/Graph.jsp");
            rd.forward(request, response);
        }
        else 
        {
            response.sendRedirect("/StockTrading/Error.jsp?msg="+res);
        }
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
