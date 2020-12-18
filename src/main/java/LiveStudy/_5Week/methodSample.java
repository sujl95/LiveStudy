package LiveStudy._5Week;

public class methodSample {
    public static void main(String[] args) {
        methodSample sample = new methodSample();
        int i = sample.methodTest(1,2);
        System.out.println(i);
    }

    public int methodTest(int a , int b) {
        int sum = a + b;

        return sum;
    }
}
