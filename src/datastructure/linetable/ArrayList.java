package datastructure.linetable;

import java.util.Arrays;

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
        if (i<0 || i>=size) {
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }
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
        if (i < 0 || i > size) {
            throw new MyArrayIndexOutOfBoundsException("数组索引越级异常");
        }
        if (size == elementData.length) {
            grow();
        }
//        System.out.println(size);
//        elementData[size++] = e;
        for (int j = size; j > i ; j--) {
            elementData[j] = elementData[j-1];
        }
        elementData[i] = e;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size, e);
//        if (size == elementData.length) {
//            grow();
//        }
//        // 给数组赋值
//        elementData[size] = e;
//        // 元素个数+1
//        size++;
////        System.out.println(size);
////        elementData[size++] = e;
    }

    private void grow() {
        //            // 新创建一个新的数组，长度是旧数组2倍
//            Object[] newArr = new Object[elementData.length*2];
//            // 将旧数组的旧数据拷贝到新数组
//            for (int i = 0; i < size; i++) {
//                newArr[i] = elementData[i];
//            }
//            // elementData指向新地址
//            elementData = newArr;
        elementData = Arrays.copyOf(elementData, elementData.length*2);
//            size = size * 2;
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

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i == size-1) {
                builder.append(elementData[i]);
            } else {
                builder.append(elementData[i] + ",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
