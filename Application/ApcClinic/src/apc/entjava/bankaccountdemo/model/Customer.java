package apc.entjava.bankaccountdemo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by jacobcat on 10/3/2016.
 */
@Entity
public class Customer {
    private String customerId;
    private String customerName;
    private int balance;

    public Customer() {
    }

    public Customer(String customerId, String customerName, int balance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.balance = balance;
    }

    @Id
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Column(nullable=false, length=50)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Column(nullable=false)
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
