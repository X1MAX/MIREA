package task1;

import java.util.Scanner;

public class Solution1
{
    private int n;
    private int i = 1;
    Solution1()
    {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }

    public String out()
    {
        if(i <= n)
        {
            for(int k = 1;k <= i;k++)
            {
                System.out.print(i + " ");
            }
            i++;
            return out();
        }
        else
        {
            return "";
        }
    }

}