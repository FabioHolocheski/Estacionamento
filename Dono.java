package estacionamentoDeVeiculos;

public class Dono {
	
	private String CPF;
	private String nome;
	private String telefone;
	
	public Dono(String cPF, String nome, String telefone) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.telefone = telefone;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Dono [CPF=" + CPF + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}
