package lista2_gabrielgoes;

import java.util.Scanner;

/**
 *h) Desenvolva um programa que recebe a base e a altura de três triângulos
 *exibe a maior área. Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒×𝑎𝑙𝑡𝑢𝑟𝑎 / 2
 */
public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area1, area2, base, altura;
        
        System.out.println("Digite a base do primeiro triangulo");
        base = in.nextDouble();
        System.out.println("Digite a altura do primeiro triangulo");
        altura = in.nextDouble();
        
        area1 = (base * altura) / 2;
        
        System.out.println("Digite a base do segundo triangulo");
        base = in.nextDouble();
        System.out.println("Digite a altura do segundo triangulo");
        altura = in.nextDouble();
        
        area2 = (base * altura) / 2;
        
        if(area1 > area2){
            System.out.println("A area do primeiro triangulo com "+area1+" é a maior");
        }
        else{
            System.out.println("A area do segundo triangulo com "+area2+" é a maior");
        }
    }
}
