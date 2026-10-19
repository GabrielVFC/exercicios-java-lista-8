import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 16");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = sc.nextInt();

        int divisor = 1;
        int divisoresEncontrados = 0;

        while (divisor <= num){

            if (num % divisor == 0){
                divisoresEncontrados++;
            }
            divisor++;
        }

        if (divisoresEncontrados == 2){
            System.out.printf("O número %d é primo%n", num);
        } else {
            System.out.printf("O número %d não é primo%n", num);
        }
    }
}