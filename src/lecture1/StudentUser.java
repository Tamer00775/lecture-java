package lecture1;

public class StudentUser extends User {
    private String fullName;
    private Integer age;

    public StudentUser(String fullName, Integer age, String login, String password) {

        super(login, password, fullName);
        this.age = age;
    }

    @Override
    public String getLogin() {
        String login = super.login;
        return login.substring(1);
    }


    public String getFullName() {
        return fullName;
    }

    public String getFullName(String s) {
        return null;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

