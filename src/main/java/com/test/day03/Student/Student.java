package com.test.day03.Student;

/**
 * Created by JiChenGuang on 16/3/19.
 */
public class Student {
        static int totalNo = 0;
        String name;
        int age;
        Student(String name, int age) {
            totalNo++;
        }

        public static void speak() {
            System.out.println("我是红领巾。");
        }

        public int getTotalNo() {
            return totalNo;
        }



}
