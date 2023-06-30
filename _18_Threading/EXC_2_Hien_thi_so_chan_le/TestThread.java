package _18_Threading.EXC_2_Hien_thi_so_chan_le;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}
