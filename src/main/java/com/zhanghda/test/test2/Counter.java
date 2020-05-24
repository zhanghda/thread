package com.zhanghda.test.test2;

/**
 * 模拟柜台
 */
public class Counter {

    public static void main(String[] args) {
        //模拟三个柜台
        TicketWindows ticketWindows1 = new TicketWindows("一号柜台");
        TicketWindows ticketWindows2 = new TicketWindows("二号柜台");
        TicketWindows ticketWindows3 = new TicketWindows("三号柜台");
        ticketWindows1.start();
        ticketWindows2.start();
        ticketWindows3.start();
    }
}
