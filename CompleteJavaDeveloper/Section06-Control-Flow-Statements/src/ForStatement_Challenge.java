/**
 * Created by senuna on 03.11.16.
 */
public class ForStatement_Challenge {
    public static void main(String[] args) {

        //System.out.println("10000 with 2% is " + calculateInterest(10000.0, 2.0) );

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        double interestRate = 8;
        for ( int i = 2; i <= interestRate ;i++ ){
            System.out.println("10000 with " + i + "% interest " + " is " + calculateInterest(10000.0, i ));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        interestRate = 8;
        for (int i = (int) interestRate; i >= 2 ;i--){
            System.out.println("10000 with " + i + "% interest " + " is " + String.format("%.2f",calculateInterest(10000.0, i )));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        int start = 10;
        int end = 50;

        for (int i = start; i <= end; i++ ){
            if (isPrime(i)){
                System.out.println("Number " + i + " is prime number.");
                count++;

                if (count == 3){
                    System.out.println("It's enough. Between given " + start + " and " + end + " I just listed 3 prime numbers");
                    break;
                }
            }
        }

    }

    public static boolean isPrime (int n){

        if (n == 1){
            return false;
        }

        for (int i=2; 2*i <= n; i++){
            // checking with and compare how many times it loop
            // i <= (long) Math.sqrt(n)

            // if there will be any number that divides given one it returns false
            //senuna: Consider that if 2 divides some integer n, then (n/2) divides n as well.
            // This tells us we don't have to try out all integers from 2 to n.
            // and 2*i = n is more safe than i = n/2

            //System.out.println("Loop nr " + i);

            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest (double amount, double interestRate){
        double result = amount * (interestRate/100);
        return result;
    }
}
