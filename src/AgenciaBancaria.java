import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
    private int numeroAgencia;
    private List<ContaBancaria> contas;

    public AgenciaBancaria(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.contas = new ArrayList<>();
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void realizarDeposito(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta " + numeroConta + " não encontrada na agência " + numeroAgencia);
        }
    }

    public void realizarSaque(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta " + numeroConta + " não encontrada na agência " + numeroAgencia);
        }
    }
}
