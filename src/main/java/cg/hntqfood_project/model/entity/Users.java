package cg.hntqfood_project.model.entity;

import java.util.Date;

public class Users {
    private int id;
    private String fullName;
    private String avatar;
    private String address;
    private boolean gender;
    private Date birthday;
    private String phoneNumber;
    private String email;
    private String pass;
    private int roleUser;
    private boolean userStatus;
    private boolean rememberAccount;

    public Users() {
    }

    public Users(int id, String fullName, String avatar, String address, boolean gender, Date birthday, String phoneNumber, String email, String pass, int roleUser, boolean userStatus, boolean rememberAccount) {
        this.id = id;
        this.fullName = fullName;
        this.avatar = avatar;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pass = pass;
        this.roleUser = roleUser;
        this.userStatus = userStatus;
        this.rememberAccount = rememberAccount;
    }

    public boolean isRememberAccount() {
        return rememberAccount;
    }

    public void setRememberAccount(boolean rememberAccount) {
        this.rememberAccount = rememberAccount;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(int roleUser) {
        this.roleUser = roleUser;
    }
}
