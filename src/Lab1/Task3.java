package Lab1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        final int a = -10;
        final int b = 10;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt()-1;
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j]=(int)Math.floor(Math.random()*(b-a))+a;
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            nums[i][k]-= nums[k][k];
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
