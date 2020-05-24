package com.zhanghda.test.test2;

/**
 * 模拟银行叫号系统
 * 此方法实现需要将号码数定义成static 否则会造成每个柜台都会有一个变量，
 * 弊端： static会存在jvm中 即使实例变量被回收，static 修饰的变量可能还存在
 */
public class TicketWindows extends Thread{

    //最大号
    private static final int MAX_NUMBER = 50;
    //当前号的数量
    private static int index = 1;

    //当前属于几号柜台
    private String name;

    public TicketWindows(String name) {
        this.name = name;
    }

    public void run() {
        while (index <= MAX_NUMBER){
            System.out.println(name + "叫到"+ index++ + "号");
        }
    }
}
