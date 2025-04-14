package br.com.hender;

public class CalculoIRPF {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("** Cálculo de IRPF ***");
    String nome = "Hender";
    double salario = 1890.00;
    //int numeroDependentes = 2;
    boolean isento = true;

    if (salario > 2200  && !isento) {
      double irpf = salario / 100 * 7.5;
      System.out.printf("O valor do IRPF de %s é R$ %.2f", nome, irpf);

    } else if(isento){

      System.out.printf("%s está isento de IRPF.", nome);
    } 
        else {
      System.out.printf("Não tem imposto de IRPF para %s", nome);
    }
  }
}
