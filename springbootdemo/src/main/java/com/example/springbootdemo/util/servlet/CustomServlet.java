package com.example.springbootdemo.util.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 应用servlet:方法一
 */
@WebServlet(name = "customServlet",urlPatterns = "/servletType1")
public class CustomServlet extends HttpServlet {
    private static final Logger log = LogManager.getLogger(CustomServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("enter the get method");
//        super.doGet(req, resp);
        resp.getWriter().write("enter get method; hello word!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("enter the post method");
        resp.getWriter().write("enter post method; hello word!!");
    }
}
