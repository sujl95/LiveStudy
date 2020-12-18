package LiveStudy._5Week;
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(Node left, Node right, int value) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

}