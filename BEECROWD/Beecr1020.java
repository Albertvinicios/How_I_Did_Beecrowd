import java.io.IOException;
import java.util.Scanner;
public class Beecr1020 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    
    int a = input.nextInt();
    
    int anos = a/365;
    int meses = (a%365)/30;
    int dias = (a%365)%30;
    
    System.out.println(anos+" ano(s)");
    System.out.println(meses+" mes(es)");
    System.out.println(dias+" dia(s)");

    input.close();
    }
}