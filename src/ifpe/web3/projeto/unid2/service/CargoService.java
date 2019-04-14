package ifpe.web3.projeto.unid2.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import ifpe.web3.projeto.unid2.modelo.Cargo;

@RequestScoped
public class CargoService extends AbstractService<Cargo>{

	@SuppressWarnings("unchecked")
	@Override
	public List<Cargo> encontrarTodos() {
		
		return getManager().createNativeQuery("TodosCargos").getResultList();
	}

	@Override
	public Cargo encontrar(Long id) {
		
		return getManager().find(Cargo.class, id);
	}

	@Override
	public Cargo novo() {
		
		return new Cargo();
	}


}
