package com.xupt.controller;

import com.xupt.entity.Employee;
import com.xupt.service.LoginService;
import com.xupt.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: liuxun
 * @Date: 2019/3/13
 * @Description:
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(Employee employee, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,Model model) throws Exception{


        employee.setEmpPass(MD5Utils.md5Code(employee.getEmpNo()+employee.getEmpPass()));

        Employee employeeLogin=loginService.checkLogin(employee);
        if(employeeLogin != null){

            httpServletRequest.setAttribute("loginEmployee",employeeLogin);

            if(employeeLogin.getEmpFlag()==0){
                return "";
            }else if(employeeLogin.getEmpFlag() ==1 ){
                return "";

            }else if(employeeLogin.getEmpFlag() == 2){
                return "";
            }else if(employeeLogin.getEmpFlag() == 3){
                return "";
            }else {
                return "";
            }
        }

        return "";
    }
}
