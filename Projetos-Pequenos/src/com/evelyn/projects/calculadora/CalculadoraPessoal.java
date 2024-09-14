package com.evelyn.projects.calculadora;

import java.util.Scanner;

/**
 * <h1> Calculadora </h1>
 * <p>Programa para ler dois números, e realizar alguma operação matemática escolhida pelo usuário.</p>
 * 
 * <h4>Language: Java</h4>
 *
 * @author Evelyn Mendes
 * @version 1.0 
 * @since 16/07/2024
 */

public class CalculadoraPessoal {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("======================== Sua calculadora pessoal ========================\n");
    System.out.print(">> Digite o primeiro número: ");
    int num1 = input.nextInt();

    System.out.print(">> Digite o segundo número: ");
    int num2 = input.nextInt();

    System.out.println("=========================================================================\n");

    System.out.print(">> Escolha a operação desejada (+, -, /, *): ");
    String opcao = input.next();

    System.out.println("=========================================================================\n");

      System.out.print(">> ");
      switch(opcao){

        case "+":
          System.out.println(num1  + " + " + num2 + " = " + (num1 + num2));
          break;

        case "-":
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;  

        case "*":
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            break;
          
        case "/":
          System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
          break;

        default:
            System.out.println("\nErro: <Por favor, escolha uma opção válida>");
      }

      System.out.println("\nEncerrando...\n");
  }
}
