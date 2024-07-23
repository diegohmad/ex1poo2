package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o tipo de cliente:");
            System.out.println("1. Regular");
            System.out.println("2. VIP");
            System.out.println("3. Funcionario");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 4) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.println("Informe o consumo:");
            double consumo = scanner.nextDouble();

            DescontoStrategy descontoStrategy;

            switch (escolha) {
                case 1:
                    descontoStrategy = new DescontoClienteRegular();
                    break;
                case 2:
                    descontoStrategy = new DescontoClienteVIP();
                    break;
                case 3:
                    descontoStrategy = new DescontoFuncionario();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            CalculadoraDescontos calculadora = new CalculadoraDescontos(descontoStrategy);
            double desconto = calculadora.calcularDesconto(consumo);

            System.out.println("Desconto calculado: " + desconto);
        }

        scanner.close();
    }
}
