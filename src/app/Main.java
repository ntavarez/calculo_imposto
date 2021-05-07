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
			
			
		}
		
		sc.close();
	}

}
