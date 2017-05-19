package estacionamentoDeVeiculos;

import java.util.ArrayList;
import java.util.List;

import geometria.Tester;



public class Estacionamento {
	
	
	private List<Veiculo> vagas = new ArrayList<>(); 	
	
	
	public void adicionarVeiculoNaVaga(Veiculo veiculo){
		
		this.vagas.add(veiculo);
		
	}

	public void removerVeiculoDaVaga(Veiculo veiculo){
		this.vagas.remove(veiculo);
	}
	public String verVagas(){		
		return vagas.toString();
		}
	@Override
	public String toString() {
		return "Estacionamento [vagas=" + vagas + "]";
	}
	public List<Veiculo> getVagas() {
		return vagas;
	}
	public void setVagas(List<Veiculo> vagas) {
		this.vagas = vagas;
	}
	
	
	}
	
	

