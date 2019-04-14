package ifpe.web3.projeto.unid2.producer;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@SuppressWarnings("serial")
@ApplicationScoped
public class ProdutorEntityManager implements Serializable {

	@Produces
	public EntityManager criarEntityManager() {
		return Persistence.createEntityManagerFactory("sistema-cadastro-departamento").createEntityManager();
	}

	public void fechar(@Disposes EntityManager em) {
		
		if (em.isOpen()) {
			em.close();
		}
	}

}
