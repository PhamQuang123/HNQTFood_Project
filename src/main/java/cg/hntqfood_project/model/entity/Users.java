package cg.hntqfood_project.model.entity;

public class Users {
    private int id;
    private String fullName;
    private String avatar ="hinh-nen-bong-da-1.jpg";
    private String address;
    private int gender;
    private String birthday;
    private String phoneNumber;
    private String email;
    private String pass;
    private int roleUser = 1;
    private boolean userStatus = true;
    private boolean rememberAccount = false;

    public Users() {
    }

    public Users(int id, String fullName, String avatar, String address, int gender, String birthday, String phoneNumber, String email, String pass, int roleUser, boolean userStatus, boolean rememberAccount) {
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

    public Users(String fullName, int gender, String birthday, String phoneNumber, String email, String pass) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pass = pass;
    }

    public Users(int id, String fullName, String avatar, String address, int gender, String birthday, String phoneNumber, String pass, boolean userStatus) {
        this.id = id;
        this.fullName = fullName;
        this.avatar = avatar;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.pass = pass;
        this.userStatus = userStatus;
    }

    public Users(int id, String fullName, String avatar, String address, int gender, String birthday, String phoneNumber, String pass) {
        this.id = id;
        this.fullName = fullName;
        this.avatar = avatar;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.pass = pass;
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

    public int isGender() {
        return gender;
    }


    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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
