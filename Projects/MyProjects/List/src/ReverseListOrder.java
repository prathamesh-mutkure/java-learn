import java.util.LinkedList;

public class ReverseListOrder {

    public static void main(String[] args){

        // Declaring an Integer type Linked List
        LinkedList<Integer> mList = new LinkedList<>();

        // Autoboxing a Integer ArrayList
        for (int i = 0; i < 10; i++){
            mList.add(i, i+1);
        }

        // Unboxing the ArrayList
        System.out.println("Given Linked List:");
        for (int i = 0; i < 10; i++){
            System.out.print(mList.get(i) + ",\t");
        }

        // Swapping Loop
        for (int i = 0; i <= (mList.size()/2) - 1; i++){
            swap(i, mList);
        }

        // Unboxing and printing the Reversed List
        System.out.println("\nReversed Linked List:");
        for (int i = 0; i <= mList.size()-1; i++){
            System.out.print(mList.get(i) + ",\t");
        }

    }

    // Function to Swap values
    private static void swap(int i, LinkedList<Integer> mList){

        // End item to be swapped with current Item
        int end = mList.size() - i - 1;

        // Temp Variable to store the value of current first Item
        int temp = mList.get(i);

        // Inter-changing/swapping the two values
        mList.set(i, mList.get(end));
        mList.set(end, temp);

    }

}
