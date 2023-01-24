import java.util.Scanner;
public class arryindevn {
    public static void main (String [] args)
    {
       Scanner scan = new Scanner(System.in);
       int [] arr = new int[5];
       System.out.println("Enetr the elements: ");
       for (int i = 0; i<5; i++)
       {
           arr[i] = scan.nextInt();
       }
       System.out.println("THe elements are: ");
       for(int i = 0; i<5; i++)
       { if (i%2 ==0){
        System.out.println(arr[i]);
       }
  
       }
    }
    
}
