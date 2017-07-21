package by.nastin.sort.sleep;

import java.util.concurrent.CountDownLatch;
//It doesn't work yet
public class SleepSort {

    public static int[] sort(int[] mass) {
        int[] sortedMass = new int[mass.length];
        final CountDownLatch doneSignal = new CountDownLatch(mass.length);
        for (final int num : mass) {
            new Thread(() -> {
                doneSignal.countDown();
                try {
                    doneSignal.await();
                    //using straight milliseconds produces unpredictable
                    //results with small numbers
                    Thread.sleep(mass[num] * 10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }).start();
        }
        return sortedMass;
    }


    public static void sleepSortAndPrint(int[] nums) {
        final CountDownLatch doneSignal = new CountDownLatch(nums.length);
        for (final int num : nums) {
            new Thread(() -> {
                doneSignal.countDown();
                try {
                    doneSignal.await();

                    //using straight milliseconds produces unpredictable
                    //results with small numbers
                    //using 1000 here gives a nifty demonstration
                    Thread.sleep(num * 1000);
                    System.out.println(num +" )_)");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}