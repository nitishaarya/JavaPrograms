import java.util.Scanner;
import java.util.*;
public class statement1
{
    public static void main(String[] args)
    {
    
    System.out.println("Enter age");
    int age = new Scanner(System.in).nextInt();
    if (age >= 18)
    {
        System.out.println("Eligible for voting" );
    }
    else{
        System.out.println("not eligible for voting");
    }
}
    
}

