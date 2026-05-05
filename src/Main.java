
public class Main {

  public static void main(String[] args) {

      Produto p1 = new Produto("Notebook", 8000);
      Produto p2 = new Produto("Tela LED 21 pol", 1800);

      System.out.println(p1); // Dessa forma o programa irá exibir seu endereço de memória
      System.out.println(p2); // não sendo o ideal para a fácil compreensão
  }
}