package ifpe.web3.projeto.unid2.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import ifpe.web3.projeto.unid2.modelo.Departamento;

@RequestScoped
public class DepartamentoService extends AbstractService<Departamento> {

	@SuppressWarnings("unchecked")
	@Override
	public List<Departamento> encontrarTodos() {
		
		return getManager().createNamedQuery("TodosDepartamentos").getResultList();
	}

	@Override
	public Departamento encontrar(Long id) {
		
		return getManager().find(Departamento.class, id);
	}

	@Override
	public Departamento novo() {
		
		return new Departamento();
	}
	


}
