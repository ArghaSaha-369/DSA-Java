package Array;

public class SecondLargestWithoutSorting {
    public static int secondLargest (int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Must be Two Numbers at least");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,7,9};
        System.out.println(secondLargest(arr));
    }
}
