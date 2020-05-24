package com.zhanghda.example.example2;

/**
 * 策略模式   多线程中有两种设计 分别为策略模式和模板模式
 */
public class StoreStrategyMain {


    public static void main(String[] args) {

//        StoreStrategy storeStrategy = new StoreStrategy(1000, 200);
//        double result = storeStrategy.getResult();
//        System.out.println(result);

        StoreStrategy storeStrategy = new StoreStrategy(1000, 20, new SampleCalculate());
        double content = storeStrategy.content();
        System.out.println(content);
    }

}
