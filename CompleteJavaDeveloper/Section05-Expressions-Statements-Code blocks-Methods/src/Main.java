/**
 * Created by senuna on 02.11.16.
 */
public class Main {
    public static void main(String[] args) {

        // region part1
        //***************************************************
        // Part1. Methods in Java
        //***************************************************
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        //calculateScore(gameOver, score, levelCompleted, bonus);

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was " + highScore);
        //endregion

        //region part2
        //***************************************************
        // Part2 challange
        //***************************************************

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like "managed to get into position " and the
        // position they got and a further message" on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        int highScorePosition;

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Baska",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Zoska",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Anka",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jadzka",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Ulka",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Goska",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Samoska",highScorePosition);
        //endregion

        // region part3
        //***************************************************
        // Part3 Methods overloading
        //***************************************************
        System.out.println("Part 3");
        int newScore;
        newScore = calculateScore("Inez", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        //endregion

    }
    // functions
    //region Part 1
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
    //endregion

    //region Part 2
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Player " + playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {

        //senuna: notice that >= is very important for edge cases!

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else
            return 4;
    }
    //endregion

    //region Part 3
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player got "+score+" points");
       return score*1000;
    }

    public static int calculateScore(){
        //senuna: I can't just change the returning type, the overloading is based on changing passed parameters

        System.out.println("No player, no score ;-)");
        return 0;
    }
    //endregion

}

