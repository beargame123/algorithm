package com.example.algorithm.local;

import java.util.Scanner;

public class RepresentativeValue {
    /* 뒤집은 소수
    N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 수를 출력하는 프로그램을 작성하세요.
    예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단910을 뒤집으면 19로 숫자화 해야한다.
    첫 자리붙터의 연속된 0은 무시한다. 뒤집는 함수인 def reverse(x) 와 소수인지를 확인하는 함수 def isPrime(x)를 반드시
    작성하여 프로그래밍 한다.

    - 입력설명
    첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
    각 자연수의 크기는 100,000를 넘지 않는다.

    - 출력설명
    첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

    - 입력예제
    5
    32 55 62 3700 250

    - 출력예제
    23 73
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        RepresentativeValue r = new RepresentativeValue();

        int num = 0; // 입력받는 숫자
        for(int i=0; i<x; i++){
            num = r.reverse(in.nextInt());
            if(r.isPrime(num)){
                System.out.print(num + " ");
            }
        }
    }

    // 수를 뒤집는 Method
    public int reverse(int n){
        int answer = 0;

        while (n != 0) {
            answer = answer * 10 + n % 10;
            n /= 10;
        }
        return answer;
    }

    // 소수인지 확인하는 Method
    public boolean isPrime(int n){
         for(int i=2; i<n; i++){
             if(n % i == 0){
                 return false;
             }
         }
         return true;
    }
}
