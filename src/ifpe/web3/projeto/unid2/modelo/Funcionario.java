package ifpe.web3.projeto.unid2.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@NamedQueries({
	
	@NamedQuery(name = "TodosFuncionarios",
				query = "SELECT f FROM Funcionario f"),
	
	@NamedQuery(name = "Demitidos",
				query = "SELECT f FROM Funcionario f WHERE f.dataSaida != NULL")
})
@SuppressWarnings("serial")
@Entity
@Table(name = "Funcionarios")
public class Funcionario extends AbstractEntity<Long> implements Serializable {

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private BigDecimal salario;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataEntrada;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataSaida;
	
	@ManyToOne
	@JoinColumn(name="cargo_id_fk")
	private Cargo cargo;

	public Funcionario() {
		super();
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}   
	public Calendar getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}   
	public Calendar getDataSaida() {
		return this.dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
   
}
