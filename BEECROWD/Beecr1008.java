import java.io.IOException;
import java.util.Scanner;
public class Beecr1008 {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int  num1;
        int  num2;
        float  num3;
        float sum;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextFloat();
        
        sum = num2 * num3;

        System.out.printf("NUMBER = %s\n", num1);
        System.out.printf("SALARY = U$ %.2f\n", sum);

        input.close();
    }
}
