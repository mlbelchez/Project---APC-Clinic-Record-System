package apc.entjava.bankaccountdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity
public class User {
    private String userId;
    private String username;
    private String emailAddress;
    private String password;

    public User(String userId, String username, String emailAddress, String password) {
        this.userId = userId;
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public User() {
    }
@Id
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(nullable=false, length=20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable=false, length=35)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Column(nullable=false, length=25)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
