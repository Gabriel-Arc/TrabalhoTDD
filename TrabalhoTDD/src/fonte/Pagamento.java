package fonte;

public class Pagamento {
	private double valor_pago;
	private String data;
	private String tipo_pagamento;
	
	public Pagamento(double valor_pago, String data, String tipo_pagamento) {
		this.valor_pago = valor_pago;
		this.data = data;
		this.tipo_pagamento = tipo_pagamento;
	}
	
	public double getValor_pago() {
		return valor_pago;
	}
	
	public String getData() {
		return data;
	}
	
	public String getTipo_pagamento() {
		return tipo_pagamento;
	}
	
	public void setValor_pago(double valor_pago) {
		this.valor_pago = valor_pago;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}
}
