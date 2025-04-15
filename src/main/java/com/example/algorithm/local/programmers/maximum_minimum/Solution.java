package com.example.algorithm.local.programmers.maximum_minimum;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 1;
        int gcd = n*m;

        while (temp != 0){
            temp = m% n;
            m=n;
            n=temp;
        }

        answer[0] = m;
        answer[1] = gcd/m;
        return answer;
    }
}
