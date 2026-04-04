import java.util.Scanner; // 1. Isso traz a ferramenta de leitura

public class Main {
    public static void main(String[] args) {
        // 2. Preparamos o Scanner para ouvir o teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- SISTEMA WORKANA ---");
        System.out.print("Qual o valor em dolár do projeto? ");
        int valor = teclado.nextInt();
        double cotacao = 5.0;
        double valorReal = valor * cotacao ;

        // 3. O programa PARA aqui e espera você digitar um número e dar Enter
        {
            System.out.println("Em reais você vai receber: R$ " + valorReal);
        }

        teclado.close(); // Fecha o Scanner para economizar memória
    }
}