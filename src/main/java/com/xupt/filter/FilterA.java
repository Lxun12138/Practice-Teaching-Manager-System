package com.xupt.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Auther: liuxun
 * @Date: 2019/3/13
 * @Description:
 */
public class FilterA  implements javax.servlet.Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;

        String flag=(String)request.getSession().getAttribute("a");
        if(flag != null && flag.equals("ok")){
            System.out.println("登录OK--------------->");
            filterChain.doFilter(request,response);
        }else {
            System.out.println("---------->失败");
            request.setAttribute("errors","该用户无权访问该目录");
            RequestDispatcher rd=request.getRequestDispatcher("views/error.jsp");
            rd.forward(request,response);
        }
    }

    public void destroy() {

    }
}
