package com.simonluo.common.bean;

/**
 * @ClassName BaseUser
 * @Description The Base user for demo.
 * @Author simonluo
 * @Date 12/5/2018 5:16 PM
 * @Version 1.0
 */
public class BaseUser {
    private String id;
    private String login;
    private String password;
    private String nickName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
