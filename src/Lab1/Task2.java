package Lab1;

import java.util.ArrayList;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args)
    {

        final int a = -10;
        final int b = 10;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        ArrayList<Double> nums = new ArrayList<Double>();

        for (int i = 0; i<n; i++)
        {
            nums.add(Math.random()*(b-a)+a);
        }

        System.out.println(nums);
        double minDist = Double.MAX_VALUE;
        int minI = 0,minJ = 1;
        double currDist;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j)
                {
                    currDist = Math.abs((nums.get(i)+nums.get(j))/2 - x);
                    if (currDist<minDist)
                    {
                        minJ = j;
                        minI = i;
                        minDist=currDist;
                    }
                }
            }
        }

        System.out.println(minI + " " + minJ + " " + minDist);

    }
}
