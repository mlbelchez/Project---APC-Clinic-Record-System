package model;

/**
 * Created by School on 12/1/2016.
 */
public class Personnel {

    private int personnelId;
    private String personnelUsername;
    private String personnelEmail;
    private String personnelPassword;

    public Personnel(){}

    public int getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(int personnelId) {
        this.personnelId = personnelId;
    }

    public String getPersonnelUsername() {
        return personnelUsername;
    }

    public void setPersonnelUsername(String personnelUsername) {
        this.personnelUsername = personnelUsername;
    }

    public String getPersonnelEmail() {
        return personnelEmail;
    }

    public void setPersonnelEmail(String personnelEmail) {
        this.personnelEmail = personnelEmail;
    }

    public String getPersonnelPassword() {
        return personnelPassword;
    }

    public void setPersonnelPassword(String personnelPassword) {
        this.personnelPassword = personnelPassword;
    }
}
