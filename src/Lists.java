import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // declare an empty list
        List<String> fruits = new ArrayList<>();
        // alt enter imports ArrayList and util.List
        // Lists have dynamic dimension

        // add elements in list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        System.out.println(fruits);

        // get an element
        System.out.println(fruits.get(0));

        // how to get the index of an element
        System.out.println(fruits.indexOf("banana"));

        // remove element
        fruits.remove("peach");
        System.out.println(fruits);

        // check the list
        System.out.println(fruits.isEmpty());

        if (fruits.isEmpty()){
            System.out.println("Nothing in basket");
        }else {
            System.out.println("Fruits in basket");
        }

        /*
        if (!fruits.isEmpty()){ // if not
            System.out.println("Fruits in basket");
        }
        */

        // eliminate all list objects
//        fruits.clear();
//        if (fruits.isEmpty()){
//            System.out.println("Nothing in basket");
//        }else {
//            System.out.println("Fruits in basket");
//        }

        // declare am immutable list and initialize it with values
        List<Integer> numbers = Arrays.asList(new Integer[]{1, 33, 77});
        // numbers.add(99); not possible
        System.out.println(numbers);

        // dynamic list
        String[] flowers = { "Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);

        // find element index in list and remove element from that index
        int poppy_index = flowerList.indexOf("Poppy");
        flowerList.remove(poppy_index);

        // remove element by value
        flowerList.remove("Catmint");

        System.out.println(flowerList);
    }
}
