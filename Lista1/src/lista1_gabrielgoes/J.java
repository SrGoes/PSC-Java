package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *j) Faça um programa que recebe duas notas
 *exibe a média ponderada dessas notas
 *considerando peso dois para a primeira e peso três para a segunda.
 */
public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2;
        System.out.println("=====Sistema: Media do aluno!=====");
        System.out.println("Digite a nota 1!");
        n1 = in.nextDouble();
        System.out.println("Digite a nota 2!");
        n2 = in.nextDouble();
        
        System.out.println("=====Resultado=====");
        System.out.println("Media do aluno: "+ ((n1*2)+(n2*3))/5);
    }
}