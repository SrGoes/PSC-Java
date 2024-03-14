package lista1_gabrielgoes;
import java.util.Scanner;
/**
    a) Faça um programa que recebe três números reais
    e exibe a multiplicação desses números.
 **/
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        System.out.println("=====Sistema: Multiplicar 3 Números=====");
        System.out.println("Digite o Primeiro número!");
        num = in.nextDouble();
        System.out.println("Digite o Segundo número!");
        num*= in.nextDouble();
        System.out.println("Digite o Terceiro número!");
        num*= in.nextDouble();
        
        System.out.println("=====Resultado=====");
        System.out.println("Multiplando os 3 números inseridos teremos: "+ num);
    }
}