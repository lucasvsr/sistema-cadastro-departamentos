package ifpe.web3.projeto.unid2.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Entity implementation class for Entity: Departamento
 *
 */
@NamedQueries({
	
	@NamedQuery(name = "TodosDepartamentos",
				query = "SELECT d FROM Departamento d"),
	
	@NamedQuery(name = "TodosDepartamentosPossuemCargos",
				query = "SELECT d FROM Departamento d WHERE d.cargos != NULL")
})
@SuppressWarnings("serial")
@Entity
@Table(name="Departamentos")
public class Departamento extends AbstractEntity<Long> implements Serializable {

	@NotNull(message = "Informe um nome.")
	@Size(min = 3, max = 60, message = "O nome do departamento deve ter entre {min} e {max} caracteres.")
	@Column(nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
