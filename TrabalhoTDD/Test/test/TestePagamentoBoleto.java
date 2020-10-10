package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fonte.Boleto;
import fonte.Cliente;
import fonte.Fatura;

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
	@Test
	public void testCliente() {
		Cliente teste = new Cliente("Mona", "24589736144");
		Assertions.assertEquals("Mona",teste.getNome());
		Assertions.assertEquals("24589736144",teste.getCpf());
			
	}
	
	@DisplayName("teste para criação de uma fatura")
	@Test
	public void testFatura() {
		Fatura teste = new Fatura(06102020,28.90,"Mona");
		Assertions.assertAll(teste,
				() -> assertEquals(06102020,teste.getData()),
				() -> assertEquals(28.90,teste.getValor_total()),
				() -> assertEquals("Mona",teste.getNome())
				);
	}
}
