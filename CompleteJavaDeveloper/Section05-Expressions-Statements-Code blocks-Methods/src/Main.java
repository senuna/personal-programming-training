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

        //region part4 challenge
        //***************************************************
        // Part4 calcFeetAndInchesToCentimeters
        //***************************************************
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        System.out.println("Part 4 - chellange");
        calcFeetAndInchesToCentimeters(13,25);
        calcFeetAndInchesToCentimeters(100);

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

    //region Part 4
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches >12))){
            System.out.println("Nope!");
            return -1;
        }

        // double cm;
        double cm = (feet * 12 ) * 2.54; //calculating feets
        cm += inches * 2.54;

        System.out.println(feet + " feet and " + inches +" inches = " + cm + " centimeters");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
      if(inches < 0){
          return -1;
      }

      double feet = (int) inches / 12;
      double remainingInch = (int) inches % 12;
        System.out.println(inches + "inches = " + feet + " feets "+ remainingInch + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInch);
    }
    //endregion

}

