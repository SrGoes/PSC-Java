package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *e) Faça um programa que exibe a área de um retângulo
 *a partir da base e da altura fornecidas pelo usuário.
 */
public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base, altura;
        System.out.println("=====Sistema: Calcular Area do Retangulo!=====");
        System.out.println("Digite a BASE do retangulo!");
        base = in.nextDouble();
        System.out.println("Digite a ALTURA do retangulo!");
        altura = in.nextDouble();
        
        System.out.println("=====Resultado=====");
        System.out.println("A area do retangulo é de: "+(altura*base));
    }
}