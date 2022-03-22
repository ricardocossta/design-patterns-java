package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public interface Imposto {
	
	BigDecimal calcular(Pedido pedido);

}
