package dom.proviniciasCiudades;

public enum SantaFeEnum {

	SantaFe("Santa Fe");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private SantaFeEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}