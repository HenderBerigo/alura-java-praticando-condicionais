package br.com.hender;

import java.util.Scanner;

public class ValidacaoSenha {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("** Validação de Senha **");

    var senhaDoUsuarioNoBanco = 123456;

    var scan = new Scanner(System.in);
    System.out.print("Digite a senha: ");
    var senhaDigitada = scan.nextInt();
    
    if(senhaDigitada == senhaDoUsuarioNoBanco){
      
      System.out.println("Acesso permitido!");
    } else {
      System.out.println("Acesso negado!");
    }
    

    scan.close();
  }
}
