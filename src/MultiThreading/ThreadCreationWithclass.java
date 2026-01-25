package MultiThreading;

class createThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class ThreadCreationWithclass {
    public static void main(String[] args) {
        createThread obj = new createThread();
        obj.start();
    }
}

