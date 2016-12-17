package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.UserLookupService;
import apc.entjava.apcclinic.dao.UserDao;
import apc.entjava.apcclinic.model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
@ManagedBean
@SessionScoped
public class UserBean {

    private UserLookupService userLookupService = new UserDao();

    private User user;
    private String username;
    private String email;
    private String password;

    public User getUser() {
        if(this.user==null) {
            this.user = new User();
        }
        return user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        String pass = this.password;
        this.password = "";
        return pass;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        this.user = this.userLookupService.login(this.username, this.password);
        if(this.user != null) {
            return "main";
        }
        else {
            return "login";
        }

    }

    public String register() {
        if(user.getPassword().equals(password)) {
            this.userLookupService.register(user);
            return "login";
        }
        return "register";
    }
}
