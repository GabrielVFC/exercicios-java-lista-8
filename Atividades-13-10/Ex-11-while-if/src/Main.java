import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 11");
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int cont = 0;

        while (cont < 20){
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            int mod = num % 2;

            if (mod == 0){
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            cont++;
        }


    }
}