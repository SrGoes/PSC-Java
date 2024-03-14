package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *g) Faça um programa que exibe a área de um círculo
 *a partir do perímetro fornecido pelo usuário.
 */
public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double perimetro, pi = Math.PI, raio;
        System.out.println("=====Sistema: Calcular Area do circulo!=====");
        System.out.println("Qual a circuferencia do circulo?");
        perimetro = in.nextDouble();
        raio = perimetro / pi;
        System.out.println("=====Resultado=====");
        System.out.println("A area do Circulo é de: "+(pi*(2*raio)));
    }
}