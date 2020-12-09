package LiveStudy._4Week;

import java.util.Arrays;

public class ListNodeStack {
    /**
     * int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
     * void push(int data)를 구현하세요.
     * int pop()을 구현하세요.
     */
    int[] data;
    int size;
    int pos;


    public ListNodeStack() {
        this.size = 10;
        this.data = new int[size];
        this.pos = 0;
    }

    /**
     * 생성할때 0번째 값 지정
     * @param data
     */
    public ListNodeStack(int data) {
        this.size = 10;
        this.data = new int[size];
        this.pos = 1;
        this.data[0] = data;
    }

    public void push(int data) {
        if (this.size == this.pos +1) {
            int[] newData = new int[size + 10];
            for (int i = 0; i< size; ++i) newData[i] = this.data[i];
            size += 10;
            this.data = newData;
        }
        this.data[this.pos++] = data;
    }

    public int pop() {
//        System.out.println("pos="+pos);
        if (this.pos == 0) {
            System.out.println("size = 0");
            return -1;
        }
        int resData = data[this.pos-1];
        data[this.pos-1] = 0;
        --this.pos;
        return resData;
    }

    @Override
    public String toString() {
        return "ListNodeStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", pos=" + pos +
                '}';
    }
}
