package com.rizalpurnama.webnoframework.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/perusahaan/list")
public class DaftarPerusahaan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        PrintWriter output = resp.getWriter();

        output.println(
                "<html>" +
                    "<head> " +
                       "<title>Daftar Perusahaan</title>" +
                    "</head> ");

        output.println("" +
                    "<body>" +
                        "<h2>Daftar Perusahaan</h2>" +
                    "</body>" +
                "</html>");

        output.close();
    }
}
