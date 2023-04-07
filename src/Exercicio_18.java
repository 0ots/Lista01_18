import java.util.Scanner;

public class Exercicio_18 {

    public static void main(String[] args) throws Exception {

        int tempodownload;
        
        double tamanhoarquivo, velocidadelink;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB: ");

        tamanhoarquivo = input.nextDouble();

        System.out.println("Digite a velocidade do link de internet: ");

        velocidadelink = input.nextDouble();

        input.close();

        tempodownload = (int) Math.round(tamanhoarquivo / velocidadelink);

        if(tempodownload < 1)

        {

            System.out.println("O tempo aproximado para conclusão do download do arquivo é de: " + tempodownload + " segundo(s)");

        }

        else if (tempodownload >= 1)
        
        {

            System.out.println("O tempo aproximado para conclusão do download do arquivo é de: " + tempodownload+ " minuto(s)");

        }

    }

}
