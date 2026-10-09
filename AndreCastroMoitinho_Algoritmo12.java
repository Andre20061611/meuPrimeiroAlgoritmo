// AndreCastroMoitinho-Algoritmo12.java
import java.util.Scanner;

public class AndreCastroMoitinho_Algoritmo12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um prato: ");
        System.out.println("1 - Strogonoff");
        System.out.println("2 - Parmegiana");
        System.out.println("3 - Feijoada");
        System.out.println("4 - Churrasco");

        System.out.print("Digite o número do seu prato: ");
        int prato = scanner.nextInt();

        // Executa a opção selecionada
        switch (prato) {

            case 1:
                System.out.println("Você escolheu Strogonoff");
                break;

            case 2:
                System.out.println("Parmegiana");
                break;

            case 3:
                System.out.println("Feijoada");
                break;

            case 4:
                System.out.println("Churrasco");
                break;

            // Caso o número não possua uma função
            default:
                System.out.println("Escolha um prato de 1 a 4");

                scanner.close();
        }
    }
}




