import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor deseja pegar emprestado");
        int valorEmprestado = scanner.nextInt();
        System.out.println("Em quantas parcelas deseja pagar (de 1 a 24)");
        int parceles = scanner.nextInt();
        System.out.println("Qual o salário mensal que ele recebe");
        int salario = scanner.nextInt();

        if (salario < valorEmprestado){
            System.out.println("aprova el prestamo");
        }else {
            System.out.println("no se pudo hacer el prestamo");
        }
        double calculandoOvalorDaParcela = (valorEmprestado / parceles);
        System.out.println("calculandoOvalorDaParcela e :");
    }
}
