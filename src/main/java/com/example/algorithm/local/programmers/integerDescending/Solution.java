package com.example.algorithm.local.programmers.integerDescending;

import java.util.*;

public class Solution {
    public long solution(long n) {
        // 프로그래머스 정수 내림차순 문제입니다. 번호 : 12933
        List<Long> list = new ArrayList<>();

        while(n > 0){
            list.add(n%10);
            n /= 10;
        }
        list.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
        }
        return Long.parseLong(sb.toString());
    }
}
