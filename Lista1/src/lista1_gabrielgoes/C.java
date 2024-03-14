package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *c) Faça um programa que lê o salário atual de alguém
 * exibe o novo salário que é o atual com 25%de aumento.
 */
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, aumento = 1.25;
        System.out.println("=====Sistema:Aumento salarial!=====");
        System.out.println("Digite o seu salario!");
        salario = in.nextDouble();
        
        System.out.println("=====Resultado=====");
        System.out.println("Com o aumento seu salario será: "+ (salario*aumento));
    }
}