import java.util.Scanner;
public class arrtwod {
    public static void main(String [] args)
    {
       Scanner scan = new Scanner(System.in);
       int[][] arr=new int[3][3];
       System.out.println("Enter the array elements: ");
       for (int i = 0;i<3; i++)
       {
        for(int j = 0; j<3; j++)
        {
          arr[i][j] = scan. nextInt();
        }
       }
       
       for(int i = 0; i<3; i++)
       {
        for(int j = 0; j<3; j++)
        {
            System.out.print(arr[i][j] +" ");
        }
        System.out.println();
       }
       System.out.println("Array elements are: ");
    }
    
}
