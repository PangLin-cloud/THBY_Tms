package com.tianhai.pojo;

public class ThbyAdmin {
    private Integer id;

    private String user;

    private String password;

    private String gradient;

    private Integer adminIdUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGradient() {
        return gradient;
    }

    public void setGradient(String gradient) {
        this.gradient = gradient == null ? null : gradient.trim();
    }

    public Integer getAdminIdUser() {
        return adminIdUser;
    }

    public void setAdminIdUser(Integer adminIdUser) {
        this.adminIdUser = adminIdUser;
    }
}