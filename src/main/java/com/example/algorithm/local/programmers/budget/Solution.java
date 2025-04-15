package com.example.algorithm.local.programmers.budget;

import java.util.Arrays;

public class Solution {
    // 프로그래머스 예산 문제입니다.
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for(int i=0; i< d.length; i++){
            result += d[i];
            if (result > budget){
                answer = i;
                break;
            }
        }

        if (result <= budget){
            answer = d.length;
        }
        return answer;
    }
}
