package apc.entjava.bankaccountdemo.dao;

import apc.entjava.bankaccountdemo.businesslogic.CustomerLookupService;
import apc.entjava.bankaccountdemo.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jacobcat on 10/3/2016.
 */
public class CustomerSimpleMap implements CustomerLookupService {

    private Map<String,Customer> customers;

    public CustomerSimpleMap() {
        customers = new HashMap<>();

        this.addCustomer(new Customer("id001", "Harry Hacker", -3456 ));
        this.addCustomer(new Customer("id002", "Codie Coder", 1234));
        this.addCustomer(new Customer("id003", "Polly Programmer", 1000000));

    }

    @Override
    public Customer findCustomer(String id) {
        if(id != null) {
            return customers.get(id);
        }
        else {
            return null;
        }
    }

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>)customers.values();
    }

    private void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }


}
