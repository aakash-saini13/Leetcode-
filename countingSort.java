class countingSort {
public static void main(String[] args) {
    int[] arr = {4, 2, 2, 8, 3, 3, 1};
    int max = findMax(arr);
    int[] sorted = countingSort(arr, max);
    System.out.println("Sorted array: " + Arrays.toString(sorted));
}

}
