package com.example.algorithm.local.programmers.number_of_p_and_y;

public class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        char[] temp = s.toCharArray();

        for(int i=0; i< temp.length; i++){
            if(temp[i]=='p' || temp[i]== 'P') p++;
            else if(temp[i]=='y'||temp[i]=='Y') y++;
        }

        return p == y;
    }
}
