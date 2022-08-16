package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {
        Carros carros = new Carros();
        carros.nome = "Civic";
        carros.modelo = "LX";
        carros.ano = 2022;

        Carros carros2 = new Carros();
        carros2.nome = "Fusca";
        carros2.modelo = "1600";
        carros2.ano = 1976;

        carros2 = carros;

        System.out.println("Carro 1 "+carros.nome+ "  Modelo "+carros.modelo+"  Ano "+carros.ano);
        System.out.println("\n Carro 2 "+carros2.nome+ "  Modelo "+carros2.modelo+"  Ano "+carros2.ano);
    }
}
