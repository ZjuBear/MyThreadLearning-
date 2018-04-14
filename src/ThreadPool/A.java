package ThreadPool;

public class A extends Thread {


    public A(String MyThread) {
        Thread.currentThread().setName(MyThread);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"A "+i);
        }
    }
}
