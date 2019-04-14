package ifpe.web3.projeto.unid2.modelo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@SuppressWarnings("serial")
@MappedSuperclass
@SequenceGenerator(name="entidade_seq", sequenceName="entidade_seq", allocationSize = 1)
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO, generator = "entidade_seq")
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		//Adicionar o <?> para evitar o lançamento de exceção (a exclamação>
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		
		if (id == null) {
			
			if (other.id != null)
				return false;
			
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id;
	}

	
	
}
