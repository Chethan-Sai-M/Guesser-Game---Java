
/**
 * <p>
 * This class is responsible for collecting the number(s) from the Guesser and
 * Players + Announces the results. It also compares the Players numbers with
 * the Guesser's number and declares the winner(s) of the game. (Yes,there can
 * be multiple winners in the game).</p>
 *
 * It achieves this by making calls to the {@link Guesser} and {@link Player}
 * classes to collect the numbers and then compares them to declare the
 * winner(s).
 *
 * @author Chethan Sai M
 * @version 25.0.2
 */
public class Umpire {

    /**
     * Collects the number guessed by the Guesser/The value returned by the
     * {@link Guesser#guessingNum()} method.
     */
    int numGuesser;
    /**
     * Collects the number predicted by the Player 1/The value returned by the
     * {@link Player#predictNum()} method in the First call.
     */
    int numPlayer1;
    /**
     * Collects the number predicted by the Player 2/The value returned by the
     * {@link Player#predictNum()} method in the Second call.
     */
    int numPlayer2;
    /**
     * Collects the number predicted by the Player 3/The value returned by the
     * {@link Player#predictNum()} method in the Third call.
     */
    int numPlayer3;

    /**
     * This method creates an object of the {@link Guesser} class and calls the
     * {@link Guesser#guessingNum()} method to collect the number guessed by the
     * Guesser and assigns the number to {@link Umpire#numGuesser} variable.
     *
     */
    void collectingNumFromGusser() {
        Guesser g = new Guesser();
        numGuesser = g.guessingNum();
    }

    /**
     * This method creates an object of the {@link Player} class and calls the
     * {@link Player#predictNum()} method multiple times to collect the number
     * predicted by the Players and assigns the number to
     * {@link Umpire#numPlayer1},{@link Umpire#numPlayer2}, and
     * {@link Umpire#numPlayer3} variables respectively.
     */
    void collectingNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numPlayer1 = p1.predictNum();
        numPlayer2 = p2.predictNum();
        numPlayer3 = p3.predictNum();
    }

    /**
     * Compares the number guessed by the Guesser with the numbers predicted by
     * each player and declares the winnner(s) of the game.
     *
     * <p>
     * If no player is able to predict the number guessed by the Guesser, then
     * the Guesser is declared the winner. This method also handles the case
     * where there can be multiple winners(Uses nested if-else statements to
     * check for multiple winners).
     * </p>
     */
    void comparing() {

        boolean p1 = (numPlayer1 == numGuesser);
        boolean p2 = (numPlayer2 == numGuesser);
        boolean p3 = (numPlayer3 == numGuesser);

        System.out.println("\n=================================");
        System.out.println("            🏆 RESULT 🏆");
        System.err.println("=================================");
        System.out.println("=================================");
        System.out.println("Guesser chose : " + numGuesser);
        System.out.println("Player 1 guess: " + numPlayer1);
        System.out.println("Player 2 guess: " + numPlayer2);
        System.out.println("Player 3 guess: " + numPlayer3);
        System.out.println("=================================");
        if (p1 && p2 && p3) {
            System.out.println("🎉 All Players WON THE GAME!!🎉");
        } else if (p1 && p2) {
            System.out.println("🎉 Player 1 and Player 2 WON THE GAME!! 🎉");
        } else if (p1 && p3) {
            System.out.println("🎉 Player 1 and Player 3 WON THE GAME!! 🎉");
        } else if (p2 && p3) {
            System.out.println("🎉 Player 2 and Player 3 WON THE GAME!! 🎉");
        } else if (p1) {
            System.out.println("🎉 Player 1 WON THE GAME!! 🎉");
        } else if (p2) {
            System.out.println("🎉 Player 2 WON THE GAME!! 🎉");
        } else if (p3) {
            System.out.println("🎉 Player 3 WON THE GAME!! 🎉");
        } else {
            System.out.println("🎉 No Player guessed the number.\nThe Guesser WINS THE GAME!!! 🎉");
        }
        System.out.println("=================================");

    }
}

