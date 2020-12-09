package LiveStudy._4Week;

public class ListNode {

    /**
     * ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
     * ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
     * boolean contains(ListNode head, ListNode nodeTocheck)를 구현하세요.
     */

    private int data;
    private boolean headCk;
    private ListNode next;
    private int size = 0;


    public ListNode() {
        headCk = true;
    }

    public ListNode(int data) {
        this.data = data;
    }

    /**
     *
     * @param head
     * @param nodeToAdd
     * @param position
     * @return
     */
    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (position == 0) {
            ListNode temp = head.next;
            head.next = nodeToAdd;
            nodeToAdd.next = temp;
            size++;
            return nodeToAdd;
        }
        if (head.next != null) {
            return add(head.next, nodeToAdd, position-1);
        }
        size++;
        head.next = nodeToAdd;
        return nodeToAdd;
    }


    /**
     * 현재 사이즈 보다 큰 값이 들어올 경우 마지막 노드의 값을 삭제한다
     * @param head
     * @param positionToRemove
     * @return
     */
    public ListNode remove(ListNode head, int positionToRemove) {
        if (size == 0) {
            System.out.println("size = 0");
            return null;
        }
        ListNode temp = head;
        int sizeCk = positionToRemove > size ? size : positionToRemove;
        for (int i = 0; i < sizeCk-1; i++) {
            temp = temp.next;
        }
        ListNode temp1 = temp.next;
        temp.next = temp1.next;
        temp1.next = null;
        size--;
        return head;
//        return temp1;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode temp = head.next;
        if (temp == null) return false;
        if(temp.data == nodeToCheck.data) return true;
        else return contains(temp, nodeToCheck);
    }

    @Override
    public String toString() {
        if (next != null) {
            if (headCk) {
                return "--start\n"+next.toString();
            }
            return data+"\n"+next.toString();
        }
        return data+"\n--end";
    }

    public int getSize() {
        return size;
    }

    public int getData() {
        return data;
    }
}
