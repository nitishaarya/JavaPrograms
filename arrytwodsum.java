import java.util.Scanner;
public class arrytwodsum 
{
    public static void main(String [] args)
    {
      Scanner scan = new Scanner(System.in);
      int [][] arr=new int[3][3];
      System.out.println("Enter the array elements");
      for( int i=0; i<3 ; i++)
      {
        for( int j=0; j<3; j++)
        {
            arr[i][j] = scan.nextInt();
        }
      }
      System.out.println("Array elements are: ");
      int sum =0;
      for(int i =0; i<3; i++)
      {
        for(int j=0; j<3; j++)
        {
            sum = sum + arr[i][j];
        }
      }
      System.out.println("the sum is "+sum);
    }
}
