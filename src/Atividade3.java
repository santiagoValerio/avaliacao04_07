import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua idade ");
        int idade = scanner.nextInt();

        if (idade <= 6) {
            System.out.println("Valor a pagar: R$ 0");
            return;
        } else if (idade >= 65) {
            System.out.println("Valor a pagar: R$ 0");
            return;
        }
        System.out.println("digite '1' se voce e estudante, e '2' se nao for");
        int estudate = scanner.nextInt();

        if (estudate == 1 && idade > 25) {
            System.out.println("valor a pagar: R$ 4,00");
        }
        if (estudate == 1 && idade <= 25) {
            System.out.println("valor a pagar: R$ 2,00");
        }
        if (estudate == 2 && idade >= 6) {
            System.out.println("valor a pagar: R$ 4,00");

        }else if (estudate == 2 && idade >= 65) {
            System.out.println("valor a pagar: R$ 4,00");
        }
    }
}
