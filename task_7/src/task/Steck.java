package task;
import java.util.Stack;
import java.util.Scanner;

public class Steck {
    public static void start() {
        var first  = new Stack<Integer>();
        var second = new Stack<Integer>();
        Scanner num = new Scanner(System.in);
        int k = 0;
        System.out.println("Enter first:");
        while (k < 5) {
            first.push(Integer.parseInt(String.valueOf(num.nextInt())));
            k++;
        }
        k = 0;
        System.out.println("Enter second:");
        while(k < 5){
            second.push(Integer.parseInt(String.valueOf(num.nextInt())));
            k++;
        }

        int step = 0;

        while (!first.isEmpty() && !second.isEmpty() && step < 106)
        {
            int card1 = first.pop();
            int card2 = second.pop();

            if (card1 > card2)
            {
                second.push(card1);
                second.push(card2);
            }
            else if (card1 < card2)
            {
                first.push(card1);
                first.push(card2);
            }
            else
            {
                first.push(card1);
                second.push(card2);
            }
            step ++;
        }

        if(first.isEmpty()){
            System.out.println("second " + step);
        }
        else if(second.isEmpty()){
            System.out.println("first " + step);
        }
        else{
            System.out.println("botva");
        }
    }
}