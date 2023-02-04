public class MethodExecution {
   /*
   CHALLENGE
    Create 2 methods; first should have 2 parameters, one for player's name and one for player's position
    method should print a message
    2nd method should have just 1 parameter, return a number between 1 and 4 based on the score value below
    >= 1000:1
    >=500, <1000: 2
    >=100, <500 : 3
    all others : 4
    */
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Ann", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Steve", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("May", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position =  2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}
