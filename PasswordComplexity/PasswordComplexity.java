import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {
        /**
         * Solution for checking password complexity
         * Split a string into characters then uses anyMatch method for validation
         * @author samuel Githogori
         */
        if(password.length()>=6 && password.chars().anyMatch(Character::isLowerCase)
        && password.chars().anyMatch(Character::isUpperCase)
        && password.chars().anyMatch(Character::isDigit)) return true;
        else{
            return false;
        }

    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}
