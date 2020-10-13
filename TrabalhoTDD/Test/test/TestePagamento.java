package test;

import org.junit.jupiter.api.Assertions;

import fonte.Fatura;

public class TestePagamento {
	
	@DisplayName("teste para a realização de um pagamento")
	@Test
	public void testaPagamento() {
		Fatura fatura = new Fatura("07102020",1500.00,"Mona");
		fatura.addBoleto(fatura, "001658", "07102020", 500.00);
		fatura.addBoleto(fatura, "001658", "07102020", 400.00);
		fatura.addBoleto(fatura, "001658", "07102020", 600.00);
		fatura.efetuaPagamento(fatura,1);
		Assertions.assertEquals(500.00,fatura.pagamentos[0].getValor_pago());
		fatura.efetuaPagamento(fatura,2);
		Assertions.assertEquals(400.00,fatura.pagamentos[1].getValor_pago());
		fatura.efetuaPagamento(fatura,3);
		Assertions.assertEquals(600.00,fatura.pagamentos[2].getValor_pago());
		Assertions.assertEquals("Pago",fatura.getEstado());
	}
}
