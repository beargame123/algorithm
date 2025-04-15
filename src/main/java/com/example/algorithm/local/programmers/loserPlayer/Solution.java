package com.example.algorithm.local.programmers.loserPlayer;

import java.util.HashMap;

public class Solution {
    // 프로그래머스 완주하지 못한 선수 문제입니다  번호는 42576입니다.
    public String solution(String[] participant, String[] completion) {
        HashMap<String ,Integer> h = new HashMap<String ,Integer>();
        int tmp=0;
        for(String s: completion) {
            if(h.get(s) != null) {
                tmp = h.get(s);
                h.put(s,tmp+1);
            }
            else
                h.put(s,1);
        }
        for(String s:participant) {
            if(h.get(s) != null) {
                tmp = h.get(s);
                if(tmp>0)
                    h.put(s,tmp-1);
                else
                    return s;
            }
            else
                return s;
        }
        return "error";
    }
}
