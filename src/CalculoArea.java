import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Escolha uma opção!
                1) Calcular área do quadrado
                2) Calcular a área do circulo
                
                """);
        int opcao = leitura.nextInt();
        double pi = 3.14159;
        switch (opcao){
            case 1:
                System.out.println("Digite a largura do quadrado:");
                double largura = leitura.nextDouble();
                double areaQua = largura * largura;
                System.out.println("A área do quadrado é: " +areaQua);
                break;

            case 2:
                System.out.println("Digite o raio:");
                double raio = leitura.nextDouble();
                double areaCir = pi * (raio * raio);
                System.out.println("A área do circulo é: " +areaCir);
                break;
        }

    }


}
