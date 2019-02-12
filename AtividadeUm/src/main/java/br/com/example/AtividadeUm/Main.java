// Lab BD V
// Aluno : Caroline Sousa Teixeira.

package br.com.example.AtividadeUm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.example.AtividadeUm.Injection;
import br.com.example.AtividadeUm.EmpresaServicoImpl;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Injection.class);
		
		EmpresaServicoImpl obj = (EmpresaServicoImpl) context.getBean(EmpresaServicoImpl.class);
		System.out.println(obj.ler());
		
		Empresa funcionario1 = (Empresa) context.getBean("funcionario1"); 
        System.out.println(funcionario.getFuncionario());
        funcionario1.setNome("Carol");

        

        	
		applicationContext.close();
		
		System.out.println("Fim da Execucao!");
	}

}