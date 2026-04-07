
public class Carro {
    public static void main(String[] args){

        Tipo carro1 = new Tipo("Toyota", "Corolla", 2024);
        
        Tipo carro2 = new Tipo();
        Tipo carro3 = new Tipo("Chevrolet", "Silverado", 2025);
        Tipo carro4 = new Tipo();
        Tipo carro5 = new Tipo("Fiat", "Uno", 2000);
        System.out.println("--------------------------------------------");
        System.out.println("Total de carros criados: " + Tipo.totalCarros);
        }
    }
    /*Usamos Tipo.totalCarros pq é um atributo estático e indica que ele pertence a classe.
      Atributo estático - pertence a classe e independente de quantos atributos sejam criados pertence a uma única instancia.
      Atributo de instancia - cada objeto tem seu próprio valor, é removido pelo garbage collector depois de instanciado, podem
      ser inicializados na declaração ou no construtor.
      Em resumo, o atributo estático é compartilhado por todas as instancias daquela classe.
      Já o atributo de instancia é único para cada objeto. */