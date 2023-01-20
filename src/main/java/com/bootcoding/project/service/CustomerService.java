package com.bootcoding.project.service;

import com.bootcoding.project.model.Customer;
import com.bootcoding.project.utils.*;

public class CustomerService {
    public Customer createCustomer() {
        Customer customer = new Customer();
        customer.setName(CustomerNameGenerator.getName());
        customer.setCity(CityGenerator.getName());
        customer.setEmailId(EmailIdGenerator.getEmailId(customer.getName()));
        customer.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
        customer.setDeliveryAddress(AddressGenerator.getAddress());
        return customer;
    }
        public void print(Customer customer) {
            System.out.println("customer Name:" + customer.getName());
            System.out.println("customer city:" + customer.getCity());
            System.out.println("customer EmailId:" + customer.getEmailId());
            System.out.println("customer address:" + customer.getDeliveryAddress());
            System.out.println("customer PhoneNumber:" + customer.getPhoneNumber());


        }
            public static void main(String[] args){
                CustomerService cs=new CustomerService();
                Customer customer= cs.createCustomer();
                cs.print(customer);
            }

        }
        //1 object customer
        // propert



