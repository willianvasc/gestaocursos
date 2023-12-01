package entities;

public class Pessoas {
	private String nome;
	private String cpf;
	private String matricula;
	

    // Getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Setter para 'nome'
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    // Getter para 'cpf'
    public String getCpf() {
        return cpf;
    }

    // Setter para 'cpf'
    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }
    
    // Getter para 'matricula'
    public String getMatricula() {
        return matricula;
    }

    // Setter para 'matricula'
    public void setMatricula(String novoMatricula) {
        this.matricula = novoMatricula;
    }
}
