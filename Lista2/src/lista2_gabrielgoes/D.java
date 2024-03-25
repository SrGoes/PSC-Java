package lista2_gabrielgoes;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *d) Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.
 */
public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Digite o 1º numero");
        num1 = in.nextDouble();
        System.out.println("Digite o 2º numero");
        num2 = in.nextDouble();
        
        if(num1 < num2){
            System.out.println("o menor numero é "+ new DecimalFormat(".##").format(num1));
        }
        else if(num1 == num2){
            System.out.println("Ambos os numeros são iguais!");
        }
        else{
            System.out.println("o menor numero é "+ new DecimalFormat(".##").format(num2));
        }
    }
}
