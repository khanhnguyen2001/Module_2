package _18_Threading.TH_3_Xay_dung_ung_dung_dem_so;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("TestThread thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("TestThread thread interrupted");
        }
        System.out.println("TestThread thread run is over");
    }
}
