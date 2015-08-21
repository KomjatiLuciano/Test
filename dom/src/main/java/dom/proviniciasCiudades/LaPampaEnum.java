package dom.proviniciasCiudades;

public enum LaPampaEnum {

	SantaRosa("Santa Rosa");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private LaPampaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}