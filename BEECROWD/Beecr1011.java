import java.io.IOException;
import java.util.Scanner;

public class Beecr1011 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    double R = input.nextDouble();

    double volume = (((4.0/3)*3.14159)*R*R*R);

    System.out.printf("VOLUME = %.3f\n", volume);
    
    input.close();
    }
}
