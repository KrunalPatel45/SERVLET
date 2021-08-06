import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
public class HttpS1 extends HttpServlet 
{
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
        {
            
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<center><br><h1>KRUNAL PATEL</h1></center>");
            
        }
}
