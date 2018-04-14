package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 利用单个的线程池完成线程的顺序执行
 */
public class SingleThread  {

    public static void main(String[] args) {
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        Thread A = new A("A");
        Thread B = new B("B");
        Thread C = new C("C");

        singlePool.execute(A);

        singlePool.execute(C);
        singlePool.execute(B);
        singlePool.shutdown();
    }


}
