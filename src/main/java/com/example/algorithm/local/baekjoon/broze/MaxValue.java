package com.example.algorithm.local.baekjoon.broze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        for(int i =0; i<9; i++){
            arr.add(in.nextInt());
        }

        int count = 0;
        int max = 0;
        int i = 0;

        for(int value : arr) {
            count++;

            if(value > max) {
                max = value;
                i = count;
            }
        }
        System.out.print(max + "\n" + i);

    }
}
