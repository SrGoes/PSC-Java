package lista2_gabrielgoes;
import java.util.Scanner;
/**
 *p) Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
• 20% do salário para os funcionários homens com mais de quinze anos de casa;
• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
* Elabore um programa que recebe o sexo e o salário de um funcionário
* exibe o valor total que o funcionário receberá no Natal (salário + bônus).
 */
public class P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;
        String sexo;
        
        System.out.println("Qual seu sexo? Mulher | Homem | Outros");
        sexo = in.next();
        sexo = sexo.substring(0, 1);
        sexo = sexo.toUpperCase();
        
        System.out.println("Qual seu salario?");
        salario = in.nextDouble();
        
        if(sexo.equals("M")){
            salario = salario * 1.25;
            System.out.println("Seu salario novo é de " + salario);
        }
        else if(sexo.equals("H")){
            salario = salario * 1.20;
            System.out.println("Seu salario novo é de " + salario);
        }
        else{
            salario = salario + 200;
            System.out.println("Seu salario novo é de " + salario);
        }
    }
}
