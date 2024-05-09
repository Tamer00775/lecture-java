package lecture1;

import java.time.Instant;

public class PasswordException extends RuntimeException {
    private String message;
    private Instant dateOfException;

    public PasswordException(String message) {
        super(message);
        dateOfException = Instant.now();
    }

    public Instant getDateOfException() {
        return this.dateOfException;
    }
}
