package MultiThreading;
class ThreadCreation implements Runnable{
    public void run(){
        System.out.println("Thread running");
    }
}

public class ThreadCreationUsingRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadCreation());
        thread.start();
    }
}

