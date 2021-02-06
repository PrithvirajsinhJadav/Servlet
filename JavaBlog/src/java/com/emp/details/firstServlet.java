/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.details;
import java.io.IOException;
import javax.servlet.*;

/**
 *
 * @author Prithvirajsinh Jadav
 */
public class firstServlet implements javax.servlet.Servlet {
    
    ServletConfig conf;
    public void init(ServletConfig conf){
    this.conf = conf;
        System.out.println("Creating Object......");
    }
   
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
        System.out.println("SErvicing.....");
    }
    public void destroy(){
    System.out.println("goiing to destroy.....");
            }

    @Override
    public ServletConfig getServletConfig() {
//        throw new UnsupportedOperationException("Not supported yet."); 
        return this.conf;

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServletInfo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return "THis si the demo servlet";
    }
    
}
