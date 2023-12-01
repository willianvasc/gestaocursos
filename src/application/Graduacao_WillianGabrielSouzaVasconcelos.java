package application;
import entities.Pessoas;
import java.util.ArrayList;
import java.util.Scanner;

public class Graduacao_WillianGabrielSouzaVasconcelos extends Pessoas {
	private ArrayList<String> cursoGraduacao = new ArrayList<>();
	private Pessoas[] listaPessoas;
	private Scanner string = new Scanner(System.in);

	public void addicionaGraduacao() {
		System.out.println("Quantas registros deseja cadastrar? (máximo de 10)");
		int quantidade = Integer.parseInt(string.nextLine());
		if (quantidade > 10) {
			System.out.println("Excedeu o limite de 10 registros. Apenas 10 serão cadastrados.");
			quantidade = 10;
		}

		listaPessoas = new Pessoas[quantidade];
		for (int i = 0; i < quantidade; i++) {
			Pessoas dados = new Pessoas();
			System.out.println("Digite o nome do aluno " + (i + 1) + ":");
			String nome = validarEntrada(string.nextLine());
			dados.setNome(nome);

			System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
			String matricula = validarEntrada(string.nextLine());
			dados.setMatricula(matricula);

			System.out.println("Digite o CPF do aluno " + (i + 1) + ":");
			String cpf = validarEntrada(string.nextLine());
			dados.setCpf(cpf);

			System.out.println("Digite a graduação do aluno " + (i + 1) + ":");
			String curso = validarEntrada(string.nextLine());
			cursoGraduacao.add(curso);

			listaPessoas[i] = dados;
		}
		listarRegistrosGraduacao();
	}
	
	public void listarRegistrosGraduacao() {
		System.out.println("Regristro(s) Graduações cadastradas:");
		int i = 0;
		if (listaPessoas != null) {
			for (Pessoas pessoa : listaPessoas) {
				if (pessoa != null) {
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Matrícula: " + pessoa.getMatricula());
					System.out.println("CPF: " + pessoa.getCpf());
					System.out.println("Graduação: " + cursoGraduacao.get(i));
					System.out.println("-------------------------");
					i++;
				}
			}
		} else {
			System.out.println("Nenhum registro encontrado.");
		}
	}

	private String validarEntrada(String entrada) {
		while (entrada.trim().isEmpty()) {
			System.out.println("Campo não pode estar vazio. Digite novamente:");
			entrada = string.nextLine();
		}
		return entrada;
	}
}