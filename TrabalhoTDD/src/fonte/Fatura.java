package fonte;

public class Fatura {
	private int data;
	private double valor_total;
	private String nome;
	
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
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
