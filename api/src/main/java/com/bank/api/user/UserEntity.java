package com.bank.api.user;

import com.bank.api.address.AddressEntity;

import javax.persistence.*;

@Entity
@Table(name = "User", schema = "andy123")
public class UserEntity {

    @Id
    @Column(name = "USER_NAME", nullable = false, unique = true)
    private String userName;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "PHONENUMBER", nullable = false, unique = true)
    private int phoneNumber;

    @Column(name = "SOCIALSECURITY", nullable = false, unique = true)
    private String socialSecurity;

    @OneToOne(mappedBy = "user")
     private AddressEntity address;



    public String getUserName() {
        return userName;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getSocialSecurity() { return socialSecurity; }

    public void setSocialSecurity(String socialSecurity) { this.socialSecurity = socialSecurity; }
}
