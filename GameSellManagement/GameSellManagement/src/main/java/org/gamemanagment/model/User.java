package org.gamemanagment.model;

public abstract class User {
    private int id;
    private String name;
    private String surName;
    private String nationalIdentity;
    private String birthDate;
    private String memberDate;
    private String password;
    private String eMail;
    private String userName;
    private String picture;

    public User() {
    }

    public User(int id, String name, String surName, String nationalIdentity, String birthDate, String memberDate, String password, String eMail, String userName, String picture) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.nationalIdentity = nationalIdentity;
        this.birthDate = birthDate;
        this.memberDate = memberDate;
        this.password = password;
        this.eMail = eMail;
        this.userName = userName;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(String memberDate) {
        this.memberDate = memberDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", nationalIdentity='" + nationalIdentity + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", memberDate='" + memberDate + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", userName='" + userName + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}