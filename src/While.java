public class While {
    public static void main(String[] args) {
        // while - loop, repetitive cycle
        // code that repeats as long as the condition is true

        // exercise: the car is running as long as it has gas
        int gas_gallons = 5;
        while (gas_gallons > 0){
            System.out.println("Accelerate.");
            // subtract gas
            gas_gallons = gas_gallons -1;
            // warning if gas_gallons bellow 2
            if (gas_gallons <= 2){
                System.out.println("Gas is running low!!!");
            }
        }
        System.out.println("Out of gas!");
    }
}
