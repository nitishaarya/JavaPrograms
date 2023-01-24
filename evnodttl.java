
public class evnodttl {
    public static void main(String[] args)
    {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= 10; i++)
    
        {
            if ( i%2 ==0){
                sum = sum+i;
            }
            if ( i % 2 !=0){
                product = product*i;
            }
        }
        System.out.println("the sum of even numbers is "+sum);
        System.out.println("the product of odd number is "+product);
        
        System.out.println("the result is "+(sum = product));
    }
  
        
            }

            
        
    
    

