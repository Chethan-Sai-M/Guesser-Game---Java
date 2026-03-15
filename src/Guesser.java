
import java.util.Scanner;

/**
 * This class is responsible for taking the number input from the user and
 * returning it to the caller.
 *
 * <p>
 * The user is requested to enter a number between the value 1-10. If the user
 * enters a number less than 1 or greater than 10, then the user is warned about
 * requested to enter a valid number. This process continues until the user
 * enters a valid number. </p>
 *
 * * Almost same as the {@link Player} class. The Difference here is that this
 * class collects the input from Guesser instead of the Players.
 *
 * @author Chethan Sai M
 * @version 25.0.2
 */
public class Guesser {

    /**
     * This variable stores the number guessed by the user. It is initialized to
     * 0 at the start and is only updated when the user enters a valid input.
     */
    int gNum = 0;

    /**
     * This method requests the user to enter a number between 1 and 10. It uses
     * a Scanner object to read/scan inputs from the user.
     *
     * <p>
     * If the user enters a number less than 1 or greater than 10, the method
     * prints an invalid message and is requested to enter a valid number. This
     * continues until a proper input is scanned/recieved
     * </p>
     *
     * @return gNum -> The valid number guessed by the user between 1 and 10.
     */
    int guessingNum() {
        System.out.println("Guess your Number(1-10)");

        Scanner scan = new Scanner(System.in);
        do {
            gNum = scan.nextInt();
            if (gNum < 1 || gNum > 10) {
                System.out.println("Invalid input, Please enter a number between 1 and 10.");
            } else {
                System.out.println("You guess has been recorded");
            }
        } while (gNum < 1 || gNum > 10);

        System.out.println("-------------------------------------------------\n");

        return gNum;

    }
}

