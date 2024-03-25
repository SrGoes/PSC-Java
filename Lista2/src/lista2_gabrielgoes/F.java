package lista2_gabrielgoes;
import java.util.Scanner;
/**
 *f) Faça um programa que recebe três números reais
 *exibe em ordem crescente
 */
public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.println("Digeite o 1º numero");
        n1 = in.nextDouble();
        System.out.println("Digeite o 2º numero");
        n2 = in.nextDouble();
        System.out.println("Digeite o 3º numero");
        n3 = in.nextDouble();
        
        if(n1 > n2 && n1 > n3){
            System.out.println("1º - "+n1);
            if(n2 > n3){
                System.out.println("2º - "+n2);
                System.out.println("3º - "+n3);
            }else{
                System.out.println("2º - "+n3);
                System.out.println("3º - "+n2);
            }
        }
        else if(n2 > n3){
            System.out.println("1º - "+n2);
            if(n1 > n3){
                System.out.println("2º - "+n1);
                System.out.println("3º - "+n3);
            }else{
                System.out.println("2º - "+n3);
                System.out.println("3º - "+n1);
            }
        }
        else{
           System.out.println("1º - "+n3);
            if(n1 > n2){
                System.out.println("2º - "+n1);
                System.out.println("3º - "+n2);
            }else{
                System.out.println("2º - "+n2);
                System.out.println("3º - "+n1);
            } 
        }
    }
}
