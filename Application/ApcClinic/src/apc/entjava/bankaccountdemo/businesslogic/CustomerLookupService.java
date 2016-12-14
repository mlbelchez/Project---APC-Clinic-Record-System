package apc.entjava.bankaccountdemo.businesslogic;

import apc.entjava.bankaccountdemo.model.Customer;

import java.util.List;

/**
 * Created by jacobcat on 10/3/2016.
 */
public interface CustomerLookupService {
    public Customer findCustomer(String id);
    public List<Customer> getCustomers();
}
