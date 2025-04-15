package com.example.algorithm.local.programmers.twoIntegers;

public class Solution {
    public long solution(long a, long b) {
        // 프로그래머스 두 정수 사이의 합 문제입니다. 번호 : 12912
        long answer = 0;

        for(long i = (Math.min(a, b)); i<=(Math.max(a, b)); i++){
            answer += i;
        }
        return answer;
    }
}
