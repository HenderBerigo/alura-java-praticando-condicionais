package br.com.hender;

import java.util.Scanner;

public class Aprovacao {
  public static void main(String[] args) {
    System.out.println("*** Verificação de Aprovação ***");
    var scan = new Scanner(System.in);

    System.out.print("Entre com a 1ª nota: ");
    var nota1 = scan.nextDouble();
    System.out.print("Entre com a 2ª nota: ");
    var nota2 = scan.nextDouble();
    System.out.print("Entre com a 3ª nota: ");
    var nota3 = scan.nextDouble();

    var media = (nota1+nota2+nota3) /3;

    if (media > 7) {
      System.out.printf("O estudante teve média %.2f e foi aprovado.", media);
      
    } else if(media > 5 && media < 6.9){
      System.out.printf("O estudante teve média %.2f e está de recuperação.", media);
    } else {
      
      System.out.printf("O estudante teve média %.2f e foi reprovado.", media);
    }

    scan.close();

  }
}
