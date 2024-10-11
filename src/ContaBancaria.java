import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Edimaique";
        String tipoConta = "Corrente";
        double saldo = 2500;

        System.out.println("""
                ******************************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %f
                                
                ******************************************
               
                """.formatted(nomeCliente, tipoConta, saldo));

        int opcao = 0;

        while (opcao != 4){

            System.out.println("""
                Operações
                
                
                1- Consultar Saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("O Saldo atual é : "+saldo);
            } else if (opcao ==2) {
                System.out.println("Digite o valor a receber:");
                double valorReceber = leitura.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado: "+saldo);
            } else if (opcao == 3) {
                System.out.println("Digite o valor da transferencia:");
                double transferirValor = leitura.nextDouble();
                saldo -= transferirValor;
                System.out.println("Saldo atualizado: "+ saldo);
            } else if (opcao == 4) {
                System.out.println("Saindo da aplicação...");
            } else {
                System.out.println("Opção inválida");
            }

        }



    }
}
