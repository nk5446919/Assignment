import java.util.Scanner;
public class PrimeSum 
{
     public static boolean isPrime(int num) 
    {
        if (num < 2) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
         {
            if (num % i == 0)
             {
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimes(int start, int end) 
    {
        int sum = 0;
        for (int i = start; i <= end; i++)
         {
            if (isPrime(i))
             {
                sum += i;
            }
        }
        return sum;
    }
     public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        scanner.close();
         int sum = sumOfPrimes(start, end);
        System.out.println("The sum of all prime numbers in the range " + start + " to " + end + " is: " + sum);
    }
}