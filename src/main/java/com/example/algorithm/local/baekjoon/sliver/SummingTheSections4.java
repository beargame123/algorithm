package com.example.algorithm.local.baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SummingTheSections4 {
    /* 구간 합 구하기 4 - 11659
    문제
    수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

    출력
    총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

    제한
    1 ≤ N ≤ 100,000
    1 ≤ M ≤ 100,000
    1 ≤ i ≤ j ≤ N
    예제 입력 1
    5 3
    5 4 3 2 1
    1 3
    2 4
    5 5
    예제 출력 1
    12
    9
    1
*/

    /**
     * 메모리 사용: 256904KB
     * 걸린 시간: 1860ms
     * */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(arr[b] - arr[a - 1]);
        }
    }

    /**
     * 메모리 사용: 59004KB
     * 걸린 시간: 1100ms
     * */
   /* public static void main(String[] args) throws IOException {
        // 받는 데이터가 많을때는 Scanner 보다 Buffer를 쓰는게 낫다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 한줄에 길게 데이터가 들어오게 되면 INT 형으로 받기가 굉장히 힘들다. 그런 경우 StringTokenizer로 받는다.
        // StringTokenizer은 하나의 문자를 여러 개의 토큰으로 분리하는 방식이다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        // 큰 값들을 받게 된다면, int형을 넘을 수 있어 long으로 선언
        long[] arr = new long[n + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(arr[b] - arr[a-1]);
        }
    }*/
}
