package com.zhanghda.test.test2;

/**
 * 售票机改造 实现不使用功能共享static变量，将业务和线程启用分离
 */
public class TicketWindowsRunnable implements Runnable{

    private static int Max = 50;
    private int index;

    public void run() {
        while (index <= Max){
            System.out.println(Thread.currentThread() + "叫到"+index++);
        }
    }
}
