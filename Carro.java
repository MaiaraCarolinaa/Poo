
public class Carro {
    public static void main(String[] args){

        Tipo carro1 = new Tipo("Toyota", "Corolla", 2024);
        carro1.exibir();

        Tipo carro2 = new Tipo("Volkswagen", "Gol", 1998);
        carro2.exibir();
        }
    }
    /*a vantagem de se usar construtores, é que vc já define o estado inicial, e ele executa automaticamente
    assim que o objeto é criado.*/