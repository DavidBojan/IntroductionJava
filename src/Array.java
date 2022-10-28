public class Array {
    public static void main(String[] args) {
        // declaration and initialisation
        String[] students = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numbers = {1, 13, 55, 9, 10};
        //contains elements of the same type
        // elements have index starting with 0
        // exact dimension
        // property that gives the length of the array

        System.out.println(students[2]);
        students[2] = "Sebi"; //overwriting
        System.out.println(students[2]);
        System.out.println(students.length);

        // we can add values from the array
        System.out.println(students[1] + " and " + students[3]);
        System.out.println(students.length + 4);

        // print the last element no matter the length
        System.out.println(students[students.length-1]);

        // declaration and memory allocation for array
        int[] note = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
    }
}