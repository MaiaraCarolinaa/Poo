public class Carro {
    public static void main(String[] args){
        Tipo carro1 = new Tipo();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2024;
        carro1.exibir();
        carro1.idadeDoCarro();

        Tipo carro2 = new Tipo();
        carro2.marca = "Fiat";
        carro2.modelo = "Toro";
        carro2.ano = 2017;
        carro2.exibir();
    }

}