package Projeto;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int inicio = teclado.nextInt();

        System.out.println("Digite o segundo número:");
        int fim = teclado.nextInt();

        try {
            verificarParametros(inicio, fim);

            System.out.println("Contagem: ");

            for (int i = inicio; i <= fim; i++) {
                System.out.println("Imprimindo o restante dos números: " + i);
            }
            System.out.println("Fim Da Contagem");
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        teclado.close();
    }

    static void verificarParametros(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio > fim) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }
    }
}

