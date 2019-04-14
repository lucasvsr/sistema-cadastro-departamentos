package ifpe.web3.projeto.unid2.controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ifpe.web3.projeto.unid2.service.DepartamentoService;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class DepartamentoController implements Serializable {

	@Inject
	private DepartamentoService service;

	public DepartamentoService getService() {
		return service;
	}
	

}
