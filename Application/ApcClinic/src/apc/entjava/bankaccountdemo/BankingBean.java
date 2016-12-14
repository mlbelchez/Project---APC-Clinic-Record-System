package apc.entjava.bankaccountdemo;

import apc.entjava.bankaccountdemo.businesslogic.CustomerLookupService;
import apc.entjava.bankaccountdemo.dao.CustomerJpaDao;
import apc.entjava.bankaccountdemo.dao.CustomerSimpleMap;
import apc.entjava.bankaccountdemo.model.Customer;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by jacobcat on 10/3/2016.
 */
@ManagedBean
public class BankingBean {

    private String customerId;
    private String password;
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        customers = lookupService.getCustomers();
        return customers;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId.trim();
        if(this.customerId.isEmpty()) {
            this.customerId = "(none entered)";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static CustomerLookupService lookupService = new CustomerJpaDao();

    public String showBalance() {
        if(!password.equals("secret")) {
            return "wrong-password";
        }
        customer = lookupService.findCustomer(customerId);
        if(customer == null) {
            return "unknown-customer";
        }
        else if(customer.getBalance() < 0) {
            return "negative-balance";
        }
        else if(customer.getBalance() < 10000) {
            return "normal-balance";
        }
        else {
            return "high-balance";
        }
    }

    private Customer customer;

    public Customer getCustomer() {
        return this.customer;
    }
}
