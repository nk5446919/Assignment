
import java.util.Scanner;
public class PerfectSquareChecker 
{
    public static boolean isPerfectSquare(int num) 
    {
        if (num < 0) 
        {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isPerfectSquare(number))
         {
            System.out.println(number + " is a perfect square.");
        } 
        else
         {
            System.out.println(number + " is not a perfect square.");
        }
    }
}