package lista2_gabrielgoes;

import java.util.Scanner;

/**
 *c) Faça um programa que recebe dois números inteiros distintos e exibe o maior.
 */
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite o 1º numero");
        num1 = in.nextInt();
        System.out.println("Digite o 2º numero");
        num2 = in.nextInt();
        
        if(num1 > num2){
            System.out.println("o maior numero é "+ num1);
        }
        else if(num1 == num2){
            System.out.println("Ambos os numeros são iguais!");
        }
        else{
            System.out.println("o maior numero é "+ num2);
        }
        
    }
}
