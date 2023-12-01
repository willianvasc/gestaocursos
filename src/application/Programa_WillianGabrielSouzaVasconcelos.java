package application;
import java.util.Scanner;

public class Programa_WillianGabrielSouzaVasconcelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner string = new Scanner(System.in);
		String escolha;
		Graduacao_WillianGabrielSouzaVasconcelos graduacao = new Graduacao_WillianGabrielSouzaVasconcelos();
		PosGraduacao_WillianGabrielSouzaVasconcelos posgraduacao = new PosGraduacao_WillianGabrielSouzaVasconcelos();

		do {
			System.out.println("Escolha uma opção:\n");
			System.out.println("1-Cadastro Graduação:\n");
			System.out.println("2-Cadastro PosGraduação:\n");
			System.out.println("3-Sair:\n");
			escolha = string.nextLine();

			switch(escolha) {
			case "1":
				System.out.println("Você escolheu 'Cadastro Graduação'!\n");
				graduacao.addicionaGraduacao();
				break;
			case "2":
				System.out.println("Você escolheu 'Cadastro Pós-Graduação'!\n");
				posgraduacao.addicionaPosGraduacao();
				break;
			case "3":
				graduacao.listarRegistrosGraduacao();
				posgraduacao.listarRegistrosPosGraduacao();
				System.out.println("Até mais!\n");
				break;
			default:
				System.out.println("Opção inválida!\n");
				break;
			}

		}while(escolha.equals("2") || escolha.equals("1"));
	}

}


