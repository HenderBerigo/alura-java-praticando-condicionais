package br.com.hender;

import java.util.Scanner;

public class ParImpar {
public static void main(String[] args) {
  
  System.out.println();
  System.out.println("*** Verificação de Par ou Ímpar ***");

  var scan = new Scanner(System.in);
  System.out.print("Entre com o número: ");
  var numero = scan.nextInt();

  if( numero == 0){
    System.out.printf("O número %d não é par e nem ímpar.", numero);
  } else if(numero % 2 == 0){
    System.out.printf("O número %d é par.", numero);
  } else {
    
    System.out.printf("O número %d é ímpar.", numero);
  }
  scan.close();
}
}
