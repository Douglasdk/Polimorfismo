package view;

	import model.Pessoa;
	import model.PessoaFisica;
	import model.PessoaJuridica;

public class Execucao {
	public static void main(String args[]) {
		//Pessoa  pessoa = new Pessoa ();
		PessoaFisica pf = new PessoaFisica ();
		PessoaJuridica pj = new PessoaJuridica ();
		
		pf.setNome("Douglas");
		System.out.println (pf.getNome());
		pf.falar();
		
		pj.setRazaoSocial("Etec zona leste");
		System.out.println (pj.getRazaoSocial());
		pj.falar();
		
		
	}

}
