package com.kingsani;

import java.util.concurrent.Callable;

class Calc
{
    int  num1;
    int num2;
    int result;
    public Calc()
    {
        num1 = 5;
        num2 = 5;
        System.out.println("in constructor");
    }
    public Calc(int n)
    {
        num1 = n;
        num2 = n;
}

    public class calc ObjectDemo {
    public static void main(String[] args) {
        {
        Calc obj = new Calc(4,5);
        System.out.println(obj.num1);
            System.out.println(obj.num2);
        }
    }


}
}
