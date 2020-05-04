import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;


public class T07_TestCyclicBarriner {

    static CyclicBarrier barrier = new CyclicBarrier(20, new Runnable() {
        @Override
        public void run() {
            System.out.println("人满,发车");
        }
    });

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            new Thread(() -> {
                try {
                    /**
                     * 阻塞式方法,如果线程不满20的话，就会一直阻塞
                     */
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
