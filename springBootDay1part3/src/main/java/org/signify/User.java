package org.signify;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String userName;
    private String emailId;
    private String phoneNumber;

    public User(String name, String emailId, String phoneNumber) {
        this.userName = name;
        this.emailId=emailId;
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
