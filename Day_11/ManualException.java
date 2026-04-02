class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ManualException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is lesser than 18");
        } else {
            System.out.println("Eligible Age"); 
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(13);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}