import java.util.*;
import java.io.*;
import java.util.Scanner;
public class oe{
    public static void main(String[] args)
{   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number ");
    int num = sc.nextInt();
    
    if (num % 2 == 0)
    {
        System.out.println("Number is even");
    }
    else{
        System.out.println("Numberis odd");
    }

}
}

