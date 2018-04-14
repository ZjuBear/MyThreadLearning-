package ThreadPool;

public class C extends Thread {
    public C(String C) {
        Thread.currentThread().setName(C);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"C "+i);
        }
    }
}