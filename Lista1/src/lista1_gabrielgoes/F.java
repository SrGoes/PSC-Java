package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *f) Faça um programa que exibe a área de um triângulo
 *a partir da base e da altura fornecidas pelo usuário.
 */
public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base, altura;
        System.out.println("=====Sistema: Calcular Area do Triangulo!=====");
        System.out.println("Digite a BASE do Triangulo!");
        base = in.nextDouble();
        System.out.println("Digite a ALTURA do Triangulo!");
        altura = in.nextDouble();
        
        System.out.println("=====Resultado=====");
        System.out.println("A area do Triangulo é de: "+(altura*base)/2);
    }
}