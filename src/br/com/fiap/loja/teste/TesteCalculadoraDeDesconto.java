package br.com.fiap.loja.teste;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;
import br.com.fiap.loja.desconto.CalculadoraDesconto;

public class TesteCalculadoraDeDesconto {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal(100), 210);
		CalculadoraDesconto calculadoraDeDesconto = new CalculadoraDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		System.out.println(desconto);
	}
}
