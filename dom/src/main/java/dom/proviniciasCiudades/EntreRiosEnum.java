package dom.proviniciasCiudades;

public enum EntreRiosEnum {

	Parana("Paraná");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private EntreRiosEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}