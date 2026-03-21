import java.io.IOException;
import java.util.Scanner;
public class Beecr1017 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    
    int horas = input.nextInt();
    int velomed = input.nextInt();
    
    float dist = velomed * horas;
    float km = dist/12;
    
    System.out.printf("%.3f\n",km);

    input.close();
    }
}