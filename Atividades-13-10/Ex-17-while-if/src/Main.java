public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 17");

        int i = 1;
        int soma = 0;

        while (i <= 100){

            if (i % 3 == 0 || i % 5 == 0){
                soma = soma + i;
                System.out.printf("i: %d%n", i);
            }

            i++;

        }

        System.out.printf("A soma de todos os multiplos de 3 e 5 até 100 é de: %d%n", soma);
    }
}