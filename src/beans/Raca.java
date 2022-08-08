package beans;

public enum Raca {
	PRETO("Preto"), PARDO("Pardo"),
	BRANCO("Branco"), AMARELO("Amarelo"),
	INDIGENA("Indigena");
	
	private String raca;
	
	Raca (String raca){
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
