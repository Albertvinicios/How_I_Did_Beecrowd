import java.io.IOException;
import java.util.Scanner;
public class Beecr1009 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double salariof, vendas, comissao, salarioreal;
        String nome = input.nextLine();
        salariof = input.nextDouble();
        vendas = input.nextDouble();

        comissao = (vendas*0.15);
        salarioreal = salariof+comissao;

        System.out.printf("TOTAL = R$ %.2f\n",salarioreal);

        input.close();
    }
}
