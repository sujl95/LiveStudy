package LiveStudy._4Week;

public class ListNodeStack2 {
    ListNode head;
    int size = 0;

    public ListNodeStack2() {
        head = new ListNode();
    }

    public void push(int data) {

        head.add(head, new ListNode(data), size++);
    }

    public int pop() {
        try {
            head.remove(head, size--);

            return head.getData();
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public String toString() {
        return ""+head;
    }
}
