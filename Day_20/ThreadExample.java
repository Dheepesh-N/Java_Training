class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is Running Using Thread Class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is Running Using Runnable");
    }
}


public class ThreadExample {
    public static void main(String[] args) {
        SampleThread samp=new SampleThread();
        samp.start();
        Thread t=new Thread(new SampleThread2());
        t.start();
    }
}
