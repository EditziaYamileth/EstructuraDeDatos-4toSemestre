package asesorias;

public class Moneda implements Comparable < Moneda >{
	private final Integer  id;
	private final Integer valor;
	private final String tipo;
	
	public Moneda(Integer id,  Integer valor, String tipo){
		this.id = id;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	

	public Moneda() {
		this.id = null;
		this.valor = null;
		this.tipo = "";
	}



	public int getId() {
		return id;
	}

	public int getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}
	
	

	@Override
	public String toString() {
		String salida;
		salida = String.format("[%d]: [$%02d %s ]", id, valor, tipo);
		return " Moneda: "+salida;
	}

	public int  compareTo(Moneda otro) {
			if(valor == otro.getValor()) return 0;
		return valor > otro.getValor() ? 1: -1;
	}
	
	

}
