import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 13");
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int num = 0;
        int multiplos = 0;

        while (cont < 15){
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            int mod = num % 4;

            if (mod == 0){
                multiplos++;
            }
            cont++;
        }

        System.out.printf("Multiplos de 4: %d%n", multiplos);
    }
}