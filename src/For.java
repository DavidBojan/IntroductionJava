public class For {
    public static void main(String[] args) {
        // for - loop, repetitive structure

        // exercise print 101 dalmatians
        for (int i=1; i <= 101; i++){
            System.out.println("Dalmatian number " + i);
        }

        // go through the array using index
        int[] numbers = {3, 7 ,5 ,9};
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element index: " + i + ", value: " + numbers[i]);
        }

        // for each - goes to the all elements from the array directly to values
        for (int number : numbers){
            System.out.println("Number is: " + number);
        }

        // colours array
        String[] colours = {"yellow", "green", "purple"};
        for (String color : colours){
            System.out.println("Current color is: " + color);
        }

        // sum of array numbers
        int s = 0;
        for (int number : numbers){
            s+= number;
        }
        System.out.println("Sum is: " + s);
    }
}
