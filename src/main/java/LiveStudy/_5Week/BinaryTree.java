package LiveStudy._5Week;

import java.util.*;

public class BinaryTree {


     private static Node root;
     private static BinaryTree binaryTree;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public static Node getRoot() {
        return root;
    }

    public void dfs(Node root) {
        if (root == null) return;
        dfs(root.getLeft());
        System.out.println(root.getValue()+" ");
        dfs(root.getRight());
    }

    public void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.println(node.getValue()+" ");
            if (node.getLeft() != null)
                q.offer(node.getLeft());
            if (node.getRight() != null)
                q.offer(node.getRight());
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node node15 = new Node(null,null,15);
        Node node14 = new Node(null,null,14);
        Node node13 = new Node(null,null,13);
        Node node12 = new Node(null,null,12);
        Node node11 = new Node(null,null,11);
        Node node10 = new Node(null,null,10);
        Node node9 = new Node(null,null,9);
        Node node8 = new Node(null,null,8);
        Node node7 = new Node(node14,node15,7);
        Node node6 = new Node(node12,node13,6);
        Node node5 = new Node(node10,node11,5);
        Node node4= new Node(node8,node9,4);
        Node node3 = new Node(node6,node7,3);
        Node node2 = new Node(node4,node5,2);
        Node node1 = new Node(node2,node3,1);

        binaryTree = new BinaryTree(node1);
        root = binaryTree.getRoot();
        binaryTree.bfs(root);
        binaryTree.dfs(root);

    }
}
