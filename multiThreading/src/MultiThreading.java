class  MultiThread implements Runnable{
    @Override
    public  void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread :" + Thread.currentThread().getId());

        }
    }
}

public class MultiThreading{
    public static void main(String[] args) {
        MultiThread ml = new MultiThread();
        Thread tr = new Thread(ml);
        tr.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread :" + Thread.currentThread().getId());

        }

    }
}