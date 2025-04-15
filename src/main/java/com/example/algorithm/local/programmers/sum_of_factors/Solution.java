package com.example.algorithm.local.programmers.sum_of_factors;

public class Solution {
    public long solution(int n) {
        // 프로그래머스 약수의 합 문제입니다. 번호 : 12928
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }
}
