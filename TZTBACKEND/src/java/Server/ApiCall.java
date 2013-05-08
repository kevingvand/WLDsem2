package Server;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Action.*;
import com.google.gson.Gson;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Daniel
 */
@WebServlet(urlPatterns = {"/ApiCall"})
public class ApiCall extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        session.setAttribute("login", true);
        HttpResponse r = null;
        try {
            String classname = request.getParameter("action").substring(3);
            Action a = (Action) Class.forName("Actions."+ classname).newInstance();
            a.load(request);
            String type = request.getParameter("action").substring(0, 3);
            
            if(type.equals("get")) {
                Object returnObj = a.get();
                r = new HttpResponse(200,returnObj);
            } else if (type.equals("set")) {
                boolean saved = a.set();
                r = new HttpResponse(200,saved);
            }
        } catch (Exception ex) {
            Logger.getLogger(ApiCall.class.getName()).log(Level.SEVERE, null, ex);
            r = new HttpResponse(500,ex.toString());
        } finally {
            out.println(r);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
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
