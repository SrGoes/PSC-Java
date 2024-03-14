package lista1_gabrielgoes;
import java.util.Scanner;
/**
 *b) Faça um programa que recebe as notas A1, A2 e A3
 * exibe a média 
 * considerando que as notas são lançadas de 0 a 10
 * a nota A1 tem peso 3, a nota A2 tem peso 3 e a nota A3 tem peso 4.
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a1, a2, a3;
        System.out.println("=====Sistema: Media do aluno!=====");
        System.out.println("Digite a nota A1!");
        a1 = in.nextDouble();
        System.out.println("Digite a nota A2!");
        a2 = in.nextDouble();
        System.out.println("Digite a nota A3");
        a3 = in.nextDouble();
        
        System.out.println("=====Resultado=====");
        System.out.println("Media do aluno: "+ ((a1*3)+(a2*3)+(a3*4))/10);
    }
}