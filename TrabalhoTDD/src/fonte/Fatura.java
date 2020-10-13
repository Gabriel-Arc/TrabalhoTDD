package fonte;

import java.util.Scanner;

public class Fatura {
	private int data;
	private double valor_total;
	private String nome;
	public Boleto[] boletos;
	private int count = 0;
	
	public Fatura(int data, double valor_total, String nome) {
		this.data = data;
		this.valor_total = valor_total;
		this.nome = nome;
	}
	
	public int getData() {
		return data;
	}
	
	public double getValor_total() {
		return valor_total;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addBoleto(Fatura fatura, int numBoletos, int codigoBoleto, int dataBoleto, double valorBoleto) {
			fatura.boletos[count] = new Boleto(codigoBoleto,dataBoleto,valorBoleto);
			this.count = count +1;
		}
	
	public void addBoletoInterativo(Fatura fatura, int numBoletos) {
		int codBoleto, dataBoleto;
		double valorBoleto;
		Scanner resp = new Scanner(System.in);
		for(int i = 0;i<numBoletos;i++) {
			System.out.println("Qual é o código do boleto?\n");
			codBoleto = resp.nextInt();
			System.out.println("Qual é a data do boleto?\n");
			dataBoleto = resp.nextInt();
			System.out.println("Qual é o valor do boleto?\n");
			valorBoleto = resp.nextDouble();
			fatura.boletos[count] = new Boleto(codBoleto,dataBoleto,valorBoleto);
			this.count = count +1;
		}
	}
}
