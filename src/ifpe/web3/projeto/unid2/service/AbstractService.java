package ifpe.web3.projeto.unid2.service;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@Dependent
public abstract class AbstractService<T> {

	
	private EntityManager manager;
	
	public AbstractService() {
		
		if(manager == null)
		manager = Persistence.createEntityManagerFactory("sistema-cadastro-departamento").createEntityManager();

	}

	public boolean salvar(T obj) {

		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

		return true;
	}

	public boolean excluir(T obj) {

		manager.getTransaction().begin();
		manager.remove(obj);
		manager.getTransaction().commit();

		return true;
	}

	public boolean alterar(T obj) {

		manager.getTransaction().begin();
		manager.merge(obj);
		manager.getTransaction().commit();

		return true;
	}

	public abstract List<T> encontrarTodos();

	public abstract T encontrar(Long id);

	public abstract T novo();

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}
