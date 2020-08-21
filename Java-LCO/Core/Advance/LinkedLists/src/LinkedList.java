public class LinkedList {

    /**
     * LinkedList:
     *
     * Functions same as an ArrayList externally
     * But has a different working internally
     * If we change the index of a particular element of an ArrayList, then
     * all the further elements thereafter need to change their index
     * This is really bad thing to do in the case of a large ArrayList
     *
     * ArrayList solves this problem by inter-linking of all the elements
     * In array list a particular Item is linked to the items before and after it
     * So, even if we change its index, then just a new link in between is formed
     * rather than needing to change all the index values thereafter
     *
     * SYNTAX:
     *
     * LinkedList<DataType> name = new LinkedList<>();
     *
     */

    public static void main(String[] args){

        java.util.LinkedList<String> mLinkedList = new java.util.LinkedList<>();

        mLinkedList.add("Java");
        mLinkedList.add("Python");
        mLinkedList.add("Cpp");

    }

}
