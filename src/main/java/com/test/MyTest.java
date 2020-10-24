package com.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Customer;
import com.service.CustomerService;
import com.service.CustomerServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void an(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("application.xml");
       CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceImp");
        Customer customer = customerService.selectCusById(12);
        System.out.println(customer);
    }
    @Test
    public void an1() throws JsonProcessingException {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("application.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceImp");
        List<Customer> list=customerService.selectCustomer();
        ObjectMapper objectMapper=new ObjectMapper();
        String an=objectMapper.writeValueAsString(list);
        System.out.println(an);
        System.out.println("============================");
        System.out.println(list);
    }
    @Test
    public void add(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("application.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceImp");
        int a = customerService.addCustomer(new Customer(543,"22","33","44"));
        System.out.println(a);
    }
}
