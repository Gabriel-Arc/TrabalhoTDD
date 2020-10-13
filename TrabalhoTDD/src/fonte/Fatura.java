package fonte;

import java.util.Scanner;

public class Fatura {
	private String data;
	private double valor_total;
	private String nome;
	public Boleto[] boletos;
	private int count = 0;
	public Pagamento[] pagamentos;
	public String estado = "Não pago";
	
	public Fatura(String data, double valor_total, String nome) {
		this.data = data;
		this.valor_total = valor_total;
		this.nome = nome;
	}
	
	public String getData() {
		return data;
	}
	
	public double getValor_total() {
		return valor_total;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void addBoleto(Fatura fatura, String codigoBoleto, String dataBoleto, double valorBoleto) {
			fatura.boletos[count] = new Boleto(codigoBoleto,dataBoleto,valorBoleto);
			this.count = count +1;
		}
	
	public void addBoletoInterativo(Fatura fatura, int numBoletos) {
		String codBoleto, dataBoleto;
		double valorBoleto;
		Scanner resp = new Scanner(System.in);
		for(int i = 0;i<numBoletos;i++) {
			System.out.println("Qual é o código do boleto?\n");
			codBoleto = resp.nextLine();
			System.out.println("Qual é a data do boleto?\n");
			dataBoleto = resp.nextLine();
			System.out.println("Qual é o valor do boleto?\n");
			valorBoleto = resp.nextDouble();
			fatura.boletos[count] = new Boleto(codBoleto,dataBoleto,valorBoleto);
			this.count = count +1;
		}
	}
	
	public void efetuaPagamento(Fatura fatura, int num_boleto, String data, String tipo_pagamento) {
		double soma_valor = 0;
		Pagamento pagamento = new Pagamento(fatura.boletos[num_boleto-1].getValor(),"05102020","Boleto");
		fatura.pagamentos[num_boleto-1] = pagamento;
		for(int i = 0;i<fatura.pagamentos.length;i++) {
			soma_valor = soma_valor + fatura.pagamentos[i].getValor_pago();
		}
		if(soma_valor >= fatura.getValor_total()){
			fatura.setEstado("Pago");
		}
		
	}
}
