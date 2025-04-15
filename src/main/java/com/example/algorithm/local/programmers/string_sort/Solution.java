package com.example.algorithm.local.programmers.string_sort;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    // 프로그래머스 문자열 내 마음대로 정렬하기 문제입니다. 문제번호 : 12915
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n) != 0 ? o1.charAt(n) - o2.charAt(n) : o1.compareTo(o2);
            }
        });

        return strings;
    }
}
