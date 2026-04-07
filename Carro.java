
public class Carro {
    public static void main(String[] args){

        Tipo carro1 = new Tipo("Toyota", "Corolla", 2024);
        Tipo carro2 = new Tipo();
        Tipo carro3 = new Tipo("Chevrolet", "Silverado", 2025);
        Tipo carro4 = new Tipo();
        Tipo carro5 = new Tipo("Fiat", "Uno", 2000);

        Tipo.imprimirTotal();
        }
    }
    /*Não é possível acessar pelo imprimirTotal, visto que é estático, não tem como referenciar.
      O método estático não consegue acessar um atributo de instancia pq ele pertence a uma classe, ele não tem
      referência ao objeto criado. */