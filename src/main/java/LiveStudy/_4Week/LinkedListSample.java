package LiveStudy._4Week;

import org.w3c.dom.Node;

import java.util.LinkedList;


public class LinkedListSample {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }

    }

    /**
     * 첫번째 노드에 추가
     * @param data 데이터
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) tail = head;
    }

    /**
     * 마지막번째 노드에 추가
     * @param data 데이터
     */
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (size == 0) {
            addFirst(data);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int idx) {
        Node h = head;
        for (int i = 0; i < idx; i++)
            h = h.next;

        return h;
    }


    /**
     * 크기가 0일때 첫번째 노드에 추가
     * 아닐때 해당 k번째 노드에 추가
     * @param k
     * @param data
     */
    public void add(int k, int data) {
        if (k == 0) {
            addFirst(data);
        } else {
            // k 번째 노드를 생성
            Node temp1 = node(k-1);
            // k 번째 다음 노드를 임시 노드에 넣어준다
            Node temp2 = temp1.next;
            // 새로운 노드를 생성
            Node newNode = new Node(data);
            // k 다음 번째 노드로 새로운 노드를 지정해준다
            temp1.next = newNode;
            // 새로운 노드의 다음 노드로 temp2를 지정해준다
            newNode.next = temp2;
            // 노드를 추가했으니 사이즈를 증가해준다
            size++;

            // 새로운 노드의 다음 노드가 없다면 새로운 노드가
            // 마지막 노드이기 때문에 마지막 노드를 지정해준다
           if (newNode.next == null)
                tail = newNode;

        }
    }

    @Override
    public String toString() {
        // 노드가 없으면 빈 []를 리턴해준다
        if (head == null) return "[]";
        // 탐색
        Node temp = head;
        String str = "[";

        // 다음 노드가 없을 때까지 반복
        // 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외
        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }

        // 마지막 노드를 출력 결과에 포함
        str += temp.data;
        return str+"]";
    }

    /**
     * 첫 번째 노드를 삭제하고 그 값을 반환해준다
     * @return
     */
    public int removeFirst() {
        // 첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경한다
        Node temp = head;
        head = temp.next;
        // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담는다.
        int returnData = temp.data;
        temp = null;
        // 사이즈 줄여준다
        size--;
        return returnData;
    }


    /**
     * k-1번째 노드를 삭제하고 그 값을 반환한다
     * @param k
     * @return
     */
    public int remove(int k) {
        // k가 0일때 첫번째 노드를 삭제한다
        if (k == 0) return removeFirst();

        // k-1번재 노드를 temp1의 값으로 지정한다
        Node temp1 = node(k-1);
        // 삭제 노드를 temp2에 지정한다
        Node temp2 = temp1.next;
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정
        temp1.next = temp1.next.next;
        // 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장
        int returnData = temp2.data;
        // temp2가 null 일때 마지막 값을 temp1로 지정해준다
        if (temp2 == null) tail = temp1;
        // cur.next를 삭제 한다

        temp2 = null;
        size--;
        return returnData;

    }

    /**
     * 마지막 노드 값-1을 삭제하면 마지막 노드를 삭제가 가능하다
     * @return
     */
    public int removeLast() {
        return remove(size-1);
    }

    /**
     * size 값을 반환
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * k-1번째 데이터를 반환해준다
     * @param k
     * @return
     */
    public int get(int k) {
        Node temp = node(k);
        return temp.data;
    }

    public static void main(String[] args) {
        LinkedListSample linkedList = new LinkedListSample();
        linkedList.addFirst(1);
        linkedList.addFirst(3);

        System.out.println(linkedList.toString());

    }
}
