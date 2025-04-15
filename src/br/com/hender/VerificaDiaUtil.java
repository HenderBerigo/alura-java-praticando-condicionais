package br.com.hender;

import java.util.Scanner;

public class VerificaDiaUtil {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("*** Verificação de Dia Útil ***");
    var scan = new Scanner(System.in);
    System.out.print("Digite o dia da semana (em letras minúsculas): ");
    var diaDigitado = scan.nextLine();
    scan.close();

    if (diaDigitado.equals("segunda") || diaDigitado.equals("terca") || diaDigitado.equals("quarta")
        || diaDigitado.equals("quinta") || diaDigitado.equals("sexta") || diaDigitado.equals("sabado")
        || diaDigitado.equals("domingo")) {
      if (diaDigitado.equals("domingo") || diaDigitado.equals("sabado")) {
        System.out.printf("%s não é um dia útil.", diaDigitado.substring(0,1).toUpperCase().concat(diaDigitado.substring(1)));
      } else {
        System.out.printf("%s é um dia útil.", diaDigitado.substring(0,1).toUpperCase().concat(diaDigitado.substring(1)));
      }
    } else {
      System.out.printf("%s não é um dia da semana.", diaDigitado.substring(0,1).toUpperCase().concat(diaDigitado.substring(1)));
    }

  }
}
