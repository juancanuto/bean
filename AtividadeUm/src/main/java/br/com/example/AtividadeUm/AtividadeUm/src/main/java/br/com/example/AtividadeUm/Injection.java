package br.com.example.AtividadeUm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"br.com.example.AtividadeUm"})
public class Injection {
	
	@Bean(name={"funcionario1"}) //Nao e necessario especificar um nome
	public Funcionario getFuncionario() {
		Empresa funcionario = new Empresa();
		funcionario.setNome("Demaria");
		funcionario.setCnpj(1234567);
		funcionario.setEndereco("Demaria");
		funcionario.setCargo("Desenvolvedor");
		return funcionario;
	}
	


}