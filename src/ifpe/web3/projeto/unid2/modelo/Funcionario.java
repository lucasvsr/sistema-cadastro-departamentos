package ifpe.web3.projeto.unid2.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long> implements Serializable {

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private BigDecimal salario;
	
	@Column(name = "data_entrada", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataEntrada;
	
	@Column(name = "data_saida")
	@Temporal(TemporalType.DATE)
	private Date dataSaida;
	
	@ManyToOne
	@JoinColumn(name="funcionario_cargo")
	private Cargo cargo;
	
	@OneToMany(mappedBy = "funcionario")
	private List<PontoEletronico> pontos;

	@OneToOne
	private Endereco endereco;
	
	@OneToOne
	private Usuario usuario;

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
	public Date getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}   
	public Date getDataSaida() {
		return this.dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public List<PontoEletronico> getPontos() {
		return pontos;
	}
	
	public void setPontos(List<PontoEletronico> pontos) {
		this.pontos = pontos;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
