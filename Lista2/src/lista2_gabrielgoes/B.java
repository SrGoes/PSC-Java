package lista2_gabrielgoes;

import java.util.Scanner;
/*
*b)Tendo como entrada a altura e o sexo de uma pessoa
*construa um programa que exibe o peso ideal para ela, em quilos
*Use as seguintes fórmulas (adote ℎ como a altura e em metros)
* Homens: 72,7 × ℎ − 58
* Mulheres: 62,1 × ℎ − 44,7
*/
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura;
        String sexo;
        
        System.out.println("====Sistema peso ideal====");
        System.out.println("Qual seu sexo? Homem | Mulher");
        sexo = in.next();
        sexo = sexo.substring(0, 1);
        sexo = sexo.toUpperCase();
        
        System.out.println("Qual a sua altura? (insira da seguinte forma > 0,00)");
        altura = in.nextDouble();
        
        if(sexo.equals("H")){
            System.out.println("o seu peso ideal seria: "+ (72.7 * altura - 58));
        }
        else if(sexo.equals("M")){
            System.out.println("o seu peso ideal seria: "+ (62.1 * altura - 44.7));
        }
        else{
            System.out.println("Digite o sexo correto!");
        }
    }
}
