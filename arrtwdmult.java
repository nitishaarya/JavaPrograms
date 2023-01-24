import java.util.Scanner;
public class arrtwdmult {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int [][] arr = new int[3][3];
        int [][] brr = new int[3][3];
        int [][] crr = new int[3][3];

        System.out.println("Enter the element of ARR");
        for (int i = 0; i < 3; i ++)
        {
            for ( int j = 0; j < 3; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the element of BRR");
        for ( int i = 0; i < 3; i++)
        {
            for ( int j = 0; j < 3; j++)
            {
                brr[i][j] = scan.nextInt();
            }
        }
        System.out.printn("Enter the elements of CRR");
        for( int i = 0; i < 3; i++)
        {
            for ( int j = 0; j < 3; j++)
            {
                crr[i][j] = scan.nextInt();
            }
        }
    }
}
