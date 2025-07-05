import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite uma nota de 0 a 100");
        int nota = scanner.nextInt();

        if ((nota >= 90) && (nota <=100)){
            System.out.println("sua nota e A");

        }else if ((nota >= 80) && (nota <=89)){
            System.out.println("sua nota e B");

        }else  if ((nota >= 70) && (nota <=79)){
            System.out.println("sua nota e C");

        }else  if ((nota >= 60) && (nota <=69)){
            System.out.println("sua nota e D");

        }else  if (nota >= 60){
            System.out.println("sua nota e F");


        }
    }
}
