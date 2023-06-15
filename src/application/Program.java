package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Tente: c�digo que pode lan�ar uma exce��o
        try {
        String[] vect = sc.nextLine().split(" "); // .split() permite separar os vetores por algo.

        System.out.print("Digite a posi��o do nome que deseja: ");
        int posicao = sc.nextInt();

        System.out.println(vect[posicao]);
        sc.close();
        }

        // Capturar: c�digo para lidar com exce��es e.
        catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException: valor do array fora dos limites.
            System.out.println("Posi��o inv�lida!");
        }

        catch(InputMismatchException e) { // InputMismatchException: Exce��o de incompatibilidade de entrada.
            System.out.println("Erro de input!");
        }

        System.out.println("Fim do programa!");
    }
}
