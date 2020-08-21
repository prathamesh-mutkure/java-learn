public class BubbleSortAlgorithm {

    private static void bubbleSort(int[] array) {

        int n = array.length;
        for (int j=0; j<n-1; j++)

            for (int i = 0; i < n-1-j; i++)

                if (array[i] > array[i+1])
                    swapNumbers(i, i+1, array);

            printNumbers(array);
    }

    private static void swapNumbers(int i, int j, int[] array)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] array)
    {
        for (int value : array) System.out.print(value + ", ");
        System.out.println("\n");
    }


    public static void main(String[] args) {

        int[] mArray = {1, 49, 26, 4, 28, 2, 34, 10};

        bubbleSort(mArray);
    }

}
