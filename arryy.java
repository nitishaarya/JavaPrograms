import java.util.*;
public class arryy {
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enetr the array elements: ");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("THe array elements are: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
