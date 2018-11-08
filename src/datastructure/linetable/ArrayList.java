package datastructure.linetable;

/**
 * 顺序表
 * 底层采用的数组，但是长度可以动态的变化
 */

public class ArrayList implements List {

    // 底层是一个数组，未确定长度
    private Object[] elementData;

    // 元素的个数，非数组分配的空间
    private int size;

    /**
     * 无参构造
     */
    public ArrayList() {
        // 没有指定长度，默认为4
        this(4);

        // 没有指定长度，长度是0
//        elementData = new Object[]{};
    }

    /**
     * 指定数组初始长度
     * @param initialCapacity
     */
    public ArrayList(int initialCapacity) {
        // 给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        // 指定顺序表的元素个数
//        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        return elementData[i];
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

    }

    @Override
    public void add(Object e) {
        // 给数组赋值
        elementData[size] = e;
        // 元素个数+1
        size++;

//        elementData[size++] = e;
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
}
