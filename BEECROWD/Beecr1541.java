import java.io.IOException;
import java.util.Scanner;

public class Beecr1541 {
	
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double A, B, C, X;

        while ((A = input.nextInt()) != 0) {
        	B = input.nextInt();
        	C = input.nextInt();
        	X = Math.sqrt((((A * B) / C) * 100.0));
        	System.out.println((int)X);
        }
        
        input.close();
    }
}