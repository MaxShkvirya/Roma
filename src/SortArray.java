import java.util.Arrays;

public class SortArray {
        public static void main(String[] args) {
            int[] unsortedArray = {2, 5, 4, 8, 7, 5, 4, 5, 5};
            System.out.println(Arrays.toString(unsortedArray));
            choiceSort(unsortedArray);


        }


        public static void choiceSort(int[] arrayToSort) {
            int indexMin;
            for (int index = 0; index < arrayToSort.length - 1; index++) {
                indexMin = index;
                for(int indexToScan=index;indexToScan<arrayToSort.length;indexToScan++)
                    if (arrayToSort[indexMin] > arrayToSort[indexToScan]) {
                        indexMin = indexToScan;
                    }
                int temp = arrayToSort[index];
                arrayToSort[index] = arrayToSort[indexMin];
                arrayToSort[indexMin] = temp;
            }



            System.out.println(Arrays.toString(arrayToSort));

        }
    }
