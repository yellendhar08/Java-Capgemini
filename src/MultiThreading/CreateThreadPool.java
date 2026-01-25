package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
        int id;
        public Task(int id){
            this.id=id;
        }
        public  void run(){
            System.out.println("Task: "+id+" executed by: "+Thread.currentThread().getName());
        }
}

public class CreateThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i=1; i<=6; i++){
            service.execute(new Task(i));
        }
        service.shutdown();
    }
}
