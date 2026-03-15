
/**
 *
 * This class contains the main method(The entry point of the program) and is responsible for starting the game.
 *
 * Runs a basic game where a Guesser guesses a number and three Players try to predict the number.
 *
 * <p>
 * It initializes the game and coordinations between the Guesser, Player and the
 * Umpire classes.
 * </p>
 *
 * @author Chethan Sai M
 * @version 25.0.2
 */
public class GuesserGame {

    /**
     * The main method is the entry point of the program. It initializes the
     * game and coordinates between the Guesser, Player and the Umpire classes.
     *
     * <p>
     * It creates the Umpire object and makes calls to the methods of the
     * {@link Umpire} class to start the game.
     * </p>
     *
     * It also prints Welcome messages and the rules of the game at the start of
     * the game. Most Game logics are handled by the other 3
     * classes({@link Guesser}, {@link Player}, and {@link Umpire}).
     *
     * main() is only responsible to start the execution and print the welcome
     * messages and rules of the game.
     *
     * @param args Commmand-line arguments are not used for this program.
     */
    public static void main(String[] args) {
        Umpire u1 = new Umpire();
        System.out.println("Welcome to the Guesser Game!\n\n");

        System.out.println("--> In this game, The Guesser will guess a number and the rest of Players will try to predict the number chosen by the Guesser.\n\n");

        System.err.println("Rules of the Game: \n1.Four Players play the game(1 Guesser and 3 Players/Predictors). \n2.Each Player will get only one chance at Guessing/Predicting Unless they make a mistake.");

        System.out.println("3.There can be multiple winners in the game. \n4.If no one wins, then the Guesser Wins the Game.\n\n");

        System.out.println("Let's Start the Game!!\n\n");

        u1.collectingNumFromGusser();
        u1.collectingNumFromPlayers();
        u1.comparing();

    }
}

