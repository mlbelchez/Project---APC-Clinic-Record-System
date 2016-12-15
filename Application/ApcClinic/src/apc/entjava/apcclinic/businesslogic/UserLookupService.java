package apc.entjava.apcclinic.businesslogic;

import apc.entjava.apcclinic.model.User;

import java.util.List;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
public interface UserLookupService {
    void register(User newUser);

    User login(String username, String password);
}
