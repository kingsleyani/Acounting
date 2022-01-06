package com.kingsani;

public class Main {

    public static void main(String[] args) {
        for load in [0.3, 0.5, 0.6, 0.8]:
        num_bucket = 2
        load_fac = 0

        for i in range(1,4):
        load_fac = i / num_buc
        if load_fac > load:
        num_bucket *= 2
        if num_bucket == 8:
        print(load)

    }
}
