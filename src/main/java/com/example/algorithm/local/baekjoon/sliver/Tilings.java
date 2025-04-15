package com.example.algorithm.local.baekjoon.sliver;

import java.util.Scanner;

public class Tilings {
    //백준 2xN 타일링2 문제입니다. 번호는 11727입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[n]%10007);
    }
}
