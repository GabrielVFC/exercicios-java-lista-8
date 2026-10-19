import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 18");
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int cont = 0;

        while (cont < 10){
            System.out.println("Digite um valor: ");
            num = sc.nextInt();

            int ultimoDigito = Math.abs(num % 10);

            if (ultimoDigito == 0){
                System.out.printf("O ultimo digito do número %d é %d%n", num, ultimoDigito);
            } else if (ultimoDigito == 5) {
                System.out.printf("O ultimo digito do número %d é %d%n", num, ultimoDigito);
            } else {
                System.out.printf("O ultimo digito do número %d é %d%n", num, ultimoDigito);
            }
            cont++;
        }
    }
}