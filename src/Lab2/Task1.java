package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int N = 3;
        int[][] arr = new int[N][N];
        boolean hasEven = false;

        try {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = in.nextInt();
                    if (arr[i][j] % 2 ==0 ) {
                        hasEven = true;
                    }
                }
            }
            if (!hasEven) {
                throw new RuntimeException("No even numbers");
            }
        }

        catch (InputMismatchException ex)
        {
            System.out.println("Input error");
        }
        catch (RuntimeException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println("Every other exception");
        }
    }
}
