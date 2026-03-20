import java.io.IOException;
import java.util.Scanner;

public class Beecr1007 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    
    int A = input.nextInt();
    int B = input.nextInt();
    int C = input.nextInt();
    int D = input.nextInt();

    int PR1 = A*B;
    int PR2 = C*D;
    int DIF = PR1-PR2;
    
    System.out.println("DIFERENCA = "+DIF);

    input.close();
    }
}
