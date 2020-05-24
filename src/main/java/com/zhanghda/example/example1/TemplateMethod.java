package com.zhanghda.example.example1;

/**
 * 模板模式
 */
public class TemplateMethod {

    /**
     * 定义好的模板方法  、不能重写
     */
    public final void templateMethod(){
        System.out.println("模板开始");
        aa();
        System.out.println("模板结束");
    }

    //子类实现的方法
    public void aa(){
    }

    public static void main(String[] args) {
        TemplateMethod templateMethod = new TemplateMethod() {
            @Override
            public void aa() {
                //可以任意修改
                System.out.println("子类实现啦");
            }
        };

        templateMethod.templateMethod();
    }
}
