package Loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares =0;
        int count = 0;

        System.out.print("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();
        
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            count++;

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

        } while(count < quantidadeNumeros);

        System.out.println("\nQuantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        scan.close();
    }

}
