import java.util.Scanner;
public class sumarryelmnt {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int[] arr = new int[5];
      System.out.println("Enter the elements: ");
      for (int i = 0; i <5; i++)
      {
        arr[i] = scan.nextInt();
      }
       int sum = 0;
       for (int i = 0; i <5; i++)
       {
        sum = sum + arr[i];
       }
       System.out.println("The sum of aray element is : "+ sum);



    }
    
}
