package datastructure.btree;

public class Test {

    public static void main(String[] args) {
        // 创建二叉树
        Node node5 = new Node(5, null, null);
        Node node4 = new Node(4, null, node5);
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, null, node7);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node3, node6);
        Node node1 = new Node(1, node4, node2);

        BinaryTree btree = new LinkedBinaryTree(node1);
//        BinaryTree btree = new LinkedBinaryTree();

        // 判断二叉树是否为空
        System.out.println(btree.isEmpty());

        // 先序遍历递归
        System.out.println("先序遍历：");
        btree.preOrderTraverse();
        System.out.println();

        // 中序遍历递归
        btree.inOrderTraverse();

        // 后续遍历递归
        btree.postOrderTraverse();

        // 中序遍历非递归（栈）

        // 层次遍历（队列）

        // 在二叉树中查找某个值

        // 二叉树高度
        System.out.println(btree.getHeight());

        // 二叉树节点数
        System.out.println(btree.size());
    }
}
