package Lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim();

        if (str.substring(0,2).equals("І "))
        {
            str = "Та "+str.substring(2);
        }
        else if (str.substring(0,3).equals("Та "))
        {
            str = "І "+str.substring(3);
        }

        for (int i = 1; i < str.length()-4; i++) {
            if (str.substring(i,i+3).equals(" і "))
            {
                str = str.substring(0,i)+" та "+str.substring(i+3);
                continue;
            }
            if (str.substring(i,i+4).equals(" та "))
            {
                str = str.substring(0,i)+" і "+str.substring(i+4);
                continue;
            }

        }
        System.out.println(str);
    }
}
