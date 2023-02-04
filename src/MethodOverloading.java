public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Anonymous " + score);
        return score * 1000;
    }

    private static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
/* Overloaded methods are used to make methods optional,
    if you need user to enter inputs like in this case, you are giving them an option of
    choosing what types of data to enter
 */
}
