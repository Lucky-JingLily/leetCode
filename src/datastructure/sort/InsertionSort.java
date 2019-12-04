package datastructure.sort;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        int in, out;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < i; j++) {
                if (temp < arr[j]) {
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = temp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6};
        new InsertionSort().insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
