package br.com.hender;

import java.util.Scanner;

public class DoacaoSangue {
 public static void main(String[] args) {
  System.out.println();
  System.out.println("*** Doação de sangue ***");
  var scan = new Scanner(System.in);
  System.out.print("Digite a idade do doador: ");
  var idadeDoador = scan.nextInt();
  System.out.print("Digite o peso do doador (em kg): ");
  var pesodoador = scan.nextDouble();

  if (idadeDoador > 18 && idadeDoador < 65) {
    if(pesodoador > 50){
      System.out.println("Doador compatível.");
    } else {
      System.out.println("Doador não é compatível");
      System.out.println("Motivo: Deve ter 50kg ou mais de peso.");
    }
  } else {
    System.out.println("Doador não é compatível");
    System.out.println("Motivo: Deve ter entre 18 e 65 anos.");

  }


  scan.close();
 }
}
