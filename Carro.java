
public class Carro {
    public static void main(String[] args){

        Tipo carro1 = new Tipo("Toyota", "Corolla", 2024);
        Tipo carro2 = new Tipo();
        Tipo carro3 = new Tipo("Chevrolet", "Silverado", 2025);
        Tipo carro4 = new Tipo();
        Tipo carro5 = new Tipo("Fiat", "Uno", 2000);

        System.out.println("--------------------------------------------");
        Tipo.imprimirTotal();

        System.out.println("Ano primeiro carro: " + Tipo.ANO_PRIMEIRO_CARRO);
        }
    }
    /*Se tentar alterar o ANO_PRIMEIRO_CARRO não conseguirá, pois é uma variável final.
      Final em uma variável faz com que ela não possa ser alterada, pois ela é imutável. */