import java.util.ArrayList;

public class ArrayListBasic {

    public static void main(String args[]){

//        ARRAY LIST:
//        In array list unlike simple array we can put as many as values
//        Means number of values isn't predefined

//        FORMAT:
//        ArrayList<DataType> array-name = new ArrayList<DataType>();


        ArrayList<String> heroes = new java.util.ArrayList<>();


        // .add used to add an element to the array
        heroes.add("Hulk");
        heroes.add("Iron Man");
        heroes.add("Spider Man");
        heroes.add(0, "Thor");


        // .remove is used to remove a element from array
        heroes.remove(1);


        System.out.println(heroes.size()); // .size is used to determine number of elements in the array
        System.out.println(heroes.get(0)); // .get used to get the specified element


        System.out.println("My Super Hero is " + heroes.get(0));
        System.out.println("My Super Hero is " + heroes.get(1));
        System.out.println("My Super Hero is " + heroes.get(2));
        System.out.println("My Super Hero is " + heroes.get(3));

    }

}