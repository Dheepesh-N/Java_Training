import java.nio.channels.InterruptedByTimeoutException;

public class compile_time_Exceeption {
    public static void main(String[] args){
        Thread t=new Thread(()->{
        try{
            System.out.println("Thread Sleep");
            Thread.sleep(5000);
            System.out.println("Thread wake");
        }
        catch(InterruptedException e){
            System.out.println("SLeep Interrupted");
        }
    });
    t.start();
    try{
        Thread.sleep(100000);
    }
    catch(Exception e){
        System.out.println("not T");

    }
    t.interrupt();

    }
}
