package br.com.hender;

public class Principal {
  public static void main(String[] args) {
    String nome = "Hender";
    double salario = 2890.00;
    int numeroDependentes = 2;
    boolean isento = true;

    if (salario > 2200  && !isento) {
      double irpf = salario / 100 * 7.5;
      System.out.println("O valor do IRPF é R$ "+irpf);
    } else {
      System.out.println("Não tem imposto de IRPF.");
    }
  }
}
