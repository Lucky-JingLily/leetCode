package datastructure.stackqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 十进制转换成二进制
 */
public class TestConvert {
    public static void main(String[] args) {
        // 给定十进制数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入十进制数：");
        int n = input.nextInt();
        // 把十进制数转换成二进制
        int t = n; // 被除数
//        String str = "";
        // 定义一个空栈
        Deque stack = new LinkedList();
        do {
            // 除以2求余数
            int mod = t % 2;
            // 输出余数
//            System.out.println(mod);
//            str = mod + str;
            stack.push(mod);
            // 除以2得到商，使用商做除数
            t = t / 2;
        } while (t != 0);
        // 输出结果
        System.out.println("转换二进制为：");
        System.out.print(n + "-->");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
