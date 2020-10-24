package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Customer;
import com.service.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    @Qualifier("customerServiceImp")
    CustomerServiceImp customerServiceImp;

//    查询全部
    @RequestMapping("/sel2")
    @ResponseBody
public List<Customer> sel(){
        List<Customer> customerList=customerServiceImp.selectCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        return customerList;
    }
    //    查询全部
    @RequestMapping("/sel3")
    @ResponseBody
    public List<Customer> sel3(){
        List<Customer> customerList=customerServiceImp.selectCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

        return customerList;
    }
    //    查询全部
    @RequestMapping("/sel")
    @ResponseBody
    public String sel2() throws JsonProcessingException {
        List<Customer> customerList=customerServiceImp.selectCustomer();
        ObjectMapper objectMapper=new ObjectMapper();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());

        }

       String name= objectMapper.writeValueAsString(customerList);
        System.out.println("================");
        System.out.println(name);
        return name;
    }
//    查询（id）
    @RequestMapping("/selone")
    @ResponseBody
    public String selone(int id) throws JsonProcessingException {

        Customer customer = customerServiceImp.selectCusById(id);
        ObjectMapper objectMapper=new ObjectMapper();
        String one=objectMapper.writeValueAsString(customer);
        return one;
    }
//    添加
@RequestMapping("/add")
@ResponseBody
public int add(int id,String username,String jobs,String phone)  {
    System.out.println(id+username+jobs+phone);
    System.out.println("=========add============");
       int a = customerServiceImp.addCustomer(new Customer(id,username,jobs,phone));
    System.out.println(a);
       return a;
}

    //    删除
    @RequestMapping("/del")
    @ResponseBody
    public int del(int id)  {
      int del =customerServiceImp.delectCustomer(id);
        System.out.println("del================"+del);
        return del;
    }
    //    修改
    @RequestMapping("/upda")
    @ResponseBody
    public int upda(Customer customer)  {
//        System.out.println(id+username+jobs+phone);
        System.out.println("=========add============");
        int a = customerServiceImp.updateCustomer(customer);
        System.out.println(customer);
        System.out.println("修改"+a);
        return a;
    }
}
