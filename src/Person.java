
public class Person {

    private String name;

    private String phoneNum;

    private String password;

    public Person(String name, String phoneNum, String password) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
