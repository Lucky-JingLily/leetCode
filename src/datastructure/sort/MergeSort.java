package datastructure.sort;

import testForLeetcode.MergePass;

/**
 * @Classname MergeSort
 * @Description 归并排序
 * @Date 2019/10/9 12:44 下午
 * @Created by lipeijing
 */
public class MergeSort {
    public static void sort(int[] a, int left, int right) {
        if (left == right) {
            return;
        } else {
            int mid = (left + right) / 2;
            sort(a, left, mid);
            sort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
                k++;
            } else {
                temp[k] = a[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k] = a[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = a[j];
            k++;
            j++;
        }

        for (int l = 0; l < temp.length; l++) {
            a[l + left] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 23, 4, 3};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
