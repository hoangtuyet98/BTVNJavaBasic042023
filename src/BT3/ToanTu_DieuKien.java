package BT3;

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class ToanTu_DieuKien {
static int  number=100;
    public static void  dieuKien(int n){
    if(n==number)
    System.out.println("n = 100");
        if(n>number)
            System.out.println("n > 100");
        if(n<number)
            System.out.println("n > 100");
        else System.out.println(" khong thoa man dk nao");
    }
    public static void main(String[] args) {
        dieuKien(105);
        int a = 12;
        int b = 17;
        int c = 202;
       if ((c > a) && (a > b)){
           System.out.println(" điều kiện đúng1 ");
       }
        if ((c > a) || (a > b)){
            System.out.println(" điều kiện đúng2");
        }
        if(c==a){
            System.out.println(" điều kiện đúng3");
        }
else System.out.println("dien kiện sai");

        }

    }

