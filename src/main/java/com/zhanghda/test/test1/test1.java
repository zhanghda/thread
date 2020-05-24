package com.zhanghda.test.test1;

public class test1 {

    public static void main(String[] args) {
        Thread thread = new Thread("aa") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        String name = Thread.currentThread().getName();
        System.out.println(name+"22");
        thread.start();
//
//        new Runnable() {
//            public void run() {
//
//            }
//        }

//        thread.run();  //调用run方法只能启动一个main线程
    }
}
