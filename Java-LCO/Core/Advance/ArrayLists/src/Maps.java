import java.util.HashMap;
import java.util.Scanner;

public class Maps {

    public static void main(String[] args){

        // MAP TYPES:
        // HashMap,HashTable, TreeMap

        // FORMAT:
        //
        // KEY -----> VALUE
        //
        //  0         Cat
        //  1         Dog
        //  2         Mouse

        // KEY(K) is like a ID
        // and VALUE(V) is like the VALUE of it

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("catKey", "Cat");
        hashMap.put("dogKey", "Dog");

        hashMap.put("nagpurDay", "Hot!");
        hashMap.put("nagpurNight", "Storm!");

        System.out.println(hashMap);
        System.out.println("\n--------------------------------\n");

        HashMap<String, String> userData = new HashMap<>();

        userData.put("user1", "pass1");
        userData.put("user2", "pass2");
        userData.put("user3", "pass3");
        userData.put("user4", "pass4");

        // Will print the value assigned to the key
        System.out.printf("%s\n%s\n%s\n%s\n", userData.get("user1"), userData.get("user2"), userData.get("user3"), userData.get("user4"));

        System.out.println("\n--------------------------------\n");

        if (userData.containsKey("user1"))
            System.out.println("\nKEY PRESENT: " + userData.get("user1") + "\n");



    }

}
