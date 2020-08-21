public class SelectionSortAlgorithm {

    private static int[] selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++){

            // Keeps track of current number
            int index = i;

            for (int j = i + 1; j < array.length; j++ )

                // Keeps track of smaller number
                if (array[j] < array[i])
                    index = j;

            // swapping
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;

        }

        return array;

    }

    public static void main(String[] args){

        int[] mArray = {1, 49, 26, 4, 28, 2, 34, 10};

        int[] sortedArray = selectionSort(mArray);

        for (int i = 0; i < sortedArray.length; i++)
            System.out.print(sortedArray[i] + ", ");

        System.out.print("\t");

    }

}
