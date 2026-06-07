package br.com.pagamento.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoProxyTest {

    @Test
    void deveProcessarPagamentoValido() {

        Pagamento pagamento = new PagamentoProxy();

        assertDoesNotThrow(() ->
                pagamento.processarPagamento(100.0)
        );
    }

    @Test
    void deveLancarExcecaoQuandoValorForZero() {

        Pagamento pagamento = new PagamentoProxy();

        assertThrows(
                IllegalArgumentException.class,
                () -> pagamento.processarPagamento(0)
        );
    }

    @Test
    void deveLancarExcecaoQuandoValorForNegativo() {

        Pagamento pagamento = new PagamentoProxy();

        assertThrows(
                IllegalArgumentException.class,
                () -> pagamento.processarPagamento(-50)
        );
    }
}