import java.util.HashMap;
import java.util.Map;


public class Maps {
    public static void main(String[] args) {
        // map = data representation in key-value system
        // example: Matei has grade 10, Mircea has grade 8

        // declare a map
        Map<String,Integer> students_grades = new HashMap<>();

        // add an element
        students_grades.put("Matei", 6);
        students_grades.put("Mircea", 8);
        students_grades.put("Ana", 10);

        // print a grade
        System.out.println("Ana has the grade " + students_grades.get("Ana"));

        // update values
        students_grades.replace("Matei", 9);
        System.out.println("Matei has increased his grade to " + students_grades.get("Matei"));

        // dimension of the map
        System.out.println(students_grades.size());

        // delete value
        students_grades.remove("Mircea");
        System.out.println(students_grades.size());

        // declare and initialize a map with values
        // map is not ordered
        Map<String, Integer> months = new HashMap<String, Integer>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("March", 3);
            // so on
        }};
        System.out.println(months);
    }
}
