package java1;
import java.util.Scanner;
public class twelth {
    public static void main(String [] args)
    {
       int marksObtained,passingMarks;
       passingMarks = 40;
       Scanner scan = new Scanner(System.in);
       System.out.println("Input marks scored by you:");
       marksObtained = scan.nextInt();
       if ( marksObtained >= passingMarks)
       {
           System.out.println("You passed the exam!");
       }
       else{
        System.out.println("You have failed to pass the exam!");
       }
    }
}
