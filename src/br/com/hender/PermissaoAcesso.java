package br.com.hender;

import java.util.Scanner;

public class PermissaoAcesso {
public static void main(String[] args) {
  System.out.println();
  System.out.println("*** Permissão de Acesso ***");


  var scan = new Scanner(System.in);
  System.out.print("Digite o código de acesso: ");
  var codigoAcesso = scan.nextInt();
  System.out.print("Digite o nível de acesso: ");
  var nivelAcesso = scan.nextInt();

  if (codigoAcesso == 2023) {
    if(nivelAcesso == 1 || nivelAcesso == 2 || nivelAcesso == 3){
      System.out.println("Acesso permitido. Bem-vindo ao sistema!");
    } else {
      System.out.println("Acesso negado. Nível de acesso não permitido.");
    }
  } else {
    System.out.println("Acesso negado. Código de acesso incorreto.");
  }



  scan.close();
}
}
