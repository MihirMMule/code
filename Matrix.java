package ab;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, value = i; j < matrix[i].length; j++, value += rows) {
                matrix[i][j] = value;
            }
        }

    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}