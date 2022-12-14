
package ca.sait.lab6.servlets;

import ca.sait.lab6.models.User;
import ca.sait.lab6.services.UserService;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author evand
 */
public class UserServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserService service = new UserService();
        
        
        List<User> users = service.getAll();
        
        request.setAttribute("users", users);
           this.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
        
        
        
   
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    

}
