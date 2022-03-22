package br.com.fiap.loja.teste;

import java.math.BigDecimal;

import br.com.fiap.imposto.CalculadoraDeImposto;
import br.com.fiap.imposto.Ipi;
import br.com.fiap.loja.Pedido;

public class TesteCalculadoraDeImposto {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100));
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		calculadoraDeImposto.setImposto(new Ipi());
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
	}

}
