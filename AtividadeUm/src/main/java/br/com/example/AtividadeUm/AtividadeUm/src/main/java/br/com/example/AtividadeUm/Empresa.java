package br.com.example.AtividadeUm;

public class Empresa implements Funcionario {
	
	private String nome;
	private int cnpj;
	private String endereco;
	private String cargo;
	
	public Empresa() {
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	/**
	 * Setter para mensagem
	 * @param mensagem
	 */
	@Override
	public String getFuncionario() {
		return "Hello World! Hello " + nome + cnpj + endereco + cargo + "!";
	}

	

	

}
