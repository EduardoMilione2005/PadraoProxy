package br.com.pagamento;

import br.com.pagamento.proxy.Pagamento;
import br.com.pagamento.proxy.PagamentoProxy;

public class Main {

    public static void main(String[] args) {

        Pagamento pagamento = new PagamentoProxy();

        pagamento.processarPagamento(500.00);
    }
}