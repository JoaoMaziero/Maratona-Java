package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        System.out.println(" Finalizando Calculadora 01 ");
        calculadora.subtraiWoisNumeros();
        System.out.println("\n Finalizando a subtração");
    }
}
