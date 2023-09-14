package servlets;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import map.Tech;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/* 
 *si tomcat < version 10 ===> jakarta=javax
 => import javax.servlet.*
*/

public class JSONServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException { 
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();

            Tech tech=new Tech();
            try {
                ArrayList<Tech> techArray=tech.allTechs();

                Gson gson=new Gson();
                String techJSON=gson.toJson(techArray);
  
                out.write(techJSON);
                out.close();

            } catch (Exception e) {
                out.println(e.getMessage());
                out.write("error-db");
                out.close();
            }
    }
}
