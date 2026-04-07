
import java.util.ArrayList;

public class Carro {
    public static void main(String[] args){
        ArrayList<Tipo> listadecarros = new ArrayList<>();

        Tipo carro1 = new Tipo();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2024;
        listadecarros.add(carro1);

        Tipo carro2 = new Tipo();
        carro2.marca = "Fiat";
        carro2.modelo = "Toro";
        carro2.ano = 2017;
        listadecarros.add(carro2);

        Tipo carro3 = new Tipo();
        carro3.marca = "Volkswagen";
        carro3.modelo = "Fusca";
        carro3.ano = 2001;
        listadecarros.add(carro3);

        System.out.println("--------- LISTA DE CARROS -------------");
        
        for (Tipo t : listadecarros){
            t.exibir();

        System.out.println("-----------------------");
        }
    }

}