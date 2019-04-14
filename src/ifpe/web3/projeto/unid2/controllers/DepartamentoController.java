package ifpe.web3.projeto.unid2.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ifpe.web3.projeto.unid2.service.DepartamentoService;

@Named
@RequestScoped
public class DepartamentoController {

	@Inject
	private DepartamentoService service;

	public DepartamentoService getService() {
		return service;
	}
	

}
