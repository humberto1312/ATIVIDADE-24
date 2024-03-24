import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        if (quantidadeNotas <= 0) {
            System.out.println("A quantidade de notas deve ser um número positivo.");
        } else {
            double somaNotas = 0;

            for (int i = 1; i <= quantidadeNotas; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / quantidadeNotas;
            System.out.println("A média aritmética das " + quantidadeNotas + " notas é: " + media);
        }

        scanner.close();
    }
}
