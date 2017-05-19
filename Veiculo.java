package estacionamentoDeVeiculos;

public class Veiculo {
	
	private String modelo;
	private String placa;
	private Dono dono;

	public Veiculo(String modelo, String placa, Dono dono) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.dono = dono;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", dono=" + dono + "]     ////";
	}
		
}
