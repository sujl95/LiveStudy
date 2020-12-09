package LiveStudy._4Week;

public class ListNodeStackSample2 {
    public static void main(String[] args) {

        ListNodeStack2 stack = new ListNodeStack2();
        stack.push(0);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.toString());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
    }
}
