
public class Carro {
    public static void main(String[] args){

        Tipo carro1 = new Tipo("Toyota", "Corolla", 2024);
        carro1.exibir();

        Tipo carro2 = new Tipo();
        carro2.exibir();
        }
    }
    /*O que muda de um para o outro é que no carro1 eu já setei os parametros e no carro2 vai "nascer" vazio por não ter
    as variáveis preenchida nos parametros.*/