package LiveStudy._5Week;

public class constructorSample {
    int i ;
    int a ;

    constructorSample(int i, int a) {
        this.i = i;
        this.a = a;
    }

    constructorSample() {
        this(1,3);
    }

    public static void main(String[] args) {
        constructorSample sample = new constructorSample(1,2);
        constructorSample sample1 = new constructorSample();
    }
}
