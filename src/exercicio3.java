import java.util.Scanner;

public abstract class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double num2 = sc.nextDouble();

        System.out.println("Informe o código da operação que deseja fazer:\n" + "1 - Adição\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão");
        double operacao = sc.nextDouble();

        if (operacao == 1) {
            System.out.println("Resultado:" + (num1 + num2));
        } else if (operacao == 2) {
            System.out.println("Resultado:" + (num1 - num2));
        } else if (operacao == 3) {
            System.out.println("Resultado:" + (num1 * num2));
        } else if (operacao == 4) {
            System.out.println("Resultado:" + (num1 / num2));
        } else {
            System.out.println("Tente novamente.");
        }
    }
}