package testForLeetcode;

/**
 * leetcode 找中位数
 */

public class MergePass {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] allNum = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            allNum[i] = nums1[i];
        }
        for (int i = 0, j = nums1.length; i < nums2.length; i++) {
            allNum[j++] = nums2[i];
        }

        mergeSort(allNum);

        int center1 = 0, center2 = -1;
        if (allNum.length % 2 == 0) {
            center1 = allNum.length / 2;
            center2 = center1 - 1;
        } else {
            center1 = allNum.length / 2;
        }

        if (center2 != -1) {
            return (allNum[center1] + allNum[center2]) / 2.0;
        } else {
            return allNum[center1];
        }
    }

    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int L, int R) {
        if(L == R) {
            return;
        }
        int mid = (L + R) / 2;
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while(p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while(p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while(p2 <= R) {
            temp[i++] = arr[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for(i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(new MergePass().findMedianSortedArrays(a, b));
    }
}
