/**
 * Created by senuna on 04.11.16.
 */
public class WhileDoWhile_Challenge {
    public static void main(String[] args) {
        int a = 1;
        while (a !=6 ){
            System.out.println("aham! " + a);
            a++;
        }

        a = 1;
        while (true){
            if(a ==6){
                break;
            }
            System.out.println("cos " + a);
            a++;
        }

        //senuna: be carrefull!
        //a = 6;

        a = 3;
        do {
            System.out.println("a value is" + a);
            a++;
        } while (a != 6);

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        int n = 5;
        int end = 20;

        while (n <= end){
            if (isEven(n)){
                System.out.println(n +" is an even number.");
                n++;
            } else {
                n++;
                continue;
            }

        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        n = 25;
        end = 60;
        int count = 0;

        while (n <= end){
            if (isEven(n)){
                System.out.println(n +" is an even number.");
                n++;
                count++;
                if (count == 5){
                    System.out.println("I've found 5 even numbers. Exit");
                    break;
                }

            } else {
                n++;
                continue;
            }

        }
        System.out.println("I've found " + count + " even numbers");



    }

    public static boolean isEven(int n){
        if ((n%2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
