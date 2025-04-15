package com.example.algorithm.local.codeUp;

import java.util.*;

public class Main {
    // 코드업 설탕과자 뽑기 문제입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] array = new int[w+1][h+1];
        int n = sc.nextInt();

        for(int i=0; i< n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (d == 0) {
                for (int j = 0; j < l; j++) {
                    array[x][y + j] = 1;
                }
            } else
            {
                for(int j=0; j<l; j++){
                    array[x+j][y] =1;
                }
            }

        }

        for (int i=1; i<= w; i++) {
            for (int j = 1; j <= h; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
