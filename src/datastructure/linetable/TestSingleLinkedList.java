package datastructure.linetable;

public class TestSingleLinkedList {

    public static void main(String[] args) {
//        List list = new ArrayList();
        List list = new SingleLinkedList();

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
//        list.add(111, 123);
        System.out.println(list.get(10));

        System.out.println(list.toString());
    }
}
