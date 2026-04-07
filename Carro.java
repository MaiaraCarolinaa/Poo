public class Carro {
    public static void main(String[] args){
        Tipo carro1 = new Tipo();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2024;
        System.out.println("Marca: " + carro1.marca + ", Modelo: " + carro1.modelo + ", Ano: " + carro1.ano);

        Tipo carro2 = new Tipo();
        carro2.marca = "Fiat";
        carro2.modelo = "Toro";
        carro2.ano = 2017;
        System.out.println("Marca: " + carro2.marca + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);
    }

}