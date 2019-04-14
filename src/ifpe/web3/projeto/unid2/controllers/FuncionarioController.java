package ifpe.web3.projeto.unid2.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ifpe.web3.projeto.unid2.service.FuncionarioService;

@Named
@RequestScoped
public class FuncionarioController {

	@Inject
	private FuncionarioService service;

	public FuncionarioService getService() {
		return service;
	}

}
