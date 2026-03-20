import java.io.IOException;
import java.util.Scanner;
public class Beecr1010 {
        public static void main(String[] args) throws IOException {
            Scanner input = new Scanner(System.in); 
            int quantidade;
            double valorp, valorf = 0.0;
            int cont = 0;
            while(cont < 2)
            {
                int codigo = input.nextInt();
                quantidade = input.nextInt();
                valorp = input.nextDouble();
                valorf += quantidade*valorp;
                cont++;
            }
            System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorf);

            input.close();
    }
}
