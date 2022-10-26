public class Variables {
    public static void main(String[] args) {
        // variable = a place in the memory  of the computer where data is stored

        String CarBrand = "Subaru";
        String CarModel = "XV";

        // strongly typed coding -> python being loosely typed coding

        System.out.println("I bought a car from: " + CarBrand);
        System.out.println("The model is: " + CarModel);

        //overwrite
        CarModel = "XV facelift";
        System.out.println("I bought a car from: " + CarBrand);
        System.out.println("The model is: " + CarModel);

        // declaring variable
        String first_name;
        String last_name;
        // initialization
        first_name = "David";
        last_name = "Bojan";
        int age = 24;
        // concatenation of two strings
        System.out.println(first_name + " " + last_name + ", age: " + age);
    }
}
