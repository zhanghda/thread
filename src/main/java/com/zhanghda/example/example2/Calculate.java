package com.zhanghda.example.example2;

/**
 * 添加函数式接口，以便于使用不同的策略，创建不同的子类即可
 */
@FunctionalInterface
public interface Calculate {

    double calculate(double salary,double douns);
}
