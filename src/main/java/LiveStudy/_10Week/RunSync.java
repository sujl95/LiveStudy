package LiveStudy._10Week;

import java.util.concurrent.ExecutorService;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int loop = 0; loop < 5; loop++) {
            runSync.runCommonCalculate();
        }
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

//        ExecutorService ex = Executors.newFixedThreadPool(10);
//        excute(calc, ex);
//        excute(calc, ex);
//        ex.shutdown();
//        System.out.println("Final value is " + calc.getAmount());
        thread1.start();
        thread2.start();
//        thread3.start();
//        thread4.start();

        try {
//            Thread.yield(); //독점
            thread1.join();
//            System.out.println("calc.Thread1=>"+calc.getAmount());
            thread2.join();
//            System.out.println("calc.Thread2=>"+calc.getAmount());

//            thread3.join();
//            thread4.join();
            System.out.println("Final value is " + calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void excute(CommonCalculate calc, ExecutorService ex) {
        ex.submit(()-> {
            for(int loop = 0; loop<10000;loop++){
                if (true) {
                    calc.plus(1);
                } else {
                    calc.minus(1);
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"=>"+ calc.getAmount());
        });
    }
}
