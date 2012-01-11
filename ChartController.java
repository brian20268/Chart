
/**
 * Write a description of class ChartController here.
 * 
 * @Brian Eyring 
 * @Assignment 6.5
 */
import java.util.Scanner;
public class ChartController
{
   public static void main(String[] args)
   {
        int value = 0;
        Scanner scan = new Scanner(System.in);
        Histogram hist = new Histogram(new int[][]{{1, 10}, {11, 20}, {21, 30}, {31, 40}, {41, 50}, {51, 60}, {61, 70}, {71, 80}, {81, 90}, {91, 100}});
        while (value != -1)
        {
            System.out.println("Enter a value you wish to enter into the chart(-1 to quit): ");
            value = scan.nextInt();
            if (value != -1)
            {
                hist.addValue(value);
                System.out.println(hist);
            }
        }
    }
}
