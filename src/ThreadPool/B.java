package ThreadPool;

public class B extends Thread {

    public B(String B) {
        Thread.currentThread().setName(B);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"B "+i);
        }
    }
}
