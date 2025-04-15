package com.example.algorithm.local.programmers.securityMap;

class Solution {
    //프로그래머스 비밀지도 문제입니다  번호는 17681입니다.
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            System.out.println(answer[i]);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%"+n+"s",answer[i]);
            answer[i] = answer[i].replace("0", " ");
            answer[i] = answer[i].replace("1", "#");
        }

        for(int i=0; i<n; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}
