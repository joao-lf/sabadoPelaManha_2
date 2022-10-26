import javax.swing.*;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         if (args.length == 0) {
             System.out.println("Informe o primeiro valor: ");
             double num1 = sc.nextDouble();

             System.out.println("Informe o segundo valor: ");
             double num2 = sc.nextDouble();

             System.out.println(num1 + num2);

         } else if (args.length == 1) {
             double num1 = Double.parseDouble(args[0]);
             System.out.println("Informe um valor: ");
             double num2 = sc.nextDouble();

             System.out.println(num1 + num2);

         } else if (args.length == 2) {
             double num1 = Double.parseDouble(args[0]);
             double num2 = Double.parseDouble(args[1]);

             System.out.println(num1 + num2);

         } else System.out.println ("A quantidade de parâmetros é inválida.");
    }
}