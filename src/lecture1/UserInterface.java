package lecture1;

public interface UserInterface {
    public String getFullName();

    String getLogin();

    default String getPassword() {
        return "hello";
    }
}
