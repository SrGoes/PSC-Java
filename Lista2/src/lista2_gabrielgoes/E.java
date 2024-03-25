package lista2_gabrielgoes;

import java.util.Scanner;
/**
 *e) Faça um programa que recebe um número inteiro
 *exibe uma mensagem indicando se ele é par ou ímpar (use o operador % para obter o resto de uma divisão inteira).
 */
public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resto;
        
        System.out.println("Digite um numero");
        num = in.nextInt();
        resto = num % 2;
        if(resto == 0){
            System.out.println("Este numero é par");
        }
        else{
            System.out.println("Este numero é impar");
        }
    }
}