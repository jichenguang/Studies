package com.test.day0102;

/**
 * Created by JiChenGuang on 16/3/12.
 */
public class Debug {

    public static void main(String[] args) {

        int a = 1;
        while (true) {
            a++;

            //当a大于3的时候，跳出循环
            if (a > 3) {
                break;
            }
        }

        System.out.println(a);

        a = 1;
        while (a < 10) {
            a++;
            //当a的值能被2整除，表示该数不是奇数
            if (a % 2 == 0) {
                continue;                 //跳过下面的语句，进入下一次循环
            }
            System.out.print(a + " ");
        }

        return;
    }
    }

