package fonte;

public class Boleto {
	private int codigo;
	private int data;
	private double valor;
	
	public Boleto(int codigo, int data, double valor) {
		this.codigo = codigo;
		this.data = data;
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int getData() {
		return data;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}
