package estacionamentoDeVeiculos;

public class Testador {

	public static void main(String[] args) {
		
		Dono D1 = new Dono("234534535", "juca batista", "213434445");
		
		Carro car1 = new Carro("Megane", "mdh-3464", D1);
		
		Moto mot1 = new Moto("CG fan 150", "maw - 3355",D1);
		
		Estacionamento esta1 = new Estacionamento();
		
		esta1.adicionarVeiculoNaVaga(mot1);
		
		esta1.adicionarVeiculoNaVaga(car1);
	
		esta1.adicionarVeiculoNaVaga(car1);
		
		//esta1.removerVeiculoDaVaga(mot1);
		
		
		System.out.println(esta1.verVagas());
		
	}

}