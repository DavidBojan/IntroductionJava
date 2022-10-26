/*
Operators:
Arithmetic: +,-, *, /, %
Comparison: < >, ==, !=, >=, <=
Logic: &&, ||, !

 Flow control - if else
 */

public class Operators {
    public static void main(String[] args) {
        int a = 3; // declaration && initialization
        int b = 5;
        // a = b; // variable taking the value from another variable
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a % b);
        System.out.println(b / a);
        System.out.println(a != b); // result -> true
        System.out.println(a!=b && a>5); // result -> false
        System.out.println(a!=b || a>5); // result -> true
    }
}
