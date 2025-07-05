import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("digite sua senha com numeros");
        int senha = scanner.nextInt();

        if (nome == "admin" && senha ==1245){
            System.out.println("login bem-sucedido");
        }else
            System.out.println("Login inválido. Conta bloqueada");
    }
}
