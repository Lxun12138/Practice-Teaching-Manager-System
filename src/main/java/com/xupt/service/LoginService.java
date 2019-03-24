package com.xupt.service;

import com.xupt.entity.Employee;

/**
 * @Auther: liuxun
 * @Date: 2019/3/13
 * @Description:
 */
public interface LoginService {

    public Integer checkStatus(Employee employee);

    public Employee checkLogin(Employee employee);



}
