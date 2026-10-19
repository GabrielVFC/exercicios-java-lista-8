import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 15");
        Scanner sc = new Scanner(System.in);

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")){

            System.out.println("Digite um valor que vai ser o número que será dividido: ");
            int numDividido = sc.nextInt();
            System.out.println("Digite um valor que vai ser o número que será o divisor: ");
            int numDivisor = sc.nextInt();

            if (numDivisor == 0){
                System.out.println("Não é possivel dividir por zero!");
            } else {
                int mod = numDividido % numDivisor;

                if (mod == 0) {
                    System.out.printf("O número %d é divisivel por %d!%n", numDividido, numDivisor);
                } else {
                    System.out.printf("O número %d não é divisivel por %d!%n", numDividido, numDivisor);
                }
            }

            System.out.println("Deseja continuar: (S/N)");
            continuar = sc.next();
        }
        System.out.println("Programa encerrado!");
    }
}