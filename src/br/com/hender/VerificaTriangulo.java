package br.com.hender;

import java.util.Scanner;

public class VerificaTriangulo {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("*** Verificação de Triângulo ***");

    var scan = new Scanner(System.in);
    System.out.print("Digite o primeiro lado: ");
    var primeiroLado = scan.nextInt();

    System.out.print("Digite o segundo lado: ");
    var segundoLado = scan.nextInt();

    System.out.print("Digite o terceiro lado: ");
    var terceiroLado = scan.nextInt();

    if ((primeiroLado + segundoLado) > terceiroLado && (primeiroLado + terceiroLado) > segundoLado
        && (segundoLado + terceiroLado) > primeiroLado) {
      System.out.println("Os lados podem formar um triângulo.");
    } else {
      System.out.println("Os lados NÃO podem formar um triângulo.");
    }
    scan.close();
  }
}
