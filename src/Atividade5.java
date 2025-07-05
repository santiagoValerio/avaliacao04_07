import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite un numero inteiro entre 1 e 7");

        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("numero invalido. digite um numero entre 1 e 7");
        }
    }
}
