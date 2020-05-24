package com.zhanghda.test.test2;

/**
 * 模拟柜台
 */
public class CounterRunnable {

    public static void main(String[] args) {
        TicketWindowsRunnable ticketWindowsRunnable = new TicketWindowsRunnable();
        //模拟三个柜台
        Thread thread = new Thread(ticketWindowsRunnable, "一号柜台");
        Thread thread2 = new Thread(ticketWindowsRunnable, "二号柜台");
        Thread thread3 = new Thread(ticketWindowsRunnable, "三号柜台");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
