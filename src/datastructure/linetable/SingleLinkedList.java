package datastructure.linetable;

public class SingleLinkedList implements List {

    private Node head = new Node(); // 头节点不存数据，为了编程方便

    private int size; // 节点个数

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        return p.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {

        if (i < 0 || i > size) {
            throw new MyArrayIndexOutOfBoundsException("链表越界异常");
        }
        // 找到前一个节点，从head节点开始
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        // 新创建一个节点，指向新节点后继
        Node newNode = new Node(e);
        // 指明新节点的直接后继节点
        newNode.next = p.next;
        // 指明新节点的前驱节点
        p.next = newNode;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size, e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder("[");
        Node p = head;
        for (int i = 0; i < size; i++) {
            // 移动到下一个节点
            p = p.next;
            if (i == size-1) {
                builder.append(p.data);
            } else {
                builder.append(p.data + ",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
