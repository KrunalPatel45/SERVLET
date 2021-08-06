import jakarta.servlet.*;
import java.io.*;
public class Demo2 extends GenericServlet
{

    
    public void service(ServletRequest req ,ServletResponse res) throws ServletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<center><h1>My Second Program</h1></centers>");
        
        
    }
    
}
