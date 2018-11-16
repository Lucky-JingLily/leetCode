package datastructure.linetable;

import java.util.Deque;
import java.util.Queue;

public class TestSingleLinkedList {

    public static void main(String[] args) {
//        List list = new ArrayList();
        List list = new SingleLinkedList();

        Deque deque;
        Queue queue;

        list.add(123);
        list.add(321);
        list.add(456);
        list.add(654);
        list.add(3, 666);
        list.add(4,555);
        list.add(789);
        list.add(987);
        list.add(654);
        list.add(789);
        list.add(987);

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.get(11));

        System.out.println(list.toString());
    }
}
