package datastructure.btree;

public class LinkedBinaryTree implements BinaryTree {

    private Node root; // 根节点

    public LinkedBinaryTree() {
    }

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        System.out.println("二叉树节点个数：");

        return this.size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            int suml = this.size(root.leftChild);

            int sumr = this.size(root.rightChild);

            return suml+sumr+1;
        }
    }

    @Override
    public int getHeight() {
        System.out.println("二叉树高度为：");
        return this.getHeight(root);
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            // 获取左子树高度
            int nl = this.getHeight(root.leftChild);
            // 获取右子树高度
            int nr = this.getHeight(root.rightChild);
            // 返回左子树右子树较大高度，并返回1
            return nl > nr ? nl+1 : nr+1;
        }
    }

    @Override
    public Node findKey(int value) {
        return null;
    }

    @Override
    public void preOrderTraverse() {
        // 输出根节点信息
        if (root != null) {
            System.out.print(root.data + " ");

            // 对左子树先序遍历，创建一个二叉树，根是左子树根
            BinaryTree leftTree = new LinkedBinaryTree(root.leftChild);
            leftTree.preOrderTraverse();

            BinaryTree rightTree = new LinkedBinaryTree(root.rightChild);
            rightTree.preOrderTraverse();
        }
    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序遍历：");
        inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node root) {
        if (root != null) {
            // 对左子树先序遍历，创建一个二叉树，根是左子树根
            this.inOrderTraverse(root.leftChild);

            System.out.print(root.data + " ");

            this.inOrderTraverse(root.rightChild);
        }
    }

    @Override
    public void postOrderTraverse() {
        System.out.println("后序遍历：");
        postOrderTraverse(root);
        System.out.println();
    }

    @Override
    public void postOrderTraverse(Node root) {
        if (root != null) {
            // 对左子树先序遍历，创建一个二叉树，根是左子树根
            this.postOrderTraverse(root.leftChild);

            this.postOrderTraverse(root.rightChild);

            System.out.print(root.data + " ");
        }
    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {

    }
}
