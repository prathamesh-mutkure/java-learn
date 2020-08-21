public class InsertionSortAlgorithm {

    private static int[] insertionSort(int[] array){

        int temp;

        for (int i = 1; i < array.length; i++){

            for (int j = i; j > 0; j--){

                if (array[j] < array[j-1]){

                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;

                }

            }

        }

        return array;

    }

    public static void main(String[] args){

        int[] mArray = {1, 49, 26, 4, 28, 2, 34, 10};

        int[] sortedArray = insertionSort(mArray);

        for (int i = 0; i < sortedArray.length; i++){

            System.out.print(sortedArray[i] + ", ");

        }

    }

}
