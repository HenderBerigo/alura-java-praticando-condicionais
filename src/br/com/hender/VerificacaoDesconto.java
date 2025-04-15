package br.com.hender;

import java.util.Scanner;

public class VerificacaoDesconto {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("*** Verificação de Desconto ***");
    var scan = new Scanner(System.in);
    System.out.print("Qual o valor da compra?: ");
    var valorCompra = scan.nextDouble();
    var valorParaDesconto = 100.00;

    if (valorCompra > valorParaDesconto) {
      var valorFinal = valorCompra * 0.90;
      System.out.println("Desconto de 10% aplicado.");
      System.out.printf("Novo valor: R$ %.2f.", valorFinal);
    } else {
      System.out.println("Nenhum desconto aplicado.");
      System.out.printf("Valor total: R$ %.2f.",valorCompra);
    }

    scan.close();

  }
}
