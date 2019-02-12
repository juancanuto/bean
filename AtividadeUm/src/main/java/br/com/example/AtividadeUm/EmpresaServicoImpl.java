package br.com.example.AtividadeUm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class EmpresaServicoImpl {

	@Autowired
	@Qualifier("funcionario") //Nao e obrigatorio especificar um nome
	private Funcionario funcionario;

	public EmpresaServicoImpl() {
	}
	
	public String ler() {
		return "+ funcionario.getFuncionario() + ";
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}

