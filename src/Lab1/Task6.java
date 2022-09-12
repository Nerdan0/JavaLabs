package Lab1;

import java.util.regex.*;

public class Task6 {
    public static void main(String[] args)
    {
        String str = "dim dima dimok dims diman dimahod dimapih dim piddim underdim";

        str = str.replaceAll( "\\bdim\\b","budinok");
        System.out.println(str);
    }
}
