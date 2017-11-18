package package1;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import ir.tf_idf1;
import ir.summarization;
/**
 * @author Crunchify.com
 */
 
public class file1 extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
    
        String query = request.getParameter("query");
        
        PrintWriter out = response.getWriter();
        String output="<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                "http://www.w3.org/TR/html4/loose.dtd\">\n" +
            "<html> \n" +
              "<head><style>@import \"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\";\n" + 
              "\n" + 
              ".container { margin-top: 20px; }\n" + 
              ".mb20 { margin-bottom: 20px; } \n" + 
              "\n" + 
              "hgroup { padding-left: 15px; border-bottom: 1px solid #ccc; }\n" + 
              "hgroup h1 { font: 500 normal 1.625em \"Roboto\",Arial,Verdana,sans-serif; color: #2a3644; margin-top: 0; line-height: 1.15; }\n" + 
              "hgroup h2.lead { font: normal normal 1.125em \"Roboto\",Arial,Verdana,sans-serif; color: #2a3644; margin: 0; padding-bottom: 10px; }\n" + 
              "\n" + 
              ".search-result .thumbnail { border-radius: 0 !important; }\n" + 
              ".search-result:first-child { margin-top: 0 !important; }\n" + 
              ".search-result { margin-top: 20px; }\n" + 
              ".search-result .col-md-2 { border-right: 1px dotted #ccc; min-height: 140px; }\n" + 
              ".search-result ul { padding-left: 0 !important; list-style: none;  }\n" + 
              ".search-result ul li { font: 400 normal .85em \"Roboto\",Arial,Verdana,sans-serif;  line-height: 30px; }\n" + 
              ".search-result ul li i { padding-right: 5px; }\n" + 
              ".search-result .col-md-7 { position: relative; }\n" + 
              ".search-result h3 { font: 500 normal 1.375em \"Roboto\",Arial,Verdana,sans-serif; margin-top: 0 !important; margin-bottom: 10px !important; }\n" + 
              ".search-result h3 > a, .search-result i { color: #248dc1 !important; }\n" + 
              ".search-result p { font: normal normal 1.125em \"Roboto\",Arial,Verdana,sans-serif; } \n" + 
              ".search-result span.plus { position: absolute; right: 0; top: 126px; }\n" + 
              ".search-result span.plus a { background-color: #248dc1; padding: 5px 5px 3px 5px; }\n" + 
              ".search-result span.plus a:hover { background-color: #414141; }\n" + 
              ".search-result span.plus a i { color: #fff !important; }\n" + 
              ".search-result span.border { display: block; width: 97%; margin: 0 15px; border-bottom: 1px dotted #ccc; }</style> \n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                  "charset=ISO-8859-1\"> \n" +
              "</head> \n" +
              "<body bgcolor='#E03A29'> <div align='center'> \n" +
                "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                  "Query: " + query + " <br> " + 
              "</font></body> \n" +
            "</html>" ;
        out.println (
                  
                );      
        }
}