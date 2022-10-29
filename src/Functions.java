public class Functions {
    // function/method - cod that can be reused, called

    // simple function which prints something on the screen
    // doesn't return anything
    // doesn't have parameters
    public static void printGreeting(){
        System.out.println("Hello! Welcome!");
    }

    // function that greets by name the client
    // doesn't return anything
    // have parameters
    public static void printGreetingClient(String first_name, String last_name){
        System.out.println("Hello, " + first_name + " " + last_name + "!");
    }

    // function that calculates sum of three numbers
    // returns sum
    // have parameters
    public static int sum_three_numbers(int a, int b, int c){
        int sum_three_numbers = a + b + c;
        return sum_three_numbers;
    }

    // function that returns the value of pi
    // returns pi
    // double
    // have parameters
    public static double piValue(){
        // constant - variable that can't be overwritten
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        // first customer gets in
        printGreeting();

        //second customer gets in
        printGreeting(); // CTRL + Click on function sends to source

        // calling a function with parameters
        printGreetingClient("John", "Doe");
        printGreetingClient("Herman", "Alejandro");
        printGreetingClient("Mitsuo", "Bis hi");

        // sum of numbers
        System.out.println(sum_three_numbers(2, 3, 10));
        int sum1 = sum_three_numbers(123,222,23141234);
        int sum2 = sum_three_numbers(123,563,876);
        int sum3 = sum_three_numbers(543, 465,534);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        // return of pi function
        System.out.println(piValue());
    }
}
