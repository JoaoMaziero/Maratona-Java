package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05_1 {
    public static void main(String[] args) {

        char sexo = 'M';

        switch (sexo) {

            case 'M':
                System.out.println("HOMEM");
                break;
            case 'F':
                System.out.println("MULHER");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }
}
