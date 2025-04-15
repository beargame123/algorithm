package com.example.algorithm.local.programmers.string_descending;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(String s) {
        // 프로그래머스 문자열 내림차순 문제입니다. 번호 : 12917
        String answer = "";
        String[] sArr = s.split("");
        Arrays.sort(sArr);
        List<String> list = Arrays.asList(sArr);
        Collections.reverse(list);

        sArr = list.toArray(new String[list.size()]);

        for (String a : sArr){
            answer += a;
        }
        return answer;
    }
}