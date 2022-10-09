import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Faça um Programa que peça dois números e imprima a soma.
    int a, b, c;
    Scanner sc = new Scanner (System.in);

        System.out.print("Escreva o número A: ");
        a = sc.nextInt(); 

        System.out.print("Escreva o número B: ");
        b = sc.nextInt();
        sc.close();

        c = (a + b);

        System.out.println(a+ " + " + b + " = "+c);
    }
}
