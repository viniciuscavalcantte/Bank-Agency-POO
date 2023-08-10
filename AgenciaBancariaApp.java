import java.util.Scanner;

public class AgenciaBancariaApp {
    public static void main(String[] args) {
        AgenciaBancaria agencia = new AgenciaBancaria(123);

        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("Menu:");
            System.out.println("1. Criar conta");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar saque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do titular: ");
                    String nomeTitular = scanner.nextLine();
                    System.out.print("Digite o saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);
                    agencia.adicionarConta(novaConta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    int numeroDeposito = scanner.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    agencia.realizarDeposito(numeroDeposito, valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o número da conta: ");
                    int numeroSaque = scanner.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    agencia.realizarSaque(numeroSaque, valorSaque);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (escolha != 4);

        scanner.close();
    }
}
