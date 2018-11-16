package datastructure.btree;

public class Node {

    Object data;
    Node liftChild;
    Node rightChild;

    public Node() {

    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node liftChild, Node rightChild) {
        this.data = data;
        this.liftChild = liftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", liftChild=" + liftChild +
                ", rightChild=" + rightChild +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLiftChild() {
        return liftChild;
    }

    public void setLiftChild(Node liftChild) {
        this.liftChild = liftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
