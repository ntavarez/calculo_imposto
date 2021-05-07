package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.println("Digite o número de contribuintes: ");
		int numeroContribuintes = sc.nextInt();
		
		for(int i = 1; i <= numeroContribuintes; i++) {
			System.out.println("Dados do contribuinte #" + i);
			System.out.println("Pessoa Física ou Jurídica (F/J)? ");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(tipo == 'F') { //
				System.out.println("Gastos com saúde: ");
				Double GastosSaude = sc.nextDouble();
				
				PessoaFisica pessoa = new PessoaFisica(nome, rendaAnual, GastosSaude);
				lista.add(pessoa);
			} else {
				System.out.println("Número de funcionários: ");
				Integer numeroFuncionarios = sc.nextInt();
				
				PessoaJuridica empresa = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				lista.add(empresa);
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		
		for(Contribuinte contribuinte : lista) {
			System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f", contribuinte.imposto()));
		}
		
		double soma = 0.0;
		for(Contribuinte contribuinte : lista) {
			soma+= contribuinte.imposto();
		}
		
		System.out.println("IMPOSTO TOTAL: R$ " + String.format("%.2f", soma));
		
		sc.close();
	}

}
