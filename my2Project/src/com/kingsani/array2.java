package com.kingsani;

import java.util.Arrays;

public class array2 {
    public static void main(String[]args){
        int[] numbers = {1,2,2,5,8};
        System.out.println(numbers.length);
        System.out.println(Arrays.stream(numbers).max());
        System.out.println(Arrays.toString(numbers));
    }
}
