package testForLeetcode;

import java.util.Random;

/**
 * @Classname ListNode
 * @Description TODO
 * @Date 2019/11/25 2:43 下午
 * @Created by lipeijing
 */
public class SearchListNode {
    public static void main(String[] args) {
        ListNodeType head = new ListNodeType(1);
//        System.out.println(head.val);
        head.next = new ListNodeType(2);
//        System.out.println(head.next.val);
        head.next.next = new ListNodeType(3);
//        System.out.println(head.next.next.val);
//        System.exit(1);
        Solution solution = new Solution(head);

        System.out.println(solution.getRandom());
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNodeType {
    int val;
    ListNodeType next;

    ListNodeType(int x) {
        val = x;
    }
}

class Solution {

    private Random random = new Random();
    private ListNodeType listNodeHead = null;

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNodeType head) {
        listNodeHead = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int size = 1;
        ListNodeType pHead = listNodeHead;
//        System.out.println(pHead.val);
//        System.exit(1);
        while (pHead.next != null) {
            size += 1;
            pHead = pHead.next;
//            System.out.println("getRadom size = " + size);
        }
//        System.exit(0);
//        System.out.println("size = " + size);
        pHead = listNodeHead;
        int ran = random.nextInt(size);
        System.out.println(ran);
//        System.out.println(ran);
        int len = 0;
        while (pHead.next != null && len < ran) {
            pHead = pHead.next;
            len += 1;
        }
        return pHead.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
