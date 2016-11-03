/**
 * Created by senuna on 03.11.16.
 */
public class SwitchStatement {
    public static void main(String[] args) {

        int switchValue = 2;

        switch (switchValue){
            case 1:
                System.out.println("value is one");
                break;
            case 2:case 3:
                System.out.println("value is two or three, FYI: "+ switchValue);
                break;
            case 4:
                System.out.println("value is cztery");
                break;
            default:
                System.out.println("value was not so important...");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        //senuna: we can use char and strings in switch since java7
        char newSwitchValue = 'F';

        switch (newSwitchValue){
            case 'A':case 'B':case 'C':case 'D':
                System.out.println("ok, I can use your value which was: " + newSwitchValue );
                break;
            case 'E':
                System.out.println("you've got me value oooof: " + newSwitchValue);
                break;
            default:
                System.out.println("Sorry, value not found");
                break;
        }


        String name = "enwIENF";
        //senuna: be carefoull about sensivity of lower and uppercase
        switch (name.toLowerCase()){
            case "janek":
                System.out.println("ok, I can use your name which was: " + name );
                break;
            case "kaska":
                System.out.println("you've got me the right name: " + name);
                break;
            default:
                System.out.println("Sorry, I don't know what NAME you want... ");
                break;
        }

    }
}
