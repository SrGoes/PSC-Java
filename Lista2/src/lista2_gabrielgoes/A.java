package lista2_gabrielgoes;
import java.util.Scanner;
/**
 *a) Faça um programa que recebe duas notas,
 * exibe a média aritmética das notas
 * e uma mensagem indicando se o aluno foi aprovado ou reprovado.
 * A média para aprovação deve ser maior que seis.
 */
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, media;
        
        System.out.println("========================");
        System.out.println("Insira a primeira nota!");
        n1 = in.nextDouble();
        System.out.println("Insira a segunda nota!");
        n2 = in.nextDouble();
        
        media = (n1+n2)/2;
        System.out.println("========================");
        if(media > 6){
            System.out.println("Sua media foi de "+ media +" | Voce foi APROVADO!");
        }else{
            System.out.println("Sua media foi de "+ media +" | Voce foi REPROVADO!"); 
        }
    }
}
