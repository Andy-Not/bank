package com.bank.api.user;

public class UserRegistrationDTO {

    private String userName;
    private String password;
    private String email;
    private String socialSecurity;
    private String phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialSecurity() { return socialSecurity; }

    public void setSocialSecurity(String socialSecurity) { this.socialSecurity = socialSecurity; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
