package com.test.day03.Master;

/**
 * Created by JiChenGuang on 16/3/19.
 */
public class Animal {


        private String name;
        private int age;
        //动物都会叫唤
        public void cry() {
            System.out.println("动物都会叫唤，但是具体的某一个种类的动物叫唤方式不同，需要重写我的cry方法");
        }
        public void eat(){

        }

}
