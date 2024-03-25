package lista2_gabrielgoes;

import java.util.Scanner;

/**
 *n) Faça um programa que recebe a idade de um nadador 
 *exibe a categoria que ele pertence. Sendo o critério:
• Infantil (0 a 10 anos);
• Junior (11 a 14 anos);
• Adolescente (15 a 20 anos);
• Jovem (21 a 35 anos) e
• Máster (> 35 anos).
 */
public class N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        
        System.out.println("Qual sua idade?");
        idade = in.nextInt();
        
        if(idade <= 0){
            System.out.println("Idade invalida!!");
        }
        else if(idade <= 10){
            System.out.println("Categoria: Infantil");
        }
        else if(idade <= 14){
            System.out.println("Categoria: Junior");
        }
        else if(idade <= 20){
            System.out.println("Categoria: Adolescente");
        }
        else if(idade <= 35){
            System.out.println("Categoria: jovem");
        }
        else{
            System.out.println("Categoria: Master");
        }
    }
}
