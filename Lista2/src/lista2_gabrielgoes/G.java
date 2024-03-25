package lista2_gabrielgoes;
import java.util.Scanner;

/**
 *g) Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão"
 *recebe dois valores reais, a operação escolhida pelo usuário
 *exibe o resultado da operação sobre os valores.
 */
public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2;
        int escolha;
        
        System.out.println("===Calculadora===");
        System.out.println("Escolha a operação= 1 - Adiçao | 2 - subtração | 3 - multiplicacao | 4 - divisão");
        escolha = in.nextInt();
        
        System.out.println("digite o 1º numero");
        num1 = in.nextDouble();
        System.out.println("digite o 2º numero");
        num2 = in.nextDouble();
        
        if(escolha == 1){
            System.out.println("Resultado ="+ (num1 + num2));
        }
        else if(escolha == 2){
            System.out.println("Resultado ="+ (num1 - num2));
        }
        else if(escolha == 3){
            System.out.println("Resultado ="+ (num1 * num2));
        }
        else if(escolha == 4){
            System.out.println("Resultado ="+ (num1 / num2));
        }
        else{
            System.out.println("ERRO: Escolha uma operação valida!!");
        }
    }
}
