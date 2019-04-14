package ifpe.web3.projeto.unid2.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ifpe.web3.projeto.unid2.service.CargoService;

@Named
@RequestScoped
public class CargoController {

	@Inject
	private CargoService service;

	public CargoService getService() {
		return service;
	}

}
