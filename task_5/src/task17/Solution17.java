package task17;
import java.util.Scanner;

public class Solution17 {
    int max = 0;
    public int recurs()
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a > max) max = a;
        if(a == 0)
        {
            in.close();
            return max;
        }
        return recurs();
    }

}