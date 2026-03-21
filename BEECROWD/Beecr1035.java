import java.io.IOException;
import java.util.Scanner;
public class Beecr1035 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    float A = input.nextFloat();
    float B = input.nextFloat();
    float C = input.nextFloat();
    float D = input.nextFloat();

    float somacd = C+D;
    float somaab = A+B;
    
    
    if(B>C & D>A & somacd>somaab & C>0 & D>0 & A%2==0){
        System.out.println("Valores aceitos");
    }else{
        System.out.println("Valores nao aceitos");
    }
    
    input.close();
    }
}