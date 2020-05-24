package com.zhanghda.example.example2;

/**
 * 策略模式   多线程中有两种设计 分别为策略模式和模板模式
 */
public class StoreStrategy {
    //工资
    private double salary;
    //奖金
    private double bonus;

    private Calculate calculate;

    public StoreStrategy(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public StoreStrategy(double salary, double bonus, Calculate calculate) {
        this.salary = salary;
        this.bonus = bonus;
        this.calculate = calculate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public double getResult(){
        return calculate.calculate(salary,bonus);
    }

    public double content(){
        return getResult();
    }
}
