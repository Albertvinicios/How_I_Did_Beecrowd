import java.io.IOException;
import java.util.Scanner;
public class Beecr1016 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    
    int dist = input.nextInt();
    int min = dist*2;
    
    System.out.println(min+" minutos");
    input.close();
    }
}