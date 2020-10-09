package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fonte.Boleto;

public class TestePagamentoBoleto {

	@DisplayName("teste para a criação de um  boleto")
	@Test
	public void testBoleto() {
		Boleto teste = new Boleto(001654,20102006,500.00);
		Assertions.assertAll(teste,
				() -> assertEquals(001654,teste.getCodigo()),
				() -> assertEquals(20102006,teste.getData()),
				() -> asserrtEquals(500.00,teste.getValor())
		);		
	}
	
	@DisplayName("teste para criação do cliente")
}
