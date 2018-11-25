package testForLeetcode;

import datastructure.linetable.List;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListNode num1 = new ListNode(2);
        num1.add(new ListNode(4));
        num1.add(new ListNode(3));
        System.out.println("num1=" + num1.toString());
        ListNode num2 = new ListNode(5);
        num2.add(new ListNode(6));
        num2.add(new ListNode(4));
        System.out.println("num2=" + num2.toString());

        if (num1.size == num2.size) {
            ListNode p1 = num1;
            ListNode p2 = num2;
            int tmp;
            for (int i = num1.size; i >= 0; i--) {
//                int
                tmp = p1.val + p2.val;
                p1.val = tmp;
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        System.out.println(num1.toString());
    }
}

class ListNode {
    int val;
    ListNode next;
    int size;

    public ListNode(int x) {
        this.val = x;
    }

    public void add(ListNode e) {
        // 找到前一个节点，从head节点开始
        ListNode p = this;
        for (int i = 0; i < size ; i++) {
            p = p.next;
        }
        p.next = e;
        size++;
//        System.out.println("size="+size);
    }

    public String toString() {
        ListNode p = this;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            str.append(p.val);
            p = p.next;
        }
        return str.toString();
    }
}