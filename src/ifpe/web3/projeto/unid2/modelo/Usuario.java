package ifpe.web3.projeto.unid2.modelo;

import ifpe.web3.projeto.unid2.modelo.AbstractEntity;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "usuarios")

public class Usuario extends AbstractEntity<Long> implements Serializable {

	private String login;
	private String email;
	private String senha;
	private boolean administrador;
	private boolean primeiroLogin;
	@OneToOne(mappedBy = "usuario")
	private Funcionario funcionario;

	public Usuario() {
		super();
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getAdministrador() {
		return this.administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public boolean getPrimeiroLogin() {
		return this.primeiroLogin;
	}

	public void setPrimeiroLogin(boolean primeiroLogin) {
		this.primeiroLogin = primeiroLogin;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
