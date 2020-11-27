package task16;

import java.util.Scanner;

public class Solution16
{
    private int a; //число вводимое польщователем
    private int max = 0; //максимальное число
    private int n = 0; //счетчик поввторения максимального числа

    public int recurs()
    {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        if(a > max)
        {
            max = a;
            n = 0;
        }
        if(a == max) n++;
        if(a == 0)
        {
            return n;
        }
        return recurs();
    }

}