package Lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,x,y;

        a = in.nextInt();
        b = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();

        if (a<=x)
        {
            if (b<x)
            {
                System.out.println(0.0);
            } else if (b>=x) {
                if (b>y)
                {
                    //perviy levee, nakladivayutsa krayami
                    System.out.println((float)(Math.abs(y-x)+1)/(float)(Math.abs(b-a)+1));
                }
                else
                {
                    //perviy bolshe vtorogo
                    System.out.println((float)(Math.abs(b-x)+1)/(float)(Math.abs(y-x)+1));
                }
            }
        }
        else if (x<a)
        {
            if (y<a)
            {
                System.out.println(0.0);
            } else if (y>=a) {
                if (y>b)
                {
                    //perviy levee, nakladivayutsa krayami
                    System.out.println((float)(Math.abs(b-a)+1)/(float)(Math.abs(y-x)+1));
                }
                else
                {
                    //perviy bolshe vtorogo
                    System.out.println((float)(Math.abs(y-a)+1)/(float)(Math.abs(b-a)+1));
                }
            }
        }
    }
}
