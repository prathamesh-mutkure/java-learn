import java.util.HashSet;

public class Sets {

    public static void main(String[] args){

       // SETS:
       // They are similar to ArrayLists
       // But they only allow create unique sets of value
       // Same value can't be assigned to Sets at different Positions

       // TYPES:
       // HashSet, TreeSet, LinkedHashSet


        HashSet<String> set = new HashSet<>();

        set.add("Dog");
        set.add("Cat");
        set.add("Dog");

        System.out.println(set);

        // Dog will only get printed once

    }

}
