import java.io.IOException;
import java.util.Scanner;

public class Beecr1847 {
	
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if (B < A && C >= B) System.out.println(":)");
        else if (B > A && C <= B) System.out.println(":(");
        else if (B > A && C > B && (C - B) < (B - A)) System.out.println(":(");
        else if (B > A && C > B && (C - B) >= (B - A)) System.out.println(":)");
        else if (B < A && C < B && (B - C) < (A - B)) System.out.println(":)");
        else if (B < A && C < B && (B - C) >= (A - B)) System.out.println(":(");
        else if (B == A && C > B) System.out.println(":)");
        else if (B == A && C < B) System.out.println(":(");
        else System.out.println(":(");

        input.close();
    }	
}