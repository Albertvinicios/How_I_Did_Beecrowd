import java.io.IOException;
import java.util.Scanner;
public class Beecr1070 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    
    int x = input.nextInt();

    if (x % 2 == 0)
        x += 1;
    for (int a=0;a<6;a++){
        System.out.println(x);
        x += 2;
    }
    
    input.close();   
    }
}