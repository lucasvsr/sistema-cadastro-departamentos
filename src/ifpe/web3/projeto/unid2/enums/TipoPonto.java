package ifpe.web3.projeto.unid2.enums;

public enum TipoPonto {
	
	E("Entrada", "E"), A("Almoço", "A"), S("Saída", "S");
	
	private String tipo;
	private String sigla;
	
	TipoPonto(String tipo, String sigla) {
		
		this.tipo = tipo;
		this.sigla = sigla;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
