package com.service;

import com.pojo.Customer;


import java.util.List;

public interface CustomerService {

    //增加功能
    int addCustomer(Customer customer);
    //删除功能
    int delectCustomer(int id);
    //修改功能
    int updateCustomer(Customer customer);
    //查询功能
    List<Customer> selectCustomer();
    //根据id查询
    Customer selectCusById(int id);

}
