package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Livro;
import entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Pessoa[] p = new Pessoa[2];
		Livro [] l = new Livro [3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Java", "Jose da Silva", 300, p[0] );
		l[1] = new Livro("OO Java", "Pedro Paulo", 500, p[1] );
		l[2] = new Livro("SQL", "Maria Candido", 800, p[0]);
		
		//abre o livro
		l[0].abrir();
		//folhear o livro
		l[0].folhear(200);
		//avanca paginas do livro 
		l[0].avancarpag();
		//volta paginas do livro
		l[0].voltarPag();
		
		
		System.out.println(l[0].detalhes());
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
