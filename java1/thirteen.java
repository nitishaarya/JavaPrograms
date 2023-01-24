package java1;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class thirteen {
    public static void main(String [] args)
    {
        int marksObtained, passingMarks;
        char grade;
        passingMarks = 40;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the obtained marks");
        marksObtained = scan.nextInt();
        if (marksObtained >= passingMarks)
        {
            if (marksObtained > 90)
            grade ='A';
            else if (marksObtained > 75 )
            grade = 'B';
            else if (marksObtained > 60)
            grade = 'c';
            else
            grade = 'D';
            System.out.println("You have passed the exam and your grade is: "+grade);

        }
        else
        grade = 'F';
        {
            System.out.println("You failed in exam nd your grade is"+grade);
        }
    }
}
