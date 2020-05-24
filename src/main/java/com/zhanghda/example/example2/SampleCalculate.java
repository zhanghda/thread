package com.zhanghda.example.example2;

/**
 * 接口的具体实现
 */
public class SampleCalculate implements Calculate {
    @Override
    public double calculate(double salary, double douns) {
        return salary - douns;
    }
}
