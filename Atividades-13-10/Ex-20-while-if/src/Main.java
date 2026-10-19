import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 20");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em centavos: ");
        int valor = sc.nextInt();

        int moeda25 = 0;
        int moeda10 = 0;
        int moeda5 = 0;
        int moeda1 = 0;

        while (valor > 0){
            if (valor >= 25){
                moeda25 = valor / 25;
                valor = valor % 25;
            } else if (valor >= 10) {
                moeda10 = valor / 10;
                valor = valor % 10;
            } else if (valor >= 5) {
                moeda5 = valor / 5;
                valor = valor % 5;
            } else if (valor >= 1) {
                moeda1 = valor / 1;
                valor = valor % 1;
            }
        }

        System.out.printf("Moedas de 25 centavos: %d%n", moeda25);
        System.out.printf("Moedas de 10 centavos: %d%n", moeda10);
        System.out.printf("Moedas de 5 centavos: %d%n", moeda5);
        System.out.printf("Moedas de 1 centavos: %d%n", moeda1);
    }
}