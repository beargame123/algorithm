package com.example.algorithm.local.programmers.stack;

import java.util.ArrayList;

public class Solution {
    // 프로그래머스 같은숫자는 싫어 문제 입니다. 번호 : 12906
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int t = -1;
        for(int i : arr){
            if(t != i) {
                answer.add(arr[i]);
            }
            t = i;
        }

        return answer.stream().mapToInt(i-> i).toArray();
    }
}
