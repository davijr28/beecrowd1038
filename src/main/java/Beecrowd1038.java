import java.util.Scanner;

public class Beecrowd1038 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int X, Y;
        double total = 0;
        String sequencia;
        String[] partes;

        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        //atribuir valores às variáveis
        X = Integer.parseInt(partes[0]);
        Y = Integer.parseInt(partes[1]);

        //verificar código conforme tabela
        switch (X) {
            case 1:
                total = 4;
                break;
            case 2:
                total = 4.5;
                break;
            case 3:
                total = 5;
                break;
            case 4:
                total = 2;
                break;
            case 5:
                total = 1.5;
                break;
        }
        
        //mostrar resultado no console
        System.out.printf("Total: R$ %.2f%n", total*Y);
    }
}
