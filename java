package Backend; 
  
 ​import java.io.IOException; 
 ​import java.io.PrintWriter; 
 ​import javax.servlet.ServletException; 
 ​import javax.servlet.annotation.WebServlet; 
 ​import javax.servlet.http.HttpServlet; 
 ​import javax.servlet.http.HttpServletRequest; 
 ​import javax.servlet.http.HttpServletResponse; 
  
 ​@WebServlet("/DataFromUser") 
 ​public class DataFromUser extends HttpServlet { 
 ​        private static final long serialVersionUID = 1L; 
  
 ​        /** 
 ​         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
 ​         */ 
 ​        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
 ​                        throws ServletException, IOException { 
 ​                response.setContentType("text/html"); 
 ​                PrintWriter out=null; 
 ​                try 
 ​                { 
 ​                        out=response.getWriter(); 
 ​                        String sender=request.getParameter("email"); 
 ​                        String password=request.getParameter("password"); 
 ​                        String receiver=request.getParameter("receiver"); 
 ​                        String subject=request.getParameter("subject"); 
 ​                        String message=request.getParameter("message"); 
 ​                         
 ​                        //out.print(sender+" "+password+" "+receiver+" "+subject+" "+message); 
 ​                        Mailer mailer=new Mailer(); 
 ​                        boolean status=mailer.mailSending(sender,password,receiver, subject, message); 
 ​                        if(status==true) 
 ​                                out.println("<h1>Mail sent success</h1>"); 
 ​                        else 
 ​                                out.print("<h1>failed to send a mail</h1>"); 
 ​                } 
 ​                catch(Exception e) 
 ​                { 
 ​                        System.out.println(e); 
 ​                } 
 ​                 
 ​        } 
  
 ​}
