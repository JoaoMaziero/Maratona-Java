package academy.devdojo.maratonajava.introducao;


public class Aula04Operadores {
    public static void main(String[] args) {
        // + - /*
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println( resultado );

        // %
        int resto = 21 % 7 ;
        System.out.println(resto);

        // < > <= >=  ==  !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        //  && (AND)   || (or)  ! (not)
        int idade  = 29;
        float salario = 3500F;
        boolean isdentroDaLeiMaiorQueTrinta = idade >= 30   && salario >= 4612 ;
        boolean isdentroDaLeiMenorQueTrinta = idade < 30   && salario >= 3381 ;
        System.out.println(" ");
        System.out.println(" dentroDaLeiMaiorQueTrinta " + isdentroDaLeiMaiorQueTrinta);
        System.out.println(" dentroDaLeiMenorQueTrinta " + isdentroDaLeiMenorQueTrinta);
        System.out.println(" ");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel =  valorTotalContaCorrente > valorPlaystation ||  valorTotalContaPoupanca > valorPlaystation ;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // =  +=  -=  /=  %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(" ");
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(" ");
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(" ");
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(" ");
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(" ");
        System.out.println(bonus);
    //

        int contador = 0;
        contador +=1;
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        int contador2 =0;

        System.out.println(" ");
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
