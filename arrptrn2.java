import java.util.Scanner;
public class arrptrn2 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("ENeter the vaue of n:");
          int n = scan.nextInt();
          for ( int i = 0; i < n; i++)
          {
            for ( int j = 0; j < n; j ++)
            {
                if( i == 0 && j>0 && j!=n/2  ||
                    j == 0 && i<n/2 && i>0 && i !=n/4  ||
                    i == n/2 ||
                    j == n/2 ||
                    i == n-1 ||
                    j == n-1  ||
                    i == n/4 && j < n/2



                   )
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
          }
    }
}
