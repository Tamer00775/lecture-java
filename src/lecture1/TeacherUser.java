package lecture1;

public class TeacherUser extends User {
    private String salary;
    private String cab;

    public TeacherUser(String login, String password, String fullName, String salary, String cab) {
        super(login, password, fullName);
        this.salary = salary;
        this.cab = cab;
    }

    @Override
    public String getLogin() {
        String login = super.login;
        return login.substring(2);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    String test() {
        return "test";
    }
}
