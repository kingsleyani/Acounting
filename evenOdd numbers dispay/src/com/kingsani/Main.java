package com.kingsani;

public class Main {

    public static void main(String[] args) {
    int a[] = {1,5,4,8,9,6,7,13,17,14,16,19,2,10};
        System.out.print("odd numbers :: ");
    for(int i = 0;i<a.length;i++){
        if(a[i]%2!=0){
            System.out.print(a[i] + ",");
        }
    }
        System.out.println();
        System.out.print("Even numbers :: ");
    for( int i = 0;i<a.length; i++){
        if (a[i]%2==0){
            System.out.print(a[i] + ",");
        }
    }
    }
}
