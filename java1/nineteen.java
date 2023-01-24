package java1;
import java.util.Scanner;
public class nineteen 
{
    public static void main(String[] args)
    {
        int row, numberofStars, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
         n = scan.nextInt();
           for (row = 1;row <=n; row++)
        {
             for(numberofStars = 1; numberofStars <= row; numberofStars++)
           { 
               System.out.print("*");
           }
            System.out.println();

        }
    
    }
}
