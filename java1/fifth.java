package java1;
import java.util.*;
public class fifth {
    public static void main(String [] args)
    {
        float temperature;
        Scanner scan =  new Scanner (System.in);
        System.out.println("Enter temperature in fahrenhiet");
        temperature = scan.nextInt();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperature in celsius = "+temperature);
    }
}
