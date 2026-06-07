package br.com.pagamento.proxy;

public class PagamentoReal implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado com sucesso.");
    }
}