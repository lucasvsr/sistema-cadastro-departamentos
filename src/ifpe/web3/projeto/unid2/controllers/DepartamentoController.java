package ifpe.web3.projeto.unid2.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ifpe.web3.projeto.unid2.modelo.Departamento;
import ifpe.web3.projeto.unid2.service.DepartamentoService;

@Named
@RequestScoped
public class DepartamentoController {

	@Inject
	private DepartamentoService service;

	public DepartamentoService getService() {
		return service;
	}
	
	public String testarServico() {
		
		Departamento d = service.novo();
		
		d.setNome("Teste");
		service.salvar(d);
		
		System.out.println(service.encontrarTodos().get(0).getNome());
		
		return service.encontrarTodos().get(0).getNome();
	}
	

}
