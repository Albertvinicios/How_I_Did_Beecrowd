import java.io.IOException;
import java.util.Scanner;

public class Beecr1005 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double A, B, MEDIA;
        double peso1 = 3.5;
        double peso2 = 7.5;

        A = input.nextDouble();
        B = input.nextDouble();

        MEDIA = (A * peso1 + B * peso2)/(peso1+peso2);
        
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        input.close();
    }
}
