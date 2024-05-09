package lecture1;

public abstract class User implements UserInterface  {
    protected String login;
    private String password;
    private String fullName;

    public User(String login, String password, String fullName) {
        if (password.isEmpty()) {
            throw new PasswordException("password not be empty");
        }
        this.login = login;
        this.fullName = fullName;
        this.password = password;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public abstract String getLogin();

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (password.isEmpty()) {
            throw new PasswordException("password not be empty");
        }
        this.password = password;
    }
}
