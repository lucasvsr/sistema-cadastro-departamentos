package ifpe.web3.projeto.unid2.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import ifpe.web3.projeto.unid2.modelo.Funcionario;

@RequestScoped
public class FuncionarioService extends AbstractService<Funcionario> {

	@SuppressWarnings("unchecked")
	@Override
	public List<Funcionario> encontrarTodos() {
		
		return getManager().createNamedQuery("TodosFuncionarios").getResultList();
	}

	@Override
	public Funcionario encontrar(Long id) {
		
		return getManager().find(Funcionario.class, id);
	}

	@Override
	public Funcionario novo() {
		
		return new Funcionario();
	}

}
