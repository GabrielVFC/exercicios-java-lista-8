import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 12");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor limite: ");
        int limite = sc.nextInt();
        int i = 1;

        while (i <= limite){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}