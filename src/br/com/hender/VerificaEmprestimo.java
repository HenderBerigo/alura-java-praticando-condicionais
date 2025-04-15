package br.com.hender;

import java.util.Scanner;

public class VerificaEmprestimo {
public static void main(String[] args) {
  System.out.println();
  System.out.println("*** Verificação Empréstrimo ***");
  var scan = new Scanner(System.in);
  System.out.print("Digite o valor do empréstimo desejado: ");
  var valorEmprestimo = scan.nextDouble();
  scan.close();

  if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
    System.out.printf("O valor R$ %.2f, está dentro do intervalo permitido para empréstimo.", valorEmprestimo);
    
  } else {
    System.out.printf("O valor R$ %.2f, não está dentro do intervalo permitido para empréstimo.", valorEmprestimo);
  }
}
}
