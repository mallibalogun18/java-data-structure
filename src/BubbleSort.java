public class BubbleSort {
/*Bubble sort exercise. Time complexity O(n2)
Bubble Sort is an easy-to-implement, stable sorting algorithm with a time complexity
of O(n²) in the average and worst cases – and O(n) in the best case
 */
    public static void main(String[] args) {

        int intArray[] = {20, 12, -12, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    //create a swap method for the bubble sort
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
