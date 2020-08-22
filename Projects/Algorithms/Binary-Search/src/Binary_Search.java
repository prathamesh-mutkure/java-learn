import java.util.*;

public class Binary_Search {

    public static void main (String[] args) {

        // TO store data
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();

        // Generate random values
        for (int i=0; i<50; i++)
            arr.add(random.nextInt(50));

        System.out.println("\nRandom Array: ");
        for (int val : arr)
            System.out.print(val + " ");

        // sorting
        arr.sort(null);

        System.out.println("\n\nSorted Array: ");
        for (int val : arr)
            System.out.print(val + " ");

        int result = binarySearch(arr,20);

        if (result == -1)
            System.out.println("\n\nItem not found");
        else
            System.out.println("\n\nItem found at Index: " + (result+1));

    }


    private static int binarySearch(ArrayList<Integer> arr, int searchValue) {

        int first = 0;
        int last = arr.size();

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (arr.get(mid) == searchValue)
                return mid;

            if (searchValue < arr.get(mid))
                last = mid - 1;

            else
                first = mid + 1;
        }
        return -1;
    }

}
