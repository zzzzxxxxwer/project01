package com.bh.servlet;

import com.bh.pojo.Customer;
import com.bh.service.CustomerService;
import com.bh.utils.DateFormat;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * servlet--查找所有客户
 */
@WebServlet(name = "FindAllCustomerServlet", urlPatterns = "/findAll")
public class FindAllCustomerServlet extends HttpServlet {
    @Autowired
    private CustomerService customerService;      //自动注入CustomerService
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.findAll();
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("list.jsp").forward(req,resp);    //成功后转发到list页面
    }
}
