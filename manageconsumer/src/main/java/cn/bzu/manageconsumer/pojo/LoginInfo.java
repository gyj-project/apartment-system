package cn.bzu.manageconsumer.pojo;

public class LoginInfo {

    private String name;
    private String pass;

    public LoginInfo() {
    }

    public LoginInfo(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
