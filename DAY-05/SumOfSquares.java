import java.util.Scanner;
public class SumOfSquares 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += digit * digit; // Square it and add to sum
            num /= 10; // Remove last digit
        }
        
        System.out.println("Sum of squares of digits: " + sum);
    }
}
