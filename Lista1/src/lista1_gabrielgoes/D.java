package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *d) Faça um programa que lê o salário base de alguém e exibe o novo salário
 *considerando 5% de gratificação(mais dinheiro) e 7% de impostos(menos dinheiro)sobre o salário base.
 *Também exiba a gratificação e o imposto.
 */
public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, aumento = 0.05, imposto = 0.07;
        System.out.println("=====Sistema:Reajuste salarial!=====");
        System.out.println("Digite o seu salario!");
        salario = in.nextDouble();
        
        aumento = salario * aumento;
        imposto = salario * imposto;
        salario = salario + aumento - imposto;
        
        System.out.println("=====Resultado=====");
        System.out.println("Com o reajuste seu salario será: "+ salario);
        System.out.println("Gratificação: "+aumento);
        System.out.println("Imposto: "+imposto);
    }  
}
