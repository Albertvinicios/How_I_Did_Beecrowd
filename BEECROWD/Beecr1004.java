import java.io.IOException;
import java.util.Scanner;
 
public class Beecr1004{
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int  num1;
        int  num2;
        int sum;

        num1 = input.nextInt();
        num2 = input.nextInt();
        
        sum = num1 * num2;
        System.out.printf("PROD = %s\n", sum);
        input.close();
    }
}