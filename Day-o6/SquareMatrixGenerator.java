import java.util.Scanner;
public class SquareMatrixGenerator 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        scanner.close();
        
        int[][] matrix = generateMatrix(size);
        printMatrix(matrix);
    }

    public static int[][] generateMatrix(int size) 
    {
        int[][] matrix = new int[size][size];
        int num = 1;
        
        for (int i = 0; i < size; i++)
         {
            for (int j = 0; j < size; j++)
             {
                matrix[i][j] = num++;
            }
        }
        
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix)
     {
        for (int[] row : matrix)
         {
            for (int num : row)
             {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
