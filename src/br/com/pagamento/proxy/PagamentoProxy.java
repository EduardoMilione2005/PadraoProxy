package br.com.pagamento.proxy;

public class PagamentoProxy implements Pagamento {

    private PagamentoReal pagamentoReal;

    @Override
    public void processarPagamento(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do pagamento deve ser maior que zero."
            );
        }

        if (pagamentoReal == null) {
            pagamentoReal = new PagamentoReal();
        }

        System.out.println("Verificando autorização do pagamento...");
        pagamentoReal.processarPagamento(valor);
    }
}