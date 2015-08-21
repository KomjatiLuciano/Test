package dom.proviniciasCiudades;

public enum TucumanEnum {

	SanMiguelDeTucuman("San Miguel de Tucuman");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private TucumanEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}