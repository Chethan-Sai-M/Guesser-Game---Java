
import java.util.Scanner;

/**
 * This class is responsible for taking the number input from the user and
 * returning it to the caller.
 *
 * <p>
 * The user is requested to enter a number between the value 1-10. If the user
 * enters a number less than 1 or greater than 10, then the user is warned about
 * the invalid input and is requested to enter a valid number. This process
 * continues until the user enters a valid number. </p>
 *
 * *Almost same as the {@link Guesser} class. The Difference here is that this
 * class collects the input from Players instead of the Guesser.
 *
 * @author Chethan Sai M
 * @version 25.0.2
 */
public class Player {

    /**
     * This variable stores the number predicted by the user. It is initialized
     * to 0 at the start and is only updated when the user enters a valid input.
     */
    int pNum = 0;
    /**
     * Tracks which player is currently predicting. Incremented every time
     * {@link #predictNum()} is called. It is a static variable so that it can
     * retain its value across multiple method calls.
     */
    static int count = 0;

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
     * @return pNum -> The valid number predicted by the Player between 1 and
     * 10.
     */
    int predictNum() {

        count++;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlayer " + count + ", Please predict a number between 1 to 10");
        do {
            pNum = scan.nextInt();
            if (pNum < 1 || pNum > 10) {
                System.out.println("\nInvalid input, Please enter a number between 1 and 10.");
            } else {
                System.out.println("Player " + count + "'s prediction has been recorded");
            }
        } while (pNum < 1 || pNum > 10);
        System.out.println("-------------------------------------------------\n");

        return pNum;
    }
}
