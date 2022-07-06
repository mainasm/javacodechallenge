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
<<<<<<< HEAD
    }
    //Solution 2 by Kathryn Hodges

        // if(password.length()<6){
        //     return false;
        // }

        // boolean hasLowercaseletter = false;
        // boolean hasUppercaseLetter = false;
        // boolean hasNumber = false;

        // for (int i = 0; i<password.length() || (
        //    !hasLowercaseletter && !hasUppercaseLetter &!hasNumber); i++)
            // char current = password.charAt(i)
            // 
            // if (Character.isDigit(current)){
        //         hasNumber = true;}
        //     } else if(Character.isUpperCase(current)){
        //         hasUppercaseLetter = true;}
        //     } else if(Character.isLowerCase(current)){
        //         hasLowercaseletter = true;}
    //     })
    //     return hasNumber && hasUppercaseLetter && hasLowercaseLetter;
    // }

    //Solution 3 by Kathryn Hodges
            // return password.length(>=6)
            // && password.matches(regex:".*\\d.*")
            // && password.matches(regex:".[a-z].*")
            // && password.matches(regex:".[A-Z].*");
=======

    }
>>>>>>> e2339e80cac7d1275e52ace2c6ef07d03a7c9e38

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}
<<<<<<< HEAD

=======
>>>>>>> e2339e80cac7d1275e52ace2c6ef07d03a7c9e38
