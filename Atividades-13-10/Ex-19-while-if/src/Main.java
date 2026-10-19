import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 19");
        Scanner sc = new Scanner(System.in);

        int numSecreto = 72;
        int num = 0;

        while (num != numSecreto){

            System.out.println("Tente achar o número secreto: ");
            num = sc.nextInt();

            if (num < numSecreto){
                System.out.println("O número é menor que o número secreto");
            } else if (num == numSecreto){
                System.out.println("Acertou o número secreto!");
            } else {
                System.out.println("O número é maior que o número secreto");
            }

            if (num % 2 == 0) {
                System.out.println("Esse número é par!");
            } else {
                System.out.println("Esse número é impar!");
            }

        }
    }
}