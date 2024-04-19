package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contD, valorInt;
        double valorDouble;
        String titular;

        System.out.println("==========Banco==========");
        System.out.println("Bem-Vindo ao Sistema de cadastro de cliente");
        System.out.println("Qual o nome do Titular?");
        titular = in.next(); in.nextLine();
        System.out.println("Porfavor Aguarde, enquanto criamos a conta!");

        Conta cb1 = new Conta(titular);

        System.out.println("Conta criada - aqui estãos as informações da conta:");
        cb1.mostrarDados();
        System.out.println("Qual será o limite para esse cliente?");
        valorDouble = in.nextDouble(); in.nextLine();
        cb1.setLimite(valorDouble);

        System.out.println("Quantos depositos o cliente deseja fazer agora?");
        contD = in.nextInt(); in.nextLine();

        for (int i = 0; i < contD; i++){
            System.out.println("Qual o valor do Deposito? ("+ (i + 1) +"º Deposito)");
            valorDouble = in.nextDouble();
            cb1.depositar(valorDouble);
        }
        cb1.mostrarDados();

        do {
            System.out.println("Deseja sacar? se sim digitar valor que deseja sacar, se não digite 0");
            valorDouble = in.nextDouble();
            in.nextLine();
            if(valorDouble != 0){
                cb1.sacar(valorDouble);
            }
        } while(valorDouble != 0);

        cb1.mostrarDados();
        valorDouble = 1;

        while(valorDouble != 0) {
            System.out.println("Deseja depositar? se sim digitar valor que deseja depositar, se não digite 0");
            valorDouble = in.nextDouble();
            in.nextLine();
            if(valorDouble != 0){
                cb1.depositar(valorDouble);
            }
        }

        cb1.mostrarDados();
    }
}