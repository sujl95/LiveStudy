package LiveStudy._10Week;

public class ModifyAmountThread extends Thread{
    private CommonCalculate calc;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate calc, boolean addFlag) {
        this.calc = calc;
        this.addFlag = addFlag;
    }

    public void run() {
        for(int loop = 0; loop<10000;loop++){
            if (addFlag) {
                calc.plus(1);
                calc.addInterest(1);
            } else {
                calc.minus(1);
            }
        }
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+"=>"+ calc.getAmount());
    }
}
