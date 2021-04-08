package top.crush.boot.servlet.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Crush
 * @date 2021/4/6
 * @dercsiption 自定义servlet，用http://localhost:8080/first访问
 */
@WebServlet(name = "customServlet",urlPatterns = {"/first"})
@Slf4j
public class CustomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("This is a customServlet");
    }
}

