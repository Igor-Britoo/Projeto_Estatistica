package beans;

public enum Escolaridade {
	FUNDAMENTAL_COMPLETO("Ensino Fundamental Completo"),
	MEDIO_INCOMPLETO("Ensino Medio Incompleto"),
	MEDIO_COMPLETO("Ensino Medio Completo"),
	SUPERIOR_INCOMPLETO("Ensino Superior Incompleto"),
	SUPERIOR_COMPLETO("Ensino Superior Completo");
	
	private String escolaridade;
	
	Escolaridade(String escolaridade){
		this.escolaridade = escolaridade;
	}
	
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
}
