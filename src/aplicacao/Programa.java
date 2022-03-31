package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Caminhao;
import entidade.Veiculo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(new Veiculo("XPO-4839", 2010));
		veiculos.add(new Veiculo("GTV-8684", 2018));
		veiculos.add(new Veiculo("HEO-1665", 2021));
		
		List<Caminhao> caminhoes = new ArrayList<>();
		caminhoes.add(new Caminhao("HJU-8897", 2003, 8));
		
		for(Veiculo veiculo : veiculos) {
			veiculo.exibirDados();
		}
		
		for(Caminhao caminhao : caminhoes) {
			caminhao.exibirDados();
		}
		
		
		sc.close();
	}

}
