package com.service;

import com.mapper.CustomerMapper;
import com.pojo.Customer;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Setter
public class CustomerServiceImp implements CustomerService {
@Autowired
@Qualifier("customerMapper")
CustomerMapper customerMapper;
    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }

    @Override
    public int delectCustomer(int id) {
        return customerMapper.delectCustomer(id);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public List<Customer> selectCustomer() {
        return customerMapper.selectCustomer();
    }

    @Override
    public Customer selectCusById(int id) {
        return customerMapper.selectCusById(id);
    }
}
