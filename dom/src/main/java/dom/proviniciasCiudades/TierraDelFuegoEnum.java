package dom.proviniciasCiudades;

public enum TierraDelFuegoEnum {

	Usuahia("Usuahia");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private TierraDelFuegoEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}