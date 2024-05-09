package lecture1;

public class Main {
    public static void main(String[] args) {
        try {
            StudentUser studentUser = new StudentUser("fullname", 12, "12345", "erterg");
            studentUser.setPassword("eirjeirger");
            System.out.println(studentUser.getPassword());
        } catch (PasswordException exception) {
            System.out.println("Message: " + exception.getMessage() +
                    "\nDate: " + exception.getDateOfException());
        }

    }
}
