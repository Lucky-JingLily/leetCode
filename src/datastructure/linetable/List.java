package datastructure.linetable;

public interface List {

    public int size();

    public Object get(int i);

    public boolean isEmpty();

    public boolean contains(Object e);

    public int indexOf(Object e);
    // 将数据元素e插入到线性表中i号位置
    public void add(int i, Object e);
    // 将数据元素e插入到线性表末尾
    public void add(Object e);
    // 将数据元素e插入到元素obj之前
    public boolean addBefore(Object obj, Object e);

    public boolean addAfter(Object obj, Object e);
    // 删除线性表中i号元素并返回
    public Object remove(int i);

    public boolean remove(Object e);

    public Object replace(int i, Object e);
}
