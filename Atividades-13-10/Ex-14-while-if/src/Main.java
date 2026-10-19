import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 14");
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int cont = 0;
        int par= 0;
        int impar = 0;

        while (cont < 12){
            System.out.println("Digite um valor: ");
            num = sc.nextInt();

            int mod = num % 2;

            if (mod == 0){
                par++;
            } else {
                impar++;
            }
            cont++;
        }

        System.out.printf("Números pares: %d%n", par);
        System.out.printf("Números impares: %d%n", impar);
    }
}