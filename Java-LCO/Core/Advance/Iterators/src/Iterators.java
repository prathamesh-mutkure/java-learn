import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

    /**
     * ITERATOR:
     * It's function is same as that of a loop
     *
     * SYNTAX:
     *
     *  Iterator<DataType> iterator-name = element-to-be-iterated.iterator();
     *
     */

    public static void main(String[] args){

        LinkedList<String> mLinkedList = new java.util.LinkedList<>();

        mLinkedList.add("Java");
        mLinkedList.add("Python");
        mLinkedList.add("Cpp");

        // Declaring an Iterator:
        Iterator<String> i = mLinkedList.iterator();

        while (i.hasNext()){
            System.out.println("Your Language is: " + (i.next()));
        }

    }

}
