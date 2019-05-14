package ifpe.web3.projeto.unid2.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ifpe.web3.projeto.unid2.enums.TipoPonto;

/**
 * Entity implementation class for Entity: PontoEletronico
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "ponto_eletronico")
public class PontoEletronico extends AbstractEntity<Long> implements Serializable {

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "funcionario_ponto")
	private Funcionario funcionario;
	
	@Column(name = "data_ponto")
	@Temporal(TemporalType.DATE)
	private Date dataPonto;
	
	@Column(name = "hora_ponto")
	@Temporal(TemporalType.TIME)
	private Date horaPonto;
	
	@Column(name = "tipo_ponto", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoPonto tipoPonto;
	
	
	public PontoEletronico() {
		super();
	}
	
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}   
	public Date getDataPonto() {
		return this.dataPonto;
	}

	public void setDataPonto(Date dataPonto) {
		this.dataPonto = dataPonto;
	}   
	public Date getHoraPonto() {
		return this.horaPonto;
	}

	public void setHoraPonto(Date horaPonto) {
		this.horaPonto = horaPonto;
	} 
	
	public TipoPonto getTipoPonto() {
		return this.tipoPonto;
	}

	public void setTipoPonto(TipoPonto tipoPonto) {
		this.tipoPonto = tipoPonto;
	}
   
}
