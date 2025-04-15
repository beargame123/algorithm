package com.example.algorithm.local.programmers.moreSpicy;

import java.util.PriorityQueue;

public class Solution {
    // 프로그래머스 더맵게 문제입니다  번호는 42626입니다.
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    public int solution(int[] scoville, int K) {
        int answer = 0;
        for (int i : scoville) {
            minHeap.add(i);
        }
        while (minHeap.peek() < K){
            if (minHeap.size() < 2) {
                return -1;
            }
            minHeap.add(minHeap.remove() + minHeap.remove() *2);
            answer++;

        }
        return answer;
    }
}
