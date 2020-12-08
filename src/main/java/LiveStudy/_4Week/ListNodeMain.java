package LiveStudy._4Week;



public class ListNodeMain {
    public static void main(String[] args) {
        ListNode head = new ListNode();

        head.add(head , new ListNode(5), 1);
        head.add(head , new ListNode(6), 2);
        head.add(head , new ListNode(7), 3);
        head.remove(head, 3);
        System.out.println(head.contains(head, new ListNode(3)));
        System.out.println(head.getSize());
        System.out.println(head.toString());
    }
}
