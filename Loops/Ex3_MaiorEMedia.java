package Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;

        int count = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("\nMaior número é " + maior);
        System.out.println("Média é igual a " + (soma/5));

        scan.close();  
    }
}