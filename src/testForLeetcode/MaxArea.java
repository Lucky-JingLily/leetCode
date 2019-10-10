package testForLeetcode;

/**
 * @Classname MaxArea
 * @Description 盛水多的容器
 * @Date 2019/10/9 2:19 下午
 * @Created by lipeijing
 */
public class MaxArea {
//    public int maxArea(int[] height) {
//        int maxArea = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int minHigh = min(height[i], height[j]);
////                System.out.println("min=" + minHigh);
//                int covert = j - i;
//                int area = minHigh * covert;
//                if (area > maxArea) {
//                    maxArea = area;
//                }
//            }
////            System.out.println("maxArea=" + maxArea);
//        }
//        return maxArea;
//    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            int minHight = min(height[left], height[right]);
            int convert = right - left;
            int area = minHight * convert;
            if (area > maxArea) {
                maxArea = area;
            }
//            System.out.println("minHight = " + minHight);
//            System.out.println("convert = " + convert);
//            System.out.println("maxArea = " + maxArea);
//            System.out.println();
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static int maxSumRec(int[] a, int left, int right) {
        if (left == right) {
            return 0;
        }

        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);

        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
             maxLeftBorderSum = 0;
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }

        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }

    public static int max3(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        } else {
            max = max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,18,17,6};
        System.out.println(new MaxArea().maxArea(a));
    }
}
