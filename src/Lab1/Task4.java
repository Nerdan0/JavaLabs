package Lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        final int a = -10;
        final int b = 10;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt()-1;
        int[][] nums = new int[n][n];
        int maxNum = Integer.MIN_VALUE;
        int maxI = 0, maxJ = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j]=(int)Math.floor(Math.random()*(b-a))+a;
                if (nums[i][j]>maxNum){
                    maxNum = nums[i][j];
                    maxI = i;
                    maxJ = j;
                }
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < maxI; i+=2) {
            for (int j = 1; j < maxJ; i+=2) {
                nums[i][j]*=k;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
