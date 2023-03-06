package com.example.algorithm.local;

import java.util.Scanner;

public class InvertedDecimal {
    /* 대표값
    N명의 학생의 수학점수가 주어집니다. N명의 학생들의 평균(소수 첫째자리 반올림)을 구하고, N명의 학생 중 평균에 가장 가까운 학생은
    몇 번째 학생인지 출력하는 프로그램을 작성하세요. 평균과 가장 가까운 점수가 여러 개일 경우 먼저 점수가 높은 학생의 번호를 답으로 하고,
    높은 점수를 가진 학생이 여러 명일 경우 그 중 학생번호가 빠른 학생의 번호를 답으로 합니다.

    - 입력설명
    첫줄에 자연수 N(5<=N<=100)이 주어지고, 두 번째 줄에는 각학생의 수학점수인 N개의 자연수가 주어집니다. 학생의 번호는 앞에서부터
    1로 시작해서 N 까지이다.

    - 출력설명
    첫줄에 평균과 가장 가까운 학생의 번호를 출력한다. 평균은 소수 첫째 자리에서 반올림합니다.

    - 입력예제
    10
    45 73 66 87 92 67 75 79 75 80

    - 출력에제
    74 7

    예제설명)
    평균이 74점으로 평균과 가장 가까운 점수는 73(2번), 75(7번), 75(9번)입니다. 여기서 점수가 높은
    75(7번), 75(9번)이 답이 될 수 있고, 75점이 두명이므로 학생번호가 빠른 7번이 답이 됩니다.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] arr = new int[x+1];

        // 입력받은 점수 배열에 저장
        double sum = 0;
        for (int i=0; i<x; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        // 평균 값 구하기
        int avarge = (int)Math.round(sum/x);

        int min = Integer.MAX_VALUE; // 가장 차이가 작은 점수 구하기
        int idx = 0; // 가장 가까운 학생의 번호
        int diff = 0; // 평균과 점수들의 차이
        for(int i=0; i<x; i++){
            diff = Math.abs(avarge - arr[i]); // 평균 차이 구하기
            if(diff < min){
                min = diff;
                idx = i;
            }else if(diff == min){
                if(arr[i] > arr[idx]){
                    idx = i;
                }
            }
        }

        System.out.println(avarge + " " + (idx+1));
    }
}
