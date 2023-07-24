import java.util.Scanner;
public class Number 
{
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Enter the third number: ");
            double num3 = sc.nextDouble();
            
            double largest = num1;
            
            if (num2 > largest) {
                largest = num2;
            }
            
            if (num3 > largest) {
                largest = num3;
            }
            double sum = num1 + num2 + num3;
            System.out.println("The largest number is: " + largest);
             System.out.println("The sum is : " + sum);
        }
}
    
    

