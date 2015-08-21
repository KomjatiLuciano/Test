package dom.proviniciasCiudades;

public enum CordobaEnum {

	Cordoba("Cordoba");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private CordobaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}