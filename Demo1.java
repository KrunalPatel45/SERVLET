
import jakarta.servlet.*;
import java.io.*;
public class Demo1 extends GenericServlet
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<center><h1>MY FIRST PROGRAM</h2></center>");
        }
    
       
    
    
}
