import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Flow control - if else
        // evaluates conditions and splits the code based on the result
        System.out.println("Start the radio.");
        boolean good_song = true;
        //if the song is good, I increase the sound volume
        if (good_song == true) {
            System.out.println("Increase sound volume.");
        }
        System.out.println("Stop the radio.");
        //if else
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // insert data from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the hour: ");
        int hour = sc.nextInt();
        if (hour < 0) {
            System.out.println("Invalid hour");
        } else if (hour <= 11) {
            System.out.println("Morning!");
        } else if (hour <= 18) {
            System.out.println("Good afternoon!");
        } else if (hour <= 21) {
            System.out.println("Good evening!");
        } else if (hour <= 24) {
            System.out.println("Good night!");
        } else {
            System.out.println("Invalid hour");
        }
        // flow control
        // switch - used when we know the possibles values
        // example phone service
        System.out.println("Choose the option");
        int option = sc.nextInt();
        switch (option){
            case 0:
                System.out.println("Previous menu");
                break;
            case 1:
                System.out.println("English");
                break;
            case 2:
                System.out.println("Romanian");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
