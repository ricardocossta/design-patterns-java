package br.com.fiap.loja.desconto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.fiap.loja.Pedido;

class DescontoTest {

	@Test
	void deveRetornarUmDescontoParaPedidosComValorAlto() {
		Pedido pedido = new Pedido(new BigDecimal(600), 210);
		CalculadoraDesconto calculadoraDeDesconto = new CalculadoraDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);

		assertEquals(new BigDecimal("60.00"), desconto);
	}
	
	@Test
	void deveRetornarUmDescontoParaPedidosComGrandesQuantidades() {
		Pedido pedido = new Pedido(new BigDecimal(100), 210);
		CalculadoraDesconto calculadoraDeDesconto = new CalculadoraDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);

		assertEquals(new BigDecimal("5.00"), desconto);
	}
	
	@Test
	void deveRetornarDescontoZeroCasoNaoApliqueAsOutrasRegras() {
		Pedido pedido = new Pedido(new BigDecimal(10), 2);
		CalculadoraDesconto calculadoraDeDesconto = new CalculadoraDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);

		assertEquals(new BigDecimal("0.00"), desconto);
	}

}
