package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Tente: código que pode lançar uma exceção
        try {
        String[] vect = sc.nextLine().split(" "); // .split() permite separar os vetores por algo.

        System.out.print("Digite a posição do nome que deseja: ");
        int posicao = sc.nextInt();

        System.out.println(vect[posicao]);
        sc.close();
        }

        // Capturar: código para lidar com exceções e.
        catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException: valor do array fora dos limites.
            System.out.println("Posição inválida!");
        }

        catch(InputMismatchException e) { // InputMismatchException: Exceção de incompatibilidade de entrada.
            System.out.println("Erro de input!");
        }

        System.out.println("Fim do programa!");
    }
}
