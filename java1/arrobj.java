package java1;
import java.util.Scanner;
class Employee
{
    char gender;
    
    int salary;
    String email;
}
public class arrobj {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter he number of employee:");
        Employee[] e = new Employee[scan.nextInt()];

        for (int i = 0; i <e.length; i++)
        {
          Employee emp = new Employee();
          System.out.println("Enter"+ (i+1) + "Employee Gender");
          emp.gender = scan.next().charAt(0);
          System.out.println("Enter"+ (i+1) + "Employee Salary");
          emp.salary = scan.nextInt();
          System.out.println("Enter"+ (i+1) + "Employee Email");
          emp.email = scan.next();
          e[i] = emp;
        }
        
        System.out.println("***********Employee Details Are***************");
        for ( int i = 0; i <e.length; i++)
        {
            System.out.println((i+1) + "Employee Gender is " + e[i].gender);
            System.out.println((i+1) + "Employee Salary is "+ e[i].salary);
            System.out.println((i+1) + "Employee Email is "+ e[i].email);
            System.out.println("*******************************");
        }

    }
}
