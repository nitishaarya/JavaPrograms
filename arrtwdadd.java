
import java.util.Scanner;
public class arrtwdadd {
      public static void main(String [] args)
      {
        Scanner scan = new Scanner(System.in);
        int [][] arr = new int[3][3];
        int [][] brr = new int[3][3];
        int [][] crr = new int[3][3];
        
        System.out.println("Enter the elements of ARR");
        for ( int i = 0; i < 3; i++)
        {
          for ( int j = 0; j < 3; j++)
          {
            arr[i][j] = scan.nextInt();
          }
        }
        System.out.println("enteer the elements of BRR");
        for ( int i = 0; i <3; i++)
        {
          for ( int j = 0; j < 3; j++)
          {
            brr[i][j] = scan.nextInt();
          }
        }
        for (int i = 0; i < 3; i++)
        {
          for ( int j = 0; j < 3; j++)
          {
            crr[i][j] = arr[i][j] + brr[i][j];
          }
        }
        for ( int i = 0; i < 3; i++)
        {
          for ( int j = 0; j < 3; j++)
          {
            System.out.print( crr[i][j] +" ");
          }
          System.out.println();
        }
      }
    
}
