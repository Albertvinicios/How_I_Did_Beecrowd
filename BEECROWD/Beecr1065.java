import java.io.IOException;
import java.util.Scanner;

public class Beecr1065 {
    
    public static void main(String[] args) throws IOException {
    
    Scanner input = new Scanner(System.in);
    
    int a = 0;
    int n1 = 1;
    int cont = 0;

    do{
        a = input.nextInt();
        n1++;
    if (a % 2 == 0)
        cont++;
    }
    while (n1 < 6);
    
    System.out.println(cont+" valores pares");

    input.close();
    }
}  