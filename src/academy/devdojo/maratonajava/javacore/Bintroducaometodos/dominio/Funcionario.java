package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media ;

    public void imprime() {
        if (salarios == null) {
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salarios) {
             System.out.print(salario + " ");
        }
        imprimeMediaSalarial();

    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salaria " + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
