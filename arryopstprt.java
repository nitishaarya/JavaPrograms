import java.util.Scanner;
public class arryopstprt {
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int [] arr = new int[5];
     System.out.println("Enter the elements: ");
     for (int i = 0; i < 5; i++)
     {
        arr [i] = scan.nextInt();
     }
     System.out.println("The array elements are:");
     for (int i = 4; i>=0; i--)
     {
        System.out.println(arr[i]);
     }
    }
    
}
