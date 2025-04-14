package br.com.hender;

import java.util.Scanner;

public class ComparandoNumeros {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("*** Comparando Números ***");

    var scan = new Scanner(System.in);
    System.out.println();
    System.out.print("Digite o primeiro número: ");
    var primeiroNumero = scan.nextInt();
    System.out.print("Digite o segundo número: ");
    var segundoNumero = scan.nextInt();

    if (primeiroNumero > segundoNumero) {
      System.out.printf("O maior número é o %d.", primeiroNumero);
    } else if (primeiroNumero == segundoNumero) {

      System.out.printf("Os números são iguais.");

    } else {

      System.out.printf("O maior número é o %d.", segundoNumero);
    }

    scan.close();
  }
}
